package com.takeoffandroid.googlebooksapi.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.gson.JsonElement;
import com.takeoffandroid.googlebooksapi.R;
import com.takeoffandroid.googlebooksapi.adapters.BookListAdapter;
import com.takeoffandroid.googlebooksapi.adapters.RetrofitUtils;
import com.takeoffandroid.googlebooksapi.apicalls.BooksAPIService;
import com.takeoffandroid.utils.Constants;
import com.takeoffandroid.utils.Utils;
import com.takeoffandroid.googlebooksapi.models.books.AbstractBooks;
import com.takeoffandroid.googlebooksapi.models.books.Items;
import com.takeoffandroid.googlebooksapi.views.DividerItemDecoration;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * An activity representing a list of Books. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class MainActivity extends AppCompatActivity {


    private BookListAdapter mAdapter;

    private RecyclerView mRecyclerView;

    private TextView txtEmpty;

    private BooksAPIService mBooksVolumesService;

    private SwipeRefreshLayout mSwipeRefreshLayout;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        initToolbar();


        mRecyclerView.addItemDecoration(
                new DividerItemDecoration(MainActivity.this, R.drawable.divider_recyclerview));


        mBooksVolumesService = RetrofitUtils.createRetrofitService(Constants.BASE_URL_BOOK_LIST, BooksAPIService.class);


        fetchShakespeareBookList(Constants.GET_SHAKESPEARE_BOOKS);


        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // Refresh items
                fetchShakespeareBookList(Constants.GET_SHAKESPEARE_BOOKS);
            }
        });

    }

    private void initToolbar() {
        setSupportActionBar(mToolbar);
        mToolbar.setTitle(getTitle());
        mToolbar.setTitleTextColor(Color.WHITE);
    }

    private void findViews() {
        txtEmpty = (TextView) findViewById(R.id.text_empty);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mRecyclerView = (RecyclerView) findViewById(R.id.book_list);

        mSwipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.swipeRefreshLayout);
    }


    private void setAdapter(ArrayList<Items> itemsArrayList) {
        mAdapter = new BookListAdapter(this, itemsArrayList);
        mRecyclerView.setAdapter(mAdapter);
    }


    private void fetchShakespeareBookList(String query) {

        HashMap<String, String> queryMap = new HashMap<>();

        queryMap.put("q", query);

        Call<JsonElement> call = mBooksVolumesService.getVolumes(Constants.APPEND_URL_BOOK_LIST,queryMap);

        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {

                if (response.isSuccessful()) {
                    AbstractBooks abstractBooks = Utils.buildResponseObjectFromJSONElement(response.body(), AbstractBooks.class);

                    setAdapter(abstractBooks.getItems());

                    updateRecyclerViewVisibility(abstractBooks.getItems());

                    stopRefreshing();
                }
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {


                updateRecyclerViewVisibility(new ArrayList<Items>());

                stopRefreshing();


            }
        });
    }

    private void stopRefreshing() {
        mSwipeRefreshLayout.setRefreshing(false);
    }

    private void updateRecyclerViewVisibility(ArrayList<Items> items) {


        mRecyclerView.setVisibility(items != null && items.size() > 0 ? View.VISIBLE : View.GONE);
        txtEmpty.setVisibility(items != null && items.size() > 0 ? View.GONE : View.VISIBLE);
    }
}
