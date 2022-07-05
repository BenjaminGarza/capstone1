package com.BenGarza.capstone.Repository;
import com.BenGarza.capstone.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {

    Optional<User> findUserByEmail(String string);
}
