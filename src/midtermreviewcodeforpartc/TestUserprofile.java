/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author adity
 */
import java.util.Scanner;
public class TestUserprofile {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //first commit
        

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Comedy");
        System.out.println("4. Drama");
        System.out.println("5. Fantasy");

        int choice = scanner.nextInt();
        String genre = getGenre(choice);

        System.out.println("User profile created!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }

    private static String getGenre(int choice) {
        String genre;
        switch (choice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Adventure";
                break;
            case 3:
                genre = "Comedy";
                break;
            case 4:
                genre = "Drama";
                break;
            case 5:
                genre = "Fantasy";
                break;
            default:
                genre = "Unknown";
                break;
        }
        return genre;
    }
}

    
    
