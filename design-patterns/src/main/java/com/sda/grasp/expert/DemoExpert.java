package com.sda.grasp.expert;

public class DemoExpert {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest();
//        Controller controller = new Controller(); // varianta initiala
        Database database = new Database();
        AuthenticationModule authenticationModule = new AuthenticationModule(database);
        Controller controller = new Controller(authenticationModule);

        controller.authenticateUser(loginRequest);
    }
}
