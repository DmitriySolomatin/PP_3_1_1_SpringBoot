package ru.dsolo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dsolo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
