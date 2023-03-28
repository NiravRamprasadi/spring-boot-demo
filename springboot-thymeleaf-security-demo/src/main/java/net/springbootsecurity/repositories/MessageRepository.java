package net.springbootsecurity.repositories;

import net.springbootsecurity.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ramesh Fadatare
 *
 */
public interface MessageRepository extends JpaRepository<Message, Integer>{

}
