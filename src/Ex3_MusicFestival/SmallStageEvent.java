package Ex3_MusicFestival;


import java.util.ArrayList;

class SmallStageEvent extends Event{

    private String cooperation;
    ArrayList<String> Bands;
    ArrayList<String> techRequirements;

    public SmallStageEvent(String name, String type, String coop){
        super(name, type);
        cooperation = coop;
        super.setLocation("Main Stage");
        techRequirements = new ArrayList<String>();
        Bands = new ArrayList<String>();
        Bands.add(name);

    }

    public void addTech(String tech) {
        techRequirements.add(tech);
    }



}
