package si.inspired.votingsys.persistence.model;

import si.inspired.votingsys.persistence.model.abstractModel.AbstractBaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vs_vote")
public class Vote extends AbstractBaseEntity {

    @ManyToOne
    private User voter;

    @ManyToOne
    private Restaurant restaurant;

    private LocalDateTime votedAt;
}