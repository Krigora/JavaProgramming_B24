package day58_exceptions.animal;

import day53_inharitance.rules.A;

public class Panda extends Animal{

    @Override
    public Panda getAnimal() {
        return new Panda();
    }
}
