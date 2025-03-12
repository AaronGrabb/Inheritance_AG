package FamilyTree;

public class FamilyTreeMain {

public static void run(){
//Gen 0
    Person person1 = new Person("Bobbie", "Mexico");

    //Gen 1
    person1.birth(new Person("Susan", "Canada"));
    person1.birth(new Person("Jill", "Canada"));
    person1.birth(new Person("Bobbette", "Canada"));
    //Gen 2
    person1.children.get(0).birth(new Person("Zain", "Czechya"));
    person1.children.get(1).birth(new Person("Aaron", "North Korea"));
    person1.children.get(2).birth(new Person("Bob III", "Belise"));
    person1.children.get(2).birth(new Person("Jasmine", "Canada"));
    //Gen 3
    person1.children.get(0).children.get(0).birth(new Person("Zain Jr", "Mexico"));
    person1.children.get(0).children.get(0).birth(new Person("Zainette", "Mexico"));
    person1.children.get(2).children.get(0).birth(new Person("Bob IV", "Belise"));
    person1.children.get(2).children.get(1).birth(new Person("Zaiesha", "Canada"));
    person1.children.get(2).children.get(1).birth(new Person("Steve", "USA"));
    person1.children.get(1).children.get(0).birth(new Person("Arda", "Turkey"));

    printFamily(person1.children.get(0));
    System.out.println("Num of Family: " + countFamily(person1));

}//run

    public static void printFamily(Person pTemp){

        System.out.println(pTemp.getName());

        for (int i = 0; i < pTemp.children.size(); i++) {

        printFamily(pTemp.children.get(i));

        }


    }


    public static int countFamily(Person pTemp){
int num = 1;
        for (int i = 0; i < pTemp.children.size(); i++) {
            num += countFamily(pTemp.children.get(i));
        }

return num;
    }


}
