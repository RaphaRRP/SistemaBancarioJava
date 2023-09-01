package pacote;

import java.util.Locale;
import java.util.Scanner;
import util.Client;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client client = new Client("pedro", 1234, 2000);
        


        sc.close();
    }
} 