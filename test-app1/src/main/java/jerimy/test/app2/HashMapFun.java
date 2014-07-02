package jerimy.test.app2;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise!:
 * Use the two static arrays to create a list of PeopleColor objects.
 * Tim is Red, Jerimy is Blue, etc.
 * After you load the objects into a list take that list and use it to load
 * a HashMap<String,PeopleColor> where the key is the person's name.
 * Use the map to get the objects by name and display Tim and Marissa's colors.
 */
public class HashMapFun {

    private static final String[] people = { "Tim","Jerimy","Hollie","Marissa" };
    private static final String[] colors = { "Red","Blue","Orange","Purple" };    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeopleColor o1 = new PeopleColor("bob","black");
        PeopleColor o2 = new PeopleColor("joe","blue");
        if(o1.equals(o2)) {
            
        }
        List<PeopleColor> list = new ArrayList<>();
        list.add(o1);
        if(list.contains(o1)) {
            
        }
        
        //System.out.println(people[0]);
    }
    
}
