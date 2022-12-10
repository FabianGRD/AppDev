import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = in.nextLine();
        System.out.print("Last Name: ");
        String lastName = in.nextLine();

        Kunde kunde = new Kunde(firstName, lastName);
        kunde.PrintName();

    }
}