package polytech.ADCE.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import polytech.ADCE.user.models.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
