package ru.anatolito.PP_3_1_2.models;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userId;

    @Column(name = "name", nullable = false, length = 30)
    private String userName;

    @Column(name = "surname", nullable = false, length = 30)
    private String userSurname;

    @Column(name = "age")
    private int userAge;

    public User() {
    }

    public User(String name, int age) {
        this.userName = name;
        this.userAge = age;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
        this.userId = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int age) {
        this.userAge = age;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String surname) {
        this.userSurname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && userAge == user.userAge && Objects.equals(userName, user.userName) && Objects.equals(userSurname, user.userSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userSurname, userAge);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
