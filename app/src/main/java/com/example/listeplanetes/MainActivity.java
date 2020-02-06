package com.example.listeplanetes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    PlaneteAdapter adapter;

    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listView);
        this.data = new Data();
        adapter = new PlaneteAdapter(this, data);
        listview.setAdapter(adapter);
    }
}
