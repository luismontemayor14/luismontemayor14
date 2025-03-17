import java.util.Scanner;
public class ATM{
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        int customerId = 88893870;
        int customerPin = 1890;
        double balance = 500;
        
        System.out.print("Enter Your Customer Number: ");
        int num = scnr.nextInt();
        System.out.print("Enter Your Pin: ");
        int pin = scnr.nextInt();
        if(num!= customerId||pin!=customerPin){
            System.out.println("Invalid credintials have been Inputed");
            return;
        }
        System.out.println("Select the account you want to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        int num1 = scnr.nextInt();
        if(num1 == 1){
            System.out.println("Choice: "+num1);
            System.out.println("Checking Account: ");
            System.out.println("Type 1 - View Balance ");
            System.out.println("Type 2 - Withdraw funds ");
            System.out.println("Type 3 - Deposit Funds ");
            System.out.println("Type 4 - View Balance ");
        }
        if(num1 == 2){
            System.out.println("Choice: "+num1);
            System.out.println("Saving Account: ");
            System.out.println("Type 1 - View Balance ");
            System.out.println("Type 2 - Withdraw funds ");
            System.out.println("Type 3 - Deposit Funds ");
            System.out.println("Type 4 - Exit ");
        }
        if(num1 ==3){
            System.out.println("Transaction Cancelled");
            return;
        }
        int input = scnr.nextInt();
        if(input == 1){
            System.out.println("The balance is $"+viewBal(balance));
        }
        if(input ==2){
            System.out.println("How much would you like to withdraw");
            int withdraw = scnr.nextInt();
            balance = balance - withdraw;
            System.out.print("Remaining Funds: $"+ balance);
        }
        if(input ==3){
            System.out.print("How much would you ike to deposit :");
            int deposit = scnr.nextInt();
            balance = deposit+ balance;
            System.out.println("Current balance $"+balance);
        }
        if(input ==4){
            System.out.println("Transaction has been cancelled");
            scnr.close();
        }
    }
        public static double viewBal(double balance){
        return balance;
    }
       
}
