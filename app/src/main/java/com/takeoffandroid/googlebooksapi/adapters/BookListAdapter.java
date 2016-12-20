package com.takeoffandroid.googlebooksapi.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.takeoffandroid.googlebooksapi.R;
import com.takeoffandroid.googlebooksapi.models.books.Items;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Adapter to feed the MainActivity with books from Google Books API.
 */
public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.ViewHolder> {

    private final Context mContext;


    /**
     * List of books.
     */
    private ArrayList<Items> mItems = new ArrayList<>();

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView listImgBook;
        public final TextView listTxtTitle;
        public final TextView listTxtPublisher;

        public ViewHolder(View view) {
            super(view);
            listImgBook = (ImageView) view.findViewById(R.id.list_img_book);
            listTxtTitle = (TextView) view.findViewById(R.id.list_txt_title);
            listTxtPublisher = (TextView) view.findViewById(R.id.list_txt_publisher);

        }
    }

    public BookListAdapter(Context context, ArrayList<Items> itemsArrayList) {
        this.mContext = context;
        this.mItems = itemsArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_books, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Picasso.with(mContext).load(mItems.get(position).getVolumeInfo().getImageLinks().getSmallThumbnail()).into(holder.listImgBook);
        holder.listTxtTitle.setText(mItems.get(position).getVolumeInfo().getTitle());

        if(!TextUtils.isEmpty(mItems.get(position).getVolumeInfo().getPublisher())) {
            holder.listTxtPublisher.setVisibility(View.VISIBLE);
            holder.listTxtPublisher.setText(mItems.get(position).getVolumeInfo().getPublisher());
        }else{
            holder.listTxtPublisher.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


}
