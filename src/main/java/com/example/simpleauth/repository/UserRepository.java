package com.example.simpleauth.repository;

import java.util.Optional;
import java.util.List;
import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

import com.example.simpleauth.model.User;

@Repository
public interface UserRepository extends CosmosRepository<User, Long> {
	Optional<User> findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);
}
