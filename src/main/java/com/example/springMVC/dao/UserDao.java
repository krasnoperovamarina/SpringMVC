package com.example.springMVC.dao;
import com.example.springMVC.models.User;
import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

    public User getUser(int id);

    public void save(User user);

    public void update(int id, User updatedUser);

    public void delete(int id);
}

