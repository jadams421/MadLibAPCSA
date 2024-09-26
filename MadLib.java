import java.util.Scanner;

public class MadLib
{
public static void main(String[] args) 
{
// Create a scanner object for user input
Scanner input = new Scanner(System.in);
System.out.println("Enter a noun: ");
String noun = input.nextLine();
System.out.println("Enter a plural noun: ");
String pluralNoun = input.nextLine();
System.out.println("Enter a number: ");
String number = input.nextLine();
// Define the incomplete Mad Lib Story
String madLibStory = "I went to the " + noun + ", the " + pluralNoun + " and the " + number + " beasts were there.";
 // Output the completed story
 System.out.println("Here's your completed Mad Lib:");
 System.out.println(madLibStory);
}

}