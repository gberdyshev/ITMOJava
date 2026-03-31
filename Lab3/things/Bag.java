package things;
import java.util.ArrayList;
import interfaces.Breakable;
import exceptions.BagException;


public class Bag extends Thing implements Breakable {
    private ArrayList<Thing> thingsInside;
    private double endurance; // прочность мешка
    
    
    public Bag(String name, ArrayList<Thing> thingsInside) {
        super(name);
        this.thingsInside = thingsInside;
        this.endurance = 1;
    }
    public Bag(String name, ArrayList<Thing> thingsInside, double endurance) {
        super(name);
        this.thingsInside = thingsInside;
        if (endurance > 1 || endurance < 0) {
            throw new IllegalArgumentException("Прочность мешка должна быть в пределах [0;1]");
            }
        this.endurance = endurance;
    }

    public boolean isUsable() {
        if (this.endurance != 0) {
            return true;
        } else {return false;}
    }


    public void addThing(Thing thing) throws BagException{
        isBroke(); // попытались сломать рандомом
        if (isUsable() == true) {
            thingsInside.add(thing);      
        } else {
            throw new BagException();}
        }
          
    public ArrayList<Thing> getListThings() {
        return this.thingsInside;
    }

    public void whatInBag() {
        String string = "В" + " " + getName() + " у него были ";
        String ths;
        StringBuilder builder = new StringBuilder();
        for (Thing thing: thingsInside) {
            builder.append(thing);
            builder.append(", ");
            
        }
        ths = builder.toString();
        string = string.concat(ths);
        System.out.println(string);
    }

    @Override
    public void breakDown(){
        this.thingsInside.clear();
        this.endurance = 0;
    }

    public void isBroke() {
        // проверяем, что ещё не сломан
        if (isUsable() == true) {
        if (Math.random() >= this.endurance) {
            breakDown();
        }}
    }


}