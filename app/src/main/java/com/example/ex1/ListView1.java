package com.example.ex1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListView1 extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview1);
        listView= findViewById(R.id.listView1);
        String[] st = getResources().getStringArray(R.array.tech);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listview1, st);
        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(ListView1.this, adapter.getItem(i).toString(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
