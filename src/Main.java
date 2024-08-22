import edu.misena.senaviewer.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    static List<movie> movies = new ArrayList<>();
    static List<serie> series = new ArrayList<>();
    static List<book> books = new ArrayList<>();
    static List<magazine> magazines = new ArrayList<>();
    static List<chapter> chapters = new ArrayList<>();
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
                    manageMagazine();
                    break;
                case 5:
                    manageChapter();
                    break;
                case 6:
                    break;
                case 7:
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
        System.out.println("5. Chapter");
        System.out.println("6. Report");
        System.out.println("7. Report Today");
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
        String title =
        title = scanner.nextLine();

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
        System.out.print("Ingresar el titulo del libro: ");
        String title = scanner.nextLine();
        title = scanner.nextLine();

        System.out.print("ingresar fecha del editorial del libro: ");
        String editorialDate;
        editorialDate = scanner.nextLine();

        System.out.print("ingresar el editorial del libro : ");
        String editorial = scanner.nextLine();

        System.out.print("ingresar el isbn del libro: ");
        String isbn = scanner.nextLine();

        // Crear una nueva instancia de Movie
        book book  = new book(title, editorialDate, editorial, isbn);

        // Agregar la película a la lista
        books.add(book);
        System.out.println(" Libro añadido!!!");
    }

    private static void viewBook() {
        if (books.isEmpty()) {
            System.out.println("Libros no encontradas.");
        } else {
            for (book book : books) {
                System.out.println("ID: " + book.getId());
                System.out.println("Titulo: " + book.getTitle());
                System.out.println("Fecha de Editorial: " + book.getEditorialDate());
                System.out.println("Nombre editorial: " + book.getEditorial());
                System.out.println("isbn: " + book.getIsbn() );
                System.out.println("Visto: " + (book.getViewed() ? "Si" : "No"));
                System.out.println("----------------------");
            }
        }
    }

    static void manageMagazine() {
        System.out.println("Revistas");
        System.out.println("1. Agregar nombre de revista");
        System.out.println("2. Ver revista");
        System.out.println("Seleciona una opcion");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addMagazine();
                break;
            case 2:
                viewMagazine();
                break;
            default:

                System.out.println("Invalid option.");
                break;
        }
    }

    private static void addMagazine() {
        System.out.print("Ingresar el titulo de la revista: ");
        String title = scanner.nextLine();
        title = scanner.nextLine();

        System.out.print("ingresar fecha del editorial de la revista: ");
        String editorialDate;
        editorialDate = scanner.nextLine();

        System.out.print("ingresar el editorial de la revista : ");
        String editorial = scanner.nextLine();

        // Crear una nueva instancia de Movie
        magazine magazine  = new magazine(title, editorialDate, editorial);

        // Agregar la película a la lista
        magazines.add(magazine);
        System.out.println("Revista añadida!!!");
    }

    private static void viewMagazine() {
        if (magazines.isEmpty()) {
            System.out.println("Libros no encontradas.");
        } else {
            for (magazine magazine : magazines) {
                System.out.println("ID: " + magazine.getId());
                System.out.println("Titulo: " + magazine.getTitle());
                System.out.println("Fecha de Editorial: " + magazine.getEditorialDate());
                System.out.println("Nombre editorial: " + magazine.getEditorial());
                System.out.println("Visto: " + (magazine.getViewed() ? "Si" : "No"));
                System.out.println("----------------------");
            }
        }
    }

    static void manageChapter() {
        System.out.println("Chapter");
        System.out.println("1. Agregar capitulo");
        System.out.println("2. Ver capitulo");
        System.out.println("Seleciona una opcion");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addChapter();
                break;
            case 2:
                viewChapter();
                break;
            default:

                System.out.println("Invalid option.");
                break;
        }
    }


}




