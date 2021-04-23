package com.example.ambil_untungv21;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MyActivity02 extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = findViewById(R.id.list);
        List<SetData> setData;
        setData = new ArrayList<>();
        setData.add(new SetData(getString(R.string.title_listitems),getString(R.string.description), "https://images.guru/images/2020/08/05/QEoXg.jpg"));
        setData.add(new SetData(getString(R.string.title_listitems),getString(R.string.description),"https://images.guru/images/2020/08/05/QENDx.jpg"));
        setData.add(new SetData(getString(R.string.title_listitems),getString(R.string.description), "https://images.guru/images/2020/08/05/QE5VJ.jpg"));
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.list_items, setData);
        listView.setAdapter(customAdapter);

    }



}
