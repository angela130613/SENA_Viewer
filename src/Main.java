import edu.misena.senaviewer.model.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {
    static List<movie> movies = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 1;

        while (option != 0){
            showMainMenu();
            option = scanner.nextInt();

            switch (option){
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

    static void showMainMenu(){
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
}