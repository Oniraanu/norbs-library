package com.oniraanu.norbslibrary.repository;

import com.oniraanu.norbslibrary.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Long> {

    Optional <User> findUsersByEmailAddress(String emailAddress);

}
