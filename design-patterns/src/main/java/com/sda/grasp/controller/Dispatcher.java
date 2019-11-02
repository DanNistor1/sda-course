package com.sda.grasp.controller;

public class Dispatcher {

    public StudentView studentView;
    public HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public Dispatcher(StudentView studentView, HomeView homeView) {
        this.studentView = studentView;
        this.homeView = homeView;
    }

    public void dispatch(String request) {

        switch (request) {
            case "student":
//                studentView = new StudentView(); // varianta initiala
                studentView.show();
                break;
            case "home":
//                homeView = new HomeView(); // varianta initiala
                homeView.show();
                break;
        }
    }
}
