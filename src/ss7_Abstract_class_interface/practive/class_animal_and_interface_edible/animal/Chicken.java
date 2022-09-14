package ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.animal;

import ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.animal.Animal;
import ss7_Abstract_class_interface.practive.class_animal_and_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chich chich";
    }@Override
    public String howToEat(){
        return "Could be fried";
    }
}
