package equals;

import java.util.Objects;

public class Pays {
    private String name;
    private int population;

    public Pays(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }



    @Override
    public String toString() {
        return "name='" + name +
                " population=" + population ;
    }

    @Override
    public boolean equals(Object obj) {
       
        // teste aussi le cas ou obj est null
        if (!(obj instanceof Pays autre)) {
            return false;
        }

        return this.getName().equals(autre.getName()) && this.population == autre.getPopulation();

    }
    public String getName() {
        return name;
    }
}

