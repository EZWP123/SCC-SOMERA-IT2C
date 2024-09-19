
package javaappsecc;


public class Account {
    
    
   String id, firstName, lastName, email, username, password;

        public Account(String id, String firstName, String lastName, String email, String username, String password) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.username = username;
            this.password = password;
        }

        public void add(Account account) {
            System.out.println("Account added successfully!");
        }

        public void view() {
            System.out.println("Account Details:");
            System.out.println("ID: " + id);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Email: " + email);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
