package Ivan.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Cat [] catArray = {new Cat("Barsik", 10), new Cat("Tom", 5), new Cat("Remi",15)};
	System.out.println("List of cats:");
	for (int i = 0; i < catArray.length; i++) {
	    catArray[i].info();
    }

	System.out.println("How much food do you want to feed cats?");
	Scanner input = new Scanner(System.in);
	int food = input.nextInt();
	Plate plate = new Plate(food);
	plate.info();
    System.out.println("_________________________");
	for (int i = 0; i < catArray.length; i++) {
	    catArray[i].eat(plate);
	    catArray[i].info();
	    plate.info();
    }

    }
}
