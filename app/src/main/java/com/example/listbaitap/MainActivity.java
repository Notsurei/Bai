package com.example.listbaitap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.cler);


        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Koi","KoiNguyen123",R.drawable.image));
        items.add(new Item("Hieu","HieuTran123",R.drawable.image));
        items.add(new Item("Khoa","KhoaNguyen123",R.drawable.image));
        items.add(new Item("An","AnVu123",R.drawable.image));
        items.add(new Item("Ha","HaLa123",R.drawable.image));
        items.add(new Item("Dung","DungNguyen123",R.drawable.image));
        items.add(new Item("Thanh","ThanhNguyen123",R.drawable.image));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}