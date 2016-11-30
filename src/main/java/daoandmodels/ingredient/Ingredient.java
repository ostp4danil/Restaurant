package daoandmodels.ingredient;

/**
 * Created by Danil-MAC on 11/29/16.
 */
public class Ingredient {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                '}';
    }
}
