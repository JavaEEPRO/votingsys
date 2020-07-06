package si.inspired.votingsys.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import si.inspired.votingsys.persistence.model.Restaurant;
import si.inspired.votingsys.persistence.model.User;
import si.inspired.votingsys.persistence.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    Vote findByRestaurant(Restaurant restaurant);

    Vote findByVoter(User voter);

    @Override
    void delete(Vote role);

}