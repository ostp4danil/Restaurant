package daoandmodels.menu;

import daoandmodels.dish.Dish;

import java.util.List;


public class Menu {

    private MenuType type;
    private List<Dish> dishList;

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
