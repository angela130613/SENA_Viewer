import edu.misena.senaviewer.model.movie;
import edu.misena.senaviewer.model.serie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    static List<movie> movies = new ArrayList<>();
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
                    manageSerie();
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
        movie movie = new movie(title, genre, creator, duration, (short) year);

        // Agregar la película a la lista
        movies.add(movie);
        System.out.println("Movie added successfully!");
}

    private static void viewMovies() {
        if (movies.isEmpty()) {
            System.out.println("Peliculas no encontradas.");
        } else {
            for (movie Movie : movies) {
                System.out.println("ID: " + Movie.getId());
                System.out.println("Titulo: " + Movie.getTitle());
                System.out.println("Genero: " + Movie.getGenre());
                System.out.println("Creador: " + Movie.getCreator());
                System.out.println("Duracion: " + Movie.getDuration() + " minutos");
                System.out.println("Año: " + Movie.getYear());
                System.out.println("Visto: " + (Movie.isViewed() ? "Si" : "No"));
                System.out.println("Tiempo Visto: " + Movie.getTimeViewed() + " minutos");
                System.out.println("----------------------");
            }
        }
    }

    static void manageSerie() {
        System.out.println("Movie");
        System.out.println("1. Agregar serie");
        System.out.println("2. Ver serie");
        System.out.println("Seleciona una opcion");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addSerie();
                break;
            case 2:
                viewSerie();
                break;
            default:

                System.out.println("Invalid option.");
                break;
        }
    }

    private static void addSerie() {
        System.out.print("Enter serie title: ");
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
        serie serie = new serie(title, genre, duration);

        // Agregar la película a la lista
        serie.add(serie);
        System.out.println("Movie added successfully!");
    }

}




