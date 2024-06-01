package co.com.qa.quipux.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    // Getters and Setters
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phoneNumber;
    private String id;

    // Constructor
    public User(String firstName, String lastName, String password, String email, String phoneNumber, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }



}
