package util;

import java.util.Scanner;

public class Client {

    private String name;
    private int number;
    private double quantity;


    Scanner sc = new Scanner(System.in);

    public Client(){

        System.out.println("owner of the account: ");
        this.name = sc.nextLine();

        System.out.println("account number: ");
        this.number = sc.nextInt();

        int count = 0;
        while(count == 0){

            System.out.println("will there be initial transaction? (y/n)");
            String response = sc.next();

            if(response.equals("n")){
                this.quantity = 0;
                System.out.println("Accont: " + this.number + ", Holder: " + this.name + ", Balance: " + this.quantity);
                count = 1;

            }
            else if(response.equals("y")){
                System.out.println("how much will you deposit?");
                this.quantity = sc.nextDouble();
                System.out.println("Accont: " + this.number + ", Holder: " + this.name + ", Balance: " + this.quantity);
                count = 1;

            }
            else{
                System.out.println("please enter a valid answer");
            }
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double Deposit(double value){
        this.quantity = this.quantity + value;
        System.out.println("Accont: " + this.number + ", Holder: " + this.name + ", Balance: " + this.quantity);
        return this.quantity;
    }

    public double Withdraw(double value){
        this.quantity = this.quantity - value -5;
        System.out.println("Accont: " + this.number + ", Holder: " + this.name + ", Balance: " + this.quantity);
        return this.quantity;
    }

}

