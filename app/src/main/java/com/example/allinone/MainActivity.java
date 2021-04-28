package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PostAdapter.OnListItemClickListener {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.hasFixedSize();


        List<PostItem> postItemList = new ArrayList<>();

        postItemList.add(new PostItem("Corona ", R.drawable.coffee1));
        postItemList.add(new PostItem("sucks", R.drawable.coffee2));
        postItemList.add(new PostItem("so", R.drawable.meme1));
        postItemList.add(new PostItem("very", R.drawable.meme2));
        postItemList.add(new PostItem("fucking", R.drawable.meme3));
        postItemList.add(new PostItem("super", R.drawable.meme4));
        postItemList.add(new PostItem("duper", R.drawable.meme5));
        postItemList.add(new PostItem("uber", R.drawable.meme6));
        postItemList.add(new PostItem("much", R.drawable.meme1));
        postItemList.add(new PostItem("mega", R.drawable.meme2));
        postItemList.add(new PostItem("ass", R.drawable.meme3));
        postItemList.add(new PostItem("Idunno", R.drawable.meme4));

        PostAdapter postAdapter = new PostAdapter(postItemList, this);
        recyclerView.setAdapter(postAdapter);

    }

    @Override
    public void onClick(int position) {

        if (position == 0)
        {
            Intent intent = new Intent(MainActivity.this, SpinnerFragment.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Position of item: " + position, Toast.LENGTH_SHORT).show();
        }
    }
}