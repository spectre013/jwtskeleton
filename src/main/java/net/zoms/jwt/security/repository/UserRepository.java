package net.zoms.jwt.security.repository;

import net.zoms.jwt.security.security.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
}
