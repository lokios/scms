package com.opac.scms;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.opac.scms.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
