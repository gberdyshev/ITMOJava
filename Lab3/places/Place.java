package places;
import java.util.ArrayList;
import heroes.Animal;

public record Place (String name, ArrayList<Animal> inhabitants) {
    @Override
    public String toString() {
        return this.name;
    }

    public void whoInPlace() {
        String string = "В" + " " + this.name + " водились: ";
        String ths;
        StringBuilder builder = new StringBuilder();
        for (Animal inhabitant: inhabitants) {
            builder.append(inhabitant);
            builder.append(", ");
            
        }
        ths = builder.toString();
        string = string.concat(ths);
        System.out.println(string);
        
        
    }


}