package dev.credit.creditsystem.repository;

import dev.credit.creditsystem.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CreditRepository extends JpaRepository<Credit, Long> {



}
