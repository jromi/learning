package jerimy.test.app2;

import java.util.ArrayList;
import java.util.HashMap;
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
        
        List<PeopleColor> list = new ArrayList<>();
        for (int i=0; i<people.length; i++) {
            
            list.add(new PeopleColor(people[i], colors[i]));
            System.out.println(list.get(i));
        }
        
        for (PeopleColor list1 : list) {
            if ("Tim".equals(list1.getName())) {
                System.out.println("Tim's Color is: " + list1.getColor());
            }
            
            if ("Marissa".equals(list1.getName())) {
                System.out.println("Marrisa's Color is: " + list1.getColor());
            }
        }
        HashMap<String, PeopleColor> myMap = new HashMap<>();
        
        for (PeopleColor list1 : list) {
            myMap.put(list1.getName(), list1);
        }
        String person = "Tim";
        String person2 = "Marissa";
        System.out.println(myMap.values());
        System.out.println(myMap);
        System.out.println(person + "'s color is: " + myMap.get(person).getColor());
        System.out.println(person2 + "'s color is: " + myMap.get(person2).getColor());
        //System.out.println(people[0]);
    }
    
}
