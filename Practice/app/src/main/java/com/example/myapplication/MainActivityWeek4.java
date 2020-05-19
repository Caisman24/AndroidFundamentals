package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivityWeek4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week4);

        // Get the data source
        DataSource dataSource = new DataSource();
        List<String> carList = dataSource.getCars();

        // Initialize recycler view
        RecyclerView recyclerView = findViewById(R.id.carListView);

        //Initialize the linear layout manager -> handles organization of UI components in a View
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        // Set linear layout manager to recycler view
        recyclerView.setLayoutManager(layoutManager);

        // Initialize recycler view adapter with car list (data source)
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(carList);

        // Set recycler view adapter to recycler view
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
