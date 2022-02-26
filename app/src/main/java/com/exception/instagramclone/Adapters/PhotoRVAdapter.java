package com.exception.instagramclone.Adapters;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.exception.instagramclone.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhotoRVAdapter extends RecyclerView.Adapter<PhotoRVAdapter.PhotoHolder> {

    int size;
    int type;

    public PhotoRVAdapter(int size, int position) {
        this.size = size;
        this.type = type;
    }

    @Override
    public PhotoHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new PhotoHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.item_rv_img, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull  PhotoRVAdapter.PhotoHolder holder, int position) {
        String link = "https://picsum.photos/200/300?random=" + String.valueOf(position +1 + type*50);
        Picasso.get()
                .load(link)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class PhotoHolder extends RecyclerView.ViewHolder{
        ImageView imageView;

        public PhotoHolder(@NonNull  View itemView) {
            super(itemView);
            imageView = (ImageView) itemView;
        }
    }
}
