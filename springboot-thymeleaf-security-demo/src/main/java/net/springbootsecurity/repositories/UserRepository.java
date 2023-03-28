package net.springbootsecurity.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.springbootsecurity.entities.User;


/**
 * @author Ramesh Fadatare
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

	Optional<User> findByEmail(String email);

}
