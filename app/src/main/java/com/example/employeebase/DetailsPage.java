package com.example.employeebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);

        ImageView image = findViewById(R.id.imageEmployee);
        TextView empName = findViewById(R.id.nameEmployee);
        TextView position = findViewById(R.id.posit);
        TextView phoneNum = findViewById(R.id.phoneNum);
        TextView projects = findViewById(R.id.projects);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int empImg = bundle.getInt("personImage");
            String name = bundle.getString("name");
            String empPos = bundle.getString("position");
            String phoneNumber = bundle.getString("phoneNumber");
            String projct = bundle.getString("projects");

            image.setImageResource(empImg);
            empName.setText(name);
            position.setText(empPos);
            phoneNum.setText(phoneNumber);
            projects.setText(projct);
        }
    }
}