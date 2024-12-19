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

        allEvents.add(new SmallStageEvent("Bon joy", "Stone", "Vocals"));
        allEvents.add(new SmallStageEvent("5 Way mac & cheese", "Gorgonzola", "Drums"));
        allEvents.add(new SmallStageEvent("BucketFace", "Steel", "Guitar"));
        allEvents.add(new SmallStageEvent("Weekdays", "Burst", "Piano"));
        allEvents.add(new SmallStageEvent("Raclette", "Queso", "Bass"));

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
    System.out.println("Press 1 to see all events\nPress 2 to add an event\nPress 3 to filter and print\nPress 4 to exit");
    String choice = Library.input.nextLine();
}
    }

}
