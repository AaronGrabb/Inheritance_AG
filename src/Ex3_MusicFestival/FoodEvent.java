package Ex3_MusicFestival;

public class FoodEvent extends NonMusicEvent{

    private int sales;

    public FoodEvent(String name, String type, String location, int s ){
super(name, type, location);
sales = s;

    }

//    public String printMe(){
//        return "ID: " + eventID + " Name: " +eventName + " Location: " + location + " Time: " + time;
//    }

    public void setRent(int r){
        this.rent = (int)(r + 0.1*sales) ;
    }


}
