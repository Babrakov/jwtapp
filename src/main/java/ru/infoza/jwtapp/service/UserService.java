package ru.infoza.jwtapp.service;

import ru.infoza.jwtapp.model.User;

import java.util.List;

/**
 * Service interface for class {@link User}.
 *
 * @author Sergei Babrakov
 * @version 1.0
 */

public interface UserService {

    User register(User user);

    List<User> getAll();

    User findByUsername(String username);

    User findById(Long id);

    void delete(Long id);
}
