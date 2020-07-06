package si.inspired.votingsys.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import si.inspired.votingsys.persistence.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    Menu findByAuthor(Long authorId);

    @Override
    void delete(Menu menu);
}