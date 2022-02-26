package com.exception.instagramclone.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;

import com.exception.instagramclone.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HighlightAdapter extends RecyclerView.Adapter<HighlightAdapter.HHolder> {
    Context context;
    int size =0;

    public HighlightAdapter(Context context, int size) {
        this.context = context;
        this.size = size;
    }

    @Override
    public HHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_h, parent, false);
        return new HHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HighlightAdapter.HHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return size;
    }

    class HHolder extends RecyclerView.ViewHolder{

        public HHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
