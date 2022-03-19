package com.hendisantika.service;

import com.hendisantika.model.User;
import com.hendisantika.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : simple-reservation-system
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/03/22
 * Time: 09.08
 * To change this template use File | Settings | File Templates.
 */

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User get(final Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public User getUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    public Long create(final User user) {
        return userRepository.save(user).getId();
    }

    public void update(final Long id, final User user) {
        final User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        existingUser.setUsername(user.getUsername());
        existingUser.setFullName(user.getFullName());
        userRepository.save(existingUser);
    }

    public void delete(final Long id) {
        userRepository.deleteById(id);
    }
}
