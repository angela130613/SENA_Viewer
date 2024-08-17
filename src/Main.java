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
        }

    }
}