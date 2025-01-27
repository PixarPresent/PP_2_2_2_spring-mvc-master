package web.service;

import web.model.User;
import web.repository.UserRepository;
import web.repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public User readUser(long id) {
        return userRepository.readUser(id);
    }

    @Override
    public User deleteUser(long id) {
        return userRepository.deleteUser(id);
    }
}
