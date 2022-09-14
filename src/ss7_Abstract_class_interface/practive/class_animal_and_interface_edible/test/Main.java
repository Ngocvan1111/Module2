package ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.test;

import ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.animal.Tiger;
import ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.animal.Animal;
import ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.animal.Chicken;
import ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.edible.Edible;
import ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.fruit.Apple;
import ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.fruit.Fruit;
import ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
//        Animal[] animals = new Animal[2];
//        animals[0] = new Chicken();
//        animals[1] = new Tiger();
//        for(Animal animal:animals){
//            System.out.println(animal.makeSound());
//            if(animal instanceof Chicken){
//                Edible edibler = (Chicken) animal;
//                System.out.println(edibler.howToEat());
//            }
//        }
        // test fruit
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }

    }
}
