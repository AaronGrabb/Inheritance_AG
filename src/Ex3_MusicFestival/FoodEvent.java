package Ex3_MusicFestival;

public class FoodEvent extends NonMusicEvent{

    private int sales;

    public FoodEvent(String name, String type, String location, int s ){
super(name, type, location);
sales = s;

    }
    public void setRent(int r){
        this.rent = (int)(r + 0.1*sales) ;
    }


}
