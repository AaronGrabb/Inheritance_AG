package Ex3_MusicFestival;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
        allEvents.add(new FoodEvent("Heat Pulse", "Food","Stand 1" ,400));
        allEvents.add(new FoodEvent("Owen's Coals", "Food","Stand 2",650 ));
        allEvents.add(new FoodEvent("Arda's Darda", "Food","Stand 1" ,900));
        ((MainStageEvent)allEvents.get(1)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(1)).addTech("Symphony Orchestra");

        for (int i = 0; i < allEvents.size(); i++) {
            System.out.println(allEvents.get(i).getEventName());
            if(allEvents.get(i) instanceof MainStageEvent){
                ((MainStageEvent)allEvents.get(i)).printTech();
            }




        }



    }

}
