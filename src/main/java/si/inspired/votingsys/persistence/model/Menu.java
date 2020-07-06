package si.inspired.votingsys.persistence.model;

import si.inspired.votingsys.persistence.model.abstractModel.AbstractBaseEntity;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name = "vs_menu")
public class Menu extends AbstractBaseEntity {

    @ManyToOne
    private User author;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "vs_menus_dishes", joinColumns = @JoinColumn(name = "menu_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "vs_dish_id", referencedColumnName = "id"))
    private Collection<Dish> dishes;

    private LocalDateTime whenAdded;

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Collection<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Collection<Dish> dishes) {
        this.dishes = dishes;
    }

    public LocalDateTime getWhenAdded() {
        return whenAdded;
    }

    public void setWhenAdded(LocalDateTime whenAdded) {
        this.whenAdded = whenAdded;
    }
}