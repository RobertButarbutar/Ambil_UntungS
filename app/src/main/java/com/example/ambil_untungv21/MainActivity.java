package com.example.ambil_untungv21;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //_____________________________________________________________________________________________________
    private BottomNavigationView bottomNavigationView;
    ListView listView;
    //_____________________________________________________________________________________________________
    //_____________________________________________________________________________________________________
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
    //_____________________________________________________________________________________________________
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //_____________________________________________________________________________________________________


        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter=new RecyclerViewAdapter(arr);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);

        //_____________________________________________________________________________________________________
        //system ini digunakan pada navigator tombol
        bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Home_Fragment()).commit();
        //_____________________________________________________________________________________________________
        //sytem ini digunakan pada listview.

        listView = findViewById(R.id.list);

        List<SetData> setData;

        setData = new ArrayList<>();

        setData.add(new SetData(getString(R.string.title_listitems),getString(R.string.description), "https://images.guru/images/2020/08/05/QEoXg.jpg"));

        setData.add(new SetData(getString(R.string.title_listitems),getString(R.string.description), "https://images.guru/images/2020/08/05/QENDx.jpg"));

        setData.add(new SetData(getString(R.string.title_listitems),getString(R.string.description), "https://images.guru/images/2020/08/05/QE5VJ.jpg"));

        setData.add(new SetData(getString(R.string.title_listitems),getString(R.string.description), "https://images.guru/images/2020/08/05/QEoXg.jpg"));

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.list_items, setData);

        listView.setAdapter(customAdapter);
        //_____________________________________________________________________________________________________
        //_____________________________________________________________________________________________________
    }
    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;

            switch (item.getItemId())
            {
                case R.id.home:
                    fragment =new Home_Fragment();
                    break;

                case R.id.category:
                    fragment = new Category_Fragment();
                    break;

                case R.id.search:
                    fragment = new Search_Fragment();
                    break;

                case R.id.statistic:
                    fragment = new Statistic_Fragment();
                    break;

                case R.id.account:
                    fragment = new AccountFragment();
                    break;


            }
            assert fragment != null;
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
            return true;
        }
    };
//_____________________________________________________________________________________________________
}