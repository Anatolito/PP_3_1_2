package ru.anatolito.PP_3_1_2.services;

import ru.anatolito.PP_3_1_2.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(int id);

    void saveUser(User user);

    void deleteUser(int id);
}

