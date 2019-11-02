package com.sda.randomizer;

import java.util.Scanner;

public class RandomizerApp {

    public static void main(String[] args) {

        // create application objects
        PersonRepository personRepository = new PersonRepository();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        // manual instantiation
        // MainController mainController = new MainController();

        // dependency injection
        MainController mainController = new MainController(personRepository, sc, menu);

        // display menu
        menu.buildMenu();

        // grab user input
        int option = sc.nextInt();

        // redirect option to the appropiat object
        mainController.dispatch(option);

        // load data

        // present


    }
}
