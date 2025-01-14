package Ex3_MusicFestival;
import java.util.ArrayList;
import MyStuff.Library;

public class Ex3_Main {

    public static void run(){


        ArrayList<Event> allEvents = new ArrayList<>();

        allEvents.add(new MainStageEvent("Walk off the Earth", "music"));
        allEvents.add(new MainStageEvent("Hemple Temple", "music"));
        allEvents.add(new MainStageEvent("Jason's Bing", "music"));
        allEvents.add(new MainStageEvent("Couprie's Tracks", "music"));
        allEvents.add(new MainStageEvent("Vasily's Sigma Boys", "music"));

        allEvents.add(new FoodEvent("Arda's Darda", "Food","Stand 1" ,100));
        allEvents.add(new FoodEvent("Owen's Coals", "Food","Stand 2",200 ));
        allEvents.add(new FoodEvent("Heat Pulse", "Food","Stand 3" ,400));
        allEvents.add(new FoodEvent("Cold Pulse", "Food","Stand 4",650 ));
        allEvents.add(new FoodEvent("Blue's Struuudles", "Food","Stand 5" ,900));

        allEvents.add(new SmallStageEvent("Stone", "Music", "Vocals"));
        allEvents.add(new SmallStageEvent("Gorgonzola", "Music", "Drums"));
        allEvents.add(new SmallStageEvent("Steel", "Music", "Guitar"));
        allEvents.add(new SmallStageEvent("Burst", "Music", "Piano"));
        allEvents.add(new SmallStageEvent("Raclette", "Music", "Bass"));

        allEvents.add(new NonMusicEvent("Corn Run", "Race", "Lot 3"));
        allEvents.add(new NonMusicEvent("Wheat Milling", "Farming", "Lot 5"));
        allEvents.add(new NonMusicEvent("Plum Shun", "Comedy", "Stand 7"));
        allEvents.add(new NonMusicEvent("Grater", "Labour", "Lot 4"));
        allEvents.add(new NonMusicEvent("Homerification", "Art", "Stand 8"));
        ((MainStageEvent)allEvents.get(1)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(1)).addTech("Symphony Orchestra");

        for (int i = 0; i < allEvents.size(); i++) {
            System.out.println(allEvents.get(i).getEventName());
            if(allEvents.get(i) instanceof MainStageEvent){
                ((MainStageEvent)allEvents.get(i)).printTech();
            }




        }


while(true){
    System.out.println("Press 1 to see a specific kind of events\nPress 2 to look for specific event\nPress 3 to add an event\nPress 4 to print all\nPress 5 to exit");
    int choice = Library.input.nextInt();
    Library.input.nextLine();


    if(choice == 1){
        System.out.println("What type of events would you like to see?");
        String answer = Library.input.nextLine();
        for (int i = 0; i < allEvents.size(); i++) {
            if(answer.equalsIgnoreCase(allEvents.get(i).getEventType())){
                System.out.println(allEvents.get(i).printMe());
            }
        }
    }
    if(choice == 2){
        System.out.println("Which event would you like to see?");
        String answer = Library.input.nextLine();
        for (int i = 0; i < allEvents.size(); i++) {
            if(answer.equalsIgnoreCase(allEvents.get(i).getEventName())){
                System.out.println(allEvents.get(i).printMe());
            }
        }
    }
    if(choice == 3){
        System.out.println("What is the name of your event?(ID will automatically be produced)");
        String newEventName = Library.input.nextLine();
        System.out.println("What is the event's type? Type 1 if music, type 2 if food, type 3 if other");
        int newEventType = Library.input.nextInt();
        Library.input.nextLine();
        if(newEventType == 1){
            System.out.println("Where is this band/musician playing? Either small stage or large stage");
            String newEventLoc = Library.input.nextLine();
            if(newEventLoc.toLowerCase().contains("small")){
                System.out.println("This group must be cooperating with the other performers, what will they be doing?");
                String newEventCoop = Library.input.nextLine();
                allEvents.add(new SmallStageEvent(newEventName,"Music",newEventCoop));
            }
            else{
                System.out.println("This group must be playing solo, do they need any tech?");
                String needTech = Library.input.nextLine();
                if(needTech.toLowerCase().contains("y")){
                    String newTech = Library.input.nextLine();
                    allEvents.add(new MainStageEvent(newEventName, "Music"));
                    for (int i = 0; i < allEvents.size(); i++) {
                        if(newEventName.equalsIgnoreCase(allEvents.get(i).getEventName())){
                            ((MainStageEvent)allEvents.get(i)).addTech(newTech);
                        }
                    }
                }
            }

        }
        if(newEventType == 2){
            System.out.println("What is the location of your stand/truck?");
            String newLocation = Library.input.nextLine();
            System.out.println("What is the estimated sales you will be having?");
            double newSales = Library.input.nextDouble();
            Library.input.nextLine();
            allEvents.add(new FoodEvent(newEventName, "Food", newLocation, newSales));

        }

        if(newEventType == 3){

            System.out.println("What is the type of your stand?");
            String newType = Library.input.nextLine();
            System.out.println("What is the location of your event/stand?");
            String newLocation = Library.input.nextLine();
            allEvents.add(new NonMusicEvent(newEventName, newType, newLocation));
        }



    }
    if(choice == 4){
        for (int i = 0; i < allEvents.size(); i++) {
            System.out.println(allEvents.get(i).printMe());
        }
    }
    if(choice == 5){
        break;
    }


}
    }

}
