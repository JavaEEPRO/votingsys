package si.inspired.votingsys.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import si.inspired.votingsys.persistence.model.Restaurant;
import si.inspired.votingsys.persistence.model.Role;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    Restaurant findByName(String name);

    @Override
    void delete(Restaurant restaurant);

}