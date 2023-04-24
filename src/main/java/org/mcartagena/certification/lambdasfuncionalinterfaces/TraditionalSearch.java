package org.mcartagena.certification.lambdasfuncionalinterfaces;

import org.mcartagena.certification.beyondclasses.A;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        // list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        System.out.println("Animal can hop...");
        print(animals, a-> a.canHop());
        System.out.println("Animal can swim...");
        print(animals, a-> a.canSwim());
        System.out.println("Animal can't swim...");
        print(animals, a-> !a.canSwim());

    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for(Animal animal: animals){
            // General check
            if(checker.test(animal)){
                System.out.println(animal + " ");
            }
        }
    }
}
