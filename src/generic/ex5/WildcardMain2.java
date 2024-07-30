package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        WildcardEx.writeBox(animalBox);
        //WildcardEx.writeBox(dogBox); // Animal이 하한 : 컴파일 오류 발생
        //WildcardEx.writeBox(catBox); // Animal이 하한 : 컴파일 오류 발생

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);

    }
}
