package com.example.ambil_untungv21;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyActivity03 extends AppCompatActivity {
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    int []arr={R.drawable.pic1,R.drawable.pic2,
            R.drawable.pic3,R.drawable.pic4,
            R.drawable.pic5,R.drawable.pic6,
            R.drawable.pic7,R.drawable.pic8,
            R.drawable.pic9,R.drawable.pic10,
            R.drawable.pic11,R.drawable.pic12,
            R.drawable.pic13,R.drawable.pic14,
            R.drawable.pic15};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter=new RecyclerViewAdapter(arr);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);
    }

}
