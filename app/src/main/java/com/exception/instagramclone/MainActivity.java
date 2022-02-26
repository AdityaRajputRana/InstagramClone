package com.exception.instagramclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.exception.instagramclone.Adapters.HighlightAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpHighlights();
    }

    private void setUpHighlights() {
        RecyclerView highligtRV = findViewById(R.id.highLightRV);
        highligtRV.setAdapter(new HighlightAdapter(this, 10));
        highligtRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
    }
}