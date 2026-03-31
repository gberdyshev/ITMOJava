package heroes;
import places.Place;
import interfaces.Movable;
import enums.*;

public abstract class Hero implements Movable {
    private String name;
    private Status statement;

    public Hero(String name, Status statement) {
        this.name = name;
        this.statement = statement;
    }
    public Hero(String name) {
        this.name = name;
        this.statement = Status.ALIVE;
    }

    public String getName() {
        return this.name;
    }

    public Status getStatement() {
        return this.statement;
    }

    public void setStatement(Status statement) {
        this.statement = statement;

    }
    @Override
    public String toString() {
        return this.name;

    }


    public abstract void move(Place p);

}