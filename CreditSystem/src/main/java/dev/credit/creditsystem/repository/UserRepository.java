package dev.credit.creditsystem.repository;

import dev.credit.creditsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
    User getUserByIdentityNumber(long identityNumber);
}