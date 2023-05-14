package com.example.employeebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userlist;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();
        initRecyclerView();

    }

    private void initData() {

        userlist = new ArrayList<>();
        userlist.add(new ModelClass(R.drawable.ic_launcher_background, "Md. Fatin Faiaz Isty", "Jr. Software Engineer", "01728503056", "DAM, Employee Base"));
        userlist.add(new ModelClass(R.drawable.ic_launcher_background, "Md. Rakibur Rahman", "Software Engineer", "01892797345", "DAM, Hospital Project"));
        userlist.add(new ModelClass(R.drawable.ic_launcher_background, "Mark", "Developer", "1020203030303", "Project"));
        userlist.add(new ModelClass(R.drawable.ic_launcher_background, "Neesham", "Engineer", "162728782288", "New Project"));
        userlist.add(new ModelClass(R.drawable.ic_launcher_background, "Sarah", "Writer", "8282728282882", "Secondary Project"));
        userlist.add(new ModelClass(R.drawable.ic_launcher_background, "Little", "Developer", "098839398383", "Medium Project"));
        userlist.add(new ModelClass(R.drawable.ic_launcher_background, "Penduras", "Engineer", "8377466477388", "Secondary Project"));
        userlist.add(new ModelClass(R.drawable.ic_launcher_background, "Medium", "Developer", "3009300939384", "Regulation Project"));

    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.listEmployee);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userlist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}