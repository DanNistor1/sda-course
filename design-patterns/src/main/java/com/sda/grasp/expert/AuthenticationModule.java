package com.sda.grasp.expert;

// the expert in authentication
public class AuthenticationModule {

    private Database database;

    public AuthenticationModule() {
        database = new Database();
    }

    public AuthenticationModule(Database database) {
        this.database = database;
    }

    public void authenticate(LoginRequest loginRequest) {
        if (database.userExists(loginRequest.getUserName()) && database.passwordIsValid(loginRequest.getPassword())){
            System.out.println("Login successful!");
        }
    }
}
