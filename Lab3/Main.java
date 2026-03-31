import things.Bag;
import things.Thing;
import java.util.ArrayList;
import heroes.Animal;
import places.Place;
import heroes.Cat;
import enums.*;
import heroes.Human;
import exceptions.*;


public class Main {

    public static void main(String[] args) {
        double[] argsDouble = {0, 1};

        if ((args.length == 0) || (args.length > 2)) {
            System.out.println("---Подсказка по аргументам: <Вероятность кота принять это состояние при pretend> <Прочность мешка>---");
        } else {
            for (int i = 0; i < args.length; i++) {
                argsDouble[i] = Double.parseDouble(args[i]);
            }      
        }

        Status example = new Status("ок");
        //System.out.println(example.toString());
        // Создание основных персонажей
        Human owner = new Human("Хозяин кота");
        Cat mainCat = new Cat("кот", argsDouble[0]);

        // Создание вспомогательных персонажей, вещей, локаций
        Bag bag = new Bag("мешок", new ArrayList<>(), argsDouble[1]);
        ArrayList<Animal> animalsInForest = new ArrayList<>();
        animalsInForest.add(new Animal("кролик"));
        Place mystForest = new Place("Заповедный лес", animalsInForest);

        Animal[] animals = {new Animal("крыса"), new Animal("мышь")};

        String bel = owner.believe("этому");
        bel = owner.doubt(bel);
        owner.know(false, bel);
        owner.remember(StatusEmotion.GOOD, mainCat.startedAt("хитрости"));

        mainCat.hunt(animals);
        mainCat.pretend(StatusEmotion.CLEVERLY, Status.DEAD);
        
        mainCat.hangUp("задние лапы");
        
        mainCat.borrow("мука");
        mainCat.help("беда");
        mainCat.receive("всё");
        mainCat.putShoes(StatusEmotion.NOW);
        mainCat.stamp(StatusEmotion.WELLDONE);
 
        mainCat.sling(bag);
             
        mainCat.move(mystForest);
        mystForest.whoInPlace();
        
        try {
            bag.addThing(new Thing("отруби"));
            bag.addThing(new Thing("заячья капуста"));
            bag.whatInBag();
        } catch (BagException e) {
            System.out.println(e.getMessage());
        }
        
    }
}