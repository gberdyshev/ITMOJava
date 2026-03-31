package heroes;
import places.Place;
import enums.StatusEmotion;

public class Human extends Hero {

    public Human(String name) {
        super(name);
    }

    public void know(boolean flag, String knowledge) {
        if (flag == true) {
            System.out.println(super.getName() + " знал " + knowledge);

        } else {
            System.out.println(super.getName() + " не знал " + knowledge);

        }

    }

    // помнил
    public void remember(StatusEmotion status, String memory) {
        System.out.println(super.getName() + " " + status + " помнил " + memory);
    }

    // верить
    public String believe(String whatever) {
        return "верить " + whatever;
    }

    // сомневаться
    public String doubt(String whatever) {
        return " " + whatever + " или нет";
    }

    // пошёл
    @Override
    public void move(Place p) {
        System.out.println("Пошёл в" + " " + p);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;
        Human other = (Human) otherObject;
        return getName().equals(other.getName()) && getStatement().equals(other.getStatement());       
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}