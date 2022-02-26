package com.exception.instagramclone.Framents;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.exception.instagramclone.Adapters.PhotoRVAdapter;
import com.exception.instagramclone.R;

import java.util.Random;

public class PhotoListFragment extends Fragment {

    int position = 0;


    public PhotoListFragment(int position) {
        this.position = position;
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photo_list, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new PhotoRVAdapter(new Random().nextInt(50), position));
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        return view;
    }
}