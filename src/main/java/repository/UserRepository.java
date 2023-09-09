package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.User;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByUsername(String username);

	User findByUsername(String username);

	User findBySessionToken(String sessionToken);


	

}
