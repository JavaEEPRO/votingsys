package si.inspired.votingsys.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import si.inspired.votingsys.persistence.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);

}