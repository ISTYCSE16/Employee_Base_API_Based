package com.example.employeebase;

import android.view.Display;

public class ModelClass {

    private int imageView;
    private String name;
    private String position;
    private String phoneNumber;

    private String projects;
    ModelClass(int imageView, String name, String position, String phoneNumber, String projects) {

        this.imageView = imageView;
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.projects = projects;
    }

    public int getImageView() {
        return imageView;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getProjects() { return projects; }

}
