import edu.misena.senaviewer.model.movie;
import edu.misena.senaviewer.model.serie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Main {
    static List<movie> movies = new ArrayList<>();
    static List<serie> series = new ArrayList<>();
    static List<serie> books = new ArrayList<>();
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
                    manageBook();
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
        System.out.println("1. Agregar pelicula");
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
        System.out.print("Ingresar el titulo de la serie: ");
        String title = scanner.nextLine();
        title = scanner.nextLine();

        System.out.print("Ingresa: el genero de la Serie: ");
        String genre = scanner.nextLine();

        System.out.print("Ingresa la duracion en minutos: ");
        int duration = scanner.nextInt();

        // Crear una nueva instancia de Movie
        serie serie = new serie(title, genre, duration);

        // Agregar la película a la lista
        series.add(serie);
        System.out.println("Serie añadida!!!!");
    }

    private static void viewSerie() {
        if (series.isEmpty()) {
            System.out.println("Series no encontradas.");
        } else {
            for (serie Serie : series) {
                System.out.println("ID: " + serie.getId());
                System.out.println("Titulo: " + serie.getTitle());
                System.out.println("Genero: " + serie.getGenre());
                System.out.println("Duracion: " + serie.getDuration() + " minutos");
                System.out.println("Visto: " + (serie.isViewed() ? "Si" : "No"));
                System.out.println("Tiempo Visto: " + serie.getTimeViewed() + " minutos");
                System.out.println("----------------------");
            }
        }
    }

    static void manageBook() {
        System.out.println("Book");
        System.out.println("1. Agregar libro");
        System.out.println("2. Ver libro");
        System.out.println("Seleciona una opcion");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addBook();
                break;
            case 2:
                viewBook();
                break;
            default:

                System.out.println("Invalid option.");
                break;
        }
    }

    private static void addBook() {
        System.out.print("ingre: ");
        String title = scanner.nextLine();

        System.out.print("Enter book genre: ");
        String editorialDate;
        editorialDate = scanner.nextLine();

        System.out.print("Enter book creator: ");
        String editorial = scanner.nextLine();

        System.out.print("Enter movie duration (in minutes): ");
        String isbn = scanner.nextLine();

        // Crear una nueva instancia de Movie
        movie movie = new movie(title, editorialDate, creator, duration, (short) year);

        // Agregar la película a la lista
        movies.add(movie);
        System.out.println("Movie added successfully!");
    }

}




