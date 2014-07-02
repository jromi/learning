package jerimy.test.app2;

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
    public String toString() {
        return "PeopleColor{" + "name=" + name + ", color=" + color + '}';
    }
        
    
}
