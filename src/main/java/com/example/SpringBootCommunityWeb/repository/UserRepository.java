package com.example.SpringBootCommunityWeb.repository;

import com.example.SpringBootCommunityWeb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

}
