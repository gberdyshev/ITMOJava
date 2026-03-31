package heroes;
import places.Place;

public class Animal extends Hero {

    public Animal(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;
        Animal other = (Animal) otherObject;
        return getName().equals(other.getName()) && getStatement().equals(other.getStatement());       
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public void move(Place p) {
        System.out.println("Переместился в" + " " + p);
    }


}