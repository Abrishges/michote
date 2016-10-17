package com.michote.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahder on 10/15/16.
 */

@Entity
@Table(name = "users")
public class User {

    // An autogenerated userId (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    // The user's email
    @NotNull
    private String email;

    // The user's password
    @NotNull
    private String password;

    // The user's firstName
    private String firstName;

    // The user's lastName
    private String lastName;

    // The user's phoneNo
    private String phoneNo;

    @Embedded
    private HouseAddress houseAddress;

    @OneToMany
    @JoinColumn(name="userId")
    private List<House> houseList = new ArrayList<House>();

    // ------------------------
    // PUBLIC METHODS
    // ------------------------

    public User() { }

    public User(long userId) {
        this.userId = userId;
    }

    public User(String email, String name) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
    }

    // Getter and setter methods


    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long value) {
        this.userId = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    public HouseAddress getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(HouseAddress houseAddress) {
        this.houseAddress = houseAddress;
    }
} // class User
