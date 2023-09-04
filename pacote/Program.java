package pacote;

import java.util.Locale;
import java.util.Scanner;
import util.Client;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client client = new Client();

        client.Deposit(100);

        client.Withdraw(200);
        


        sc.close();
    }
} 