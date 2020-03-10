package com.amikomdeveloper.traditionalfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFoods;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFoods = findViewById(R.id.rv_food);
        rvFoods.setHasFixedSize(true);

        list.addAll(FoodData.getListData());
        showRecyclerList();
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecyclerList() {
        rvFoods.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvFoods.setAdapter(listFoodAdapter);

        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Food data) {
                showSelectedFood(data);
            }
        });

    }

    private void showSelectedFood(Food food) {
        Toast.makeText(this, "Kamu memilih " + food.getName(), Toast.LENGTH_SHORT).show();
    }
}
