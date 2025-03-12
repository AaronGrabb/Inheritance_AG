package FamilyTree;
import java.util.ArrayList;

//Jill is so mother
//Her love, pragmatic, true, real
//But, calculated


public class Person {
    public String name;
    public String country;
    public ArrayList<Person> children;
//    public Person[] allChildren;

    public Person(String n, String c){
        name = n;
        country = c;
        children = new ArrayList<>();
//        allChildren = new Person[4];
    }

    public void birth(Person p){
        children.add(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }
}
