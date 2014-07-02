package jerimy.test.app2;

import java.util.Objects;

/**
 *
 * @author theider
 */
public class PeopleColor {

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PeopleColor(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PeopleColor other = (PeopleColor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "PeopleColor{" + "name=" + name + ", color=" + color + '}';
    }
        
    
}
