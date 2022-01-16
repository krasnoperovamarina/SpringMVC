package com.example.springMVC.service;
import com.example.springMVC.models.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);
}
