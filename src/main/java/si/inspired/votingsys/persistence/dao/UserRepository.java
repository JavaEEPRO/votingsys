package si.inspired.votingsys.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import si.inspired.votingsys.persistence.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    void delete(User user);

}