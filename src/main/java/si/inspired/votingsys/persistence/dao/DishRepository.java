package si.inspired.votingsys.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import si.inspired.votingsys.persistence.model.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {

        Dish findByName(String name);

        @Override
        void delete(Dish dish);

    }