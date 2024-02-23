/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author Sai Krishna Gupta
 */
public class TestUserProfile {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String id = input.nextLine();
        System.out.println("Enter Your Favourite Actor");
        String fActor = input.nextLine();
        UserProfile profile = new UserProfile(id,fActor);
    }
}
