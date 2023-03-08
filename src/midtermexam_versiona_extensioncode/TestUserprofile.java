/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author malik henry
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserProfile newUser = new UserProfile();
        System.out.println("Enter your name:");
        newUser.setUserID(input.nextLine());
        System.out.println("Select your favoruite genre: Comedey, Drama, Action, Mystery");
        newUser.setGenre(input.nextLine());
        System.out.println("New User created!");
        System.out.println("User Id: "+ newUser.getUserID());
        System.out.println("Favorite Genre: "+ newUser.getGenre());
    }
}
    

