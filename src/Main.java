import edu.misena.senaviewer.model.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {
    static List<Object> movies = new ArrayList<Object>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 1;

        while (option != 0) {
            showMainMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    manageMovies();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("Saliste de la aplicacion");
                    break;
                default:
                    System.out.println("la opcion que ingreso es invalida");
                    break;
            }
        }
        scanner.close();

    }

    static void showMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");
    }

    static void manageMovies() {
        System.out.println("Movie");
        System.out.println("1. Agregar pelucula");
        System.out.println("2. Ver peliculas");
        System.out.println("Seleciona una opcion");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addMovie();
                break;
            case 2:
                viewMovies();
                break;
            default:

                System.out.println("Invalid option.");
                break;
        }
    }

    private static void viewMovies() {
    }

    private static void addMovie() {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();

        System.out.print("Enter movie genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter movie creator: ");
        String creator = scanner.nextLine();

        System.out.print("Enter movie duration (in minutes): ");
        int duration = scanner.nextInt();

        System.out.print("Enter movie year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        // Crear una nueva instancia de Movie
        Object movie = new movie(title, genre, creator, duration, year);

        // Agregar la película a la lista
        movies.add(movie);
        System.out.println("Movie added successfully!");
}
}



