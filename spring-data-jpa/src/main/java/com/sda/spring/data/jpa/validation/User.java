package com.sda.spring.data.jpa.validation;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Name cannot be empty")
    @Column(name = "name")
    private String name;

    @Email(message = "Email invalid format")
    @Column(name = "email")
    private String email;

    @AssertTrue
    @Column(name = "consent")
    private boolean consent;

    @Size(min = 10, max = 100, message = "Description should be between 10 - 100 characters.")
    @Column(name = "about_me") // se foloseste obligatoriu underscore
    private String aboutMe;

    @Min(value = 18, message = "Age should be at least 18")
    @Max(value = 80, message = "Age should be of maximum 80")
    @Column(name = "age")
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isConsent() {
        return consent;
    }

    public void setConsent(boolean consent) {
        this.consent = consent;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", consent=" + consent +
                ", aboutMe='" + aboutMe + '\'' +
                ", age=" + age +
                '}';
    }
}
