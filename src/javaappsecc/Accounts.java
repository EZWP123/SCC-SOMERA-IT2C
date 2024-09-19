
package javaappsecc;
import java.util.Scanner;

public class Accounts {
    
  public void genAccounts() {
       
        Account[] accounts;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of accounts: ");
        int numAccounts = input.nextInt();
        accounts = new Account[numAccounts];

        for (int i = 0; i < numAccounts; i++) {
            System.out.println("Details of account " + (i + 1) + ":");

            System.out.print("ID: ");
            String id = input.next();

            System.out.print("First Name: ");
            String firstName = input.next();

            System.out.print("Last Name: ");
            String lastName = input.next();

            System.out.print("Email: ");
            String email = input.next();

            System.out.print("Username: ");
            String username = input.next();

           String password;
            while (true) {
                System.out.print("Password: ");
                password = input.next();

                if (isValidPassword(password)) {
                    break;
                } else {
                    System.out.println("Invalid password. Please try again.");
                }
            }

            accounts[i] = new Account(id, firstName, lastName, email, username, password);
        }

        System.out.printf("%-10s %-10s %-10s %-20s %-10s %-10s\n", 
                "ID", "First Name", "Last Name", "Email", "Username", "Password");

        for (Account account : accounts) {
            System.out.printf("%-10s %-10s %-10s %-20s %-10s %-10s\n", account.id, account.firstName, account.lastName, account.email, account.username, account.password);
        }
    }

    boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (password.equalsIgnoreCase("admin") || password.equalsIgnoreCase("password") || password.equalsIgnoreCase("1234")) {
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        boolean hasNumber = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }
        return hasUpper && hasLower && hasSpecial && hasNumber;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
