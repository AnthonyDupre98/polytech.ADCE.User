package polytech.ADCE.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import polytech.ADCE.user.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsUserByUsername(String username);
}
