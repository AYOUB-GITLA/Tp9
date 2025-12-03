package exercice3;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		User[] users = {
	            new User("Alice", 30),
	            new User("", 25),
	            new User("Bob", 16)
	        };

	        for (User u : users) {
	            try {
	                u.validate();
	                System.out.println("Utilisateur validé : " + u);
	            } catch (InvalidUserException e) {
	            	try (FileWriter fw = new FileWriter("error.log", true)) { // true = append
	                    fw.write("Erreur : " + e.getMessage() + "\n");
	                } catch (IOException io) {
	                    io.printStackTrace(); 
	                }	            }
	        }
	}

}
