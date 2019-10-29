package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String cont;

		System.out.println("Welcome to the Movie List Application!\nIt's showtime!");

		System.out.println("\nThere are 10 movies in this list.");

		ArrayList<String> animated = new ArrayList<>();
		animated.add("Up");
		animated.add("Coco");
		animated.add("Moana");

		ArrayList<String> drama = new ArrayList<>();
		drama.add("Titanic");
		drama.add("Forest Gump");

		ArrayList<String> horror = new ArrayList<>();
		horror.add("IT");
		horror.add("The Shinig");
		horror.add("The Blair Witch Project");

		ArrayList<String> scifi = new ArrayList<>();
		scifi.add("The Matrix");
		scifi.add("Interstellar");

		do {
		String category = Validator.getString(scan,
					"\nWhat caegory are you interested in?\nanimated\ndrama\nhorror\nscifi\n");

			if (category.equalsIgnoreCase("animated")) {
				for (int i = 0; i < animated.size(); i++) {
					System.out.println(animated.get(i));
				}
			} else if (category.equalsIgnoreCase("drama")) {
				for (int i = 0; i < drama.size(); i++) {
					System.out.println(drama.get(i));
				}
			} else if (category.equalsIgnoreCase("horror")) {
				for (int i = 0; i < horror.size(); i++) {
					System.out.println(horror.get(i));
				}
			} else if (category.equalsIgnoreCase("scifi")) {
				for (int i = 0; i < scifi.size(); i++) {
					System.out.println(scifi.get(i));
				}
			} else {
				System.out.println("Enter a category on the list.");
			}

			System.out.println("\nContinue? (y/n)");
			cont = scan.nextLine();

		} while (cont.equalsIgnoreCase("y") || (cont.equalsIgnoreCase("yes")));

		System.out.println("Goodbye!");
		scan.close();

	}


}
