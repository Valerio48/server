package it.testfinale.infrastruttura.service.user;
import it.testfinale.infrastruttura.object.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getUserByEmail(String email);

    User saveUser(User user);

    List<User> getAllUsers();

    Optional<Object> getUserById(Long id);

    void deleteUser(Long id);
}
