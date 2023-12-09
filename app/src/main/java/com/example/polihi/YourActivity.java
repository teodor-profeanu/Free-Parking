package com.example.polihi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class YourActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FeedAdapter feedAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.feedRecyclerView);

        // Create a LinearLayoutManager or GridLayoutManager based on your needs
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Create and set the adapter
        List<FeedItem> feedItems = new ArrayList<>();
        feedAdapter = new FeedAdapter(this, feedItems);
        recyclerView.setAdapter(feedAdapter);

        // Add items to the adapter
        addFeedItem("Title 1", "Description 1", R.drawable.ic_launcher_background);
        addFeedItem("Title 2", "Description 2", R.drawable.ic_launcher_background);
        // Add more items as needed...
    }

    private void addFeedItem(String title, String description, int imageResId) {
        FeedItem item = new FeedItem(title, description, imageResId);
        feedAdapter.feedItems.add(item);
        feedAdapter.notifyItemInserted(feedAdapter.feedItems.size() - 1);
    }
}

