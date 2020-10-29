package com.example.staggeredrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView postsRecyclerView = findViewById(R.id.postsRecyclerView);
        postsRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));


        // you can also add  images from URL

        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem(R.drawable.ic1));
        postItems.add(new PostItem(R.drawable.ic2));
        postItems.add(new PostItem(R.drawable.ic3));
        postItems.add(new PostItem(R.drawable.ic4));
        postItems.add(new PostItem(R.drawable.ic5));
        postItems.add(new PostItem(R.drawable.ic6));
        postItems.add(new PostItem(R.drawable.ic7));
        postItems.add(new PostItem(R.drawable.ic8));
        postItems.add(new PostItem(R.drawable.ic9));
        postItems.add(new PostItem(R.drawable.ic10));
        postItems.add(new PostItem(R.drawable.ic11));
        postItems.add(new PostItem(R.drawable.ic12));
        postItems.add(new PostItem(R.drawable.ic13));
        postItems.add(new PostItem(R.drawable.ic14));
        postItems.add(new PostItem(R.drawable.ic15));
        postItems.add(new PostItem(R.drawable.ic16));
        postItems.add(new PostItem(R.drawable.ic17));
        postItems.add(new PostItem(R.drawable.ic18));
        postItems.add(new PostItem(R.drawable.ic19));
        postItems.add(new PostItem(R.drawable.ic20));
        postItems.add(new PostItem(R.drawable.ic21));
        postItems.add(new PostItem(R.drawable.ic22));
        postItems.add(new PostItem(R.drawable.ic23));
        postItems.add(new PostItem(R.drawable.ic24));



        postsRecyclerView.setAdapter(new PostsAdapter(postItems));


    }
}
