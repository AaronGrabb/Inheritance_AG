package Ex1_Animals;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;

public class Ex1_Main {

    public static void run(){

        ArrayList<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(new Animal("Peppy") );
        allAnimals.add( new Dog("Scout") );
        allAnimals.add(new Rotweiller( "Rubble" ));
        allAnimals.add( new Shihtzu("Bubbles"));
        allAnimals.add (new Trout( "Slippery" ));
        allAnimals.add (new Camel( "Joseph Jostar", 9 ));

//        for (int i = 0; i < allAnimals.size(); i++) {
//
////            System.out.println(allAnimals.get(i));
//            allAnimals.get(i).talk();
//
//        }

        System.out.println("What's the dog say?");
        for (int i = 0; i < allAnimals.size(); i++) {
            if(allAnimals.get(i) instanceof Dog){
                allAnimals.get(i).talk();
            }

        }

        allAnimals.get(5).talk();
        Animal a = new Rotweiller("Arda");

        a.talk();

    }
}
