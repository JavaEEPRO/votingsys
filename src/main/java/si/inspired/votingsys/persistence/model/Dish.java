package si.inspired.votingsys.persistence.model;

import si.inspired.votingsys.persistence.model.abstractModel.AbstractNamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vs_dish")
public class Dish extends AbstractNamedEntity {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
