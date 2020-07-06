package si.inspired.votingsys.persistence.model;

import si.inspired.votingsys.persistence.model.abstractModel.AbstractNamedEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "vs_restaurant")
public class Restaurant extends AbstractNamedEntity {

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "restaurants_menus", joinColumns = @JoinColumn(name = "restaurant_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "menu_id", referencedColumnName = "id"))
    private Collection<Menu> menus;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "restaurants_votes", joinColumns = @JoinColumn(name = "restaurant_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "vote_id", referencedColumnName = "id"))
    private Collection<Vote> votes;

    public Collection<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Collection<Menu> menus) {
        this.menus = menus;
    }

    public Collection<Vote> getVotes() {
        return votes;
    }

    public void setVotes(Collection<Vote> votes) {
        this.votes = votes;
    }

}
