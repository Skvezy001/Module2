import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal cat;
        Animal dog;
        Animal cow;
        String animal;
        String ani;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a name of animal(cat, dog, cow): ");
        animal = in.next();

        ani = animal.toLowerCase().trim();

        if( ani.equals("cat") ) {
            cat = new Cat("miau-miau");
            System.out.println(cat.getVoice());

        } else if ( ani.equals("dog") ) {
            dog = new Dog("gav-gav");
            System.out.println(dog.getVoice());

        } else if ( ani.equals("cow") ) {
            cow = new Cow("mu-mu");
            System.out.println(cow.getVoice());

        } else {
            System.out.println("I don't know this animal!");
        }
    }
}
