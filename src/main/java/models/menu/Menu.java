package models.menu;

import models.dish.Dish;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Menu")
public class Menu {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "m_ID")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "m_type")
    private MenuType type;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "ingredient",
            joinColumns = @JoinColumn(name = "d_ID"))
    @Column(name = "dishes")
    private List<Dish> dishList;

    public int getId() {
        return id;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }
}
