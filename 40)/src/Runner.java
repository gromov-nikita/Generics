import apply.Apply;
import apply.Shape;
import pets.Pet;
import pets.cats.EgyptianMau;
import pets.cats.Manx;
import pets.dogs.Mutt;
import pets.rodents.Hamster;

import java.util.LinkedList;
import java.util.List;

/*
Exercise 40: (3) Add a speak( ) method to all the pets in typeinfo.pets. Modify
Apply.java to call the speak( ) method for a heterogeneous collection of Pet.
 */
public class Runner {
    public static void main(String[] args) throws NoSuchMethodException {
        List<Pet> list = new LinkedList<>();
        list.add(new Hamster());
        list.add(new Manx());
        list.add(new EgyptianMau());
        list.add(new Mutt());
        Apply.apply(list, Pet.class.getMethod("speak"));
    }
}
