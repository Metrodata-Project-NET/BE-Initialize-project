package com.metrodata.initialize_project.repository;

import com.metrodata.initialize_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
