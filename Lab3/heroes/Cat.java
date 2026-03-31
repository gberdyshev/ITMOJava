package heroes;
import enums.*;
import things.Thing;
import places.Place;
import exceptions.CatDeadException;

public class Cat extends Animal {
    private double chanceToChangeStatement; // шанс умереть при pretend
    

    public Cat(String name) {
        super(name);
        this.chanceToChangeStatement = 0;
    }
    public Cat(String name, double chanceToChangeStatement) {
        super(name);
        if (chanceToChangeStatement > 1 || chanceToChangeStatement < 0) {
            throw new IllegalArgumentException("Вероятность смерти должна быть в пределах [0;1]");
            }
        this.chanceToChangeStatement = chanceToChangeStatement;

    }

    // охотиться на
    public void hunt(Animal[] animals) {
        String string = "охотился на ";
        String ths;
        StringBuilder builder = new StringBuilder();
        for (Animal animal: animals) {
            builder.append(animal);
            animal.setStatement(Status.DEAD);
            builder.append(", ");
            
        }
        ths = builder.toString();
        string = string.concat(ths);
        System.out.println(string);
    }

    // прикидываться
    public void pretend(StatusEmotion emotion, Status status) throws CatDeadException {
        if (Math.random() < this.chanceToChangeStatement) {
            this.setStatement(status);
            if (getStatement() == Status.DEAD) {throw new CatDeadException();}
        } else {
            System.out.println(emotion + " прикинулся" + " " + status);
        }
        

    }
    
    // повиснуть на
    public void hangUp(String wherever) {
        System.out.println("Повис на" + " " + wherever);
    }

    // зарыться в
    public void borrow(String wherever) {
        System.out.println("зарыться головой в" + " " + wherever);

    }

    // поможет в
    public void help(String inwhat) {
        System.out.println("Поможет в " + inwhat);
    }

    public void receive(String what) {
        System.out.println("Получил " + what);

    }


    // притопнул
    public void stamp (StatusEmotion status) {
        System.out.println(status + " притопнул");

    }

    // перекинул через плечо
    public void sling(Thing object) {
        System.out.println("Перекинул через плечо" + " " + object);

    }

    // обулся
    public void putShoes(StatusEmotion status) {
        System.out.println(status + " обулся");

    }

    // "пускался на"
    public String startedAt(String inwhat) {
        return getName() + " пускался на " + inwhat;
    }

    @Override
    public void move(Place p) {
        System.out.println("Зашагал в" + " " + p);
    }
}