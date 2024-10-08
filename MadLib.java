import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        // Adding the Scanner
        Scanner scanner = new Scanner(System.in);

        // Making the MadLib outline
        String madLib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        // String madLib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        // String madLib = "In a galaxy far far away, a <noun> was <adjective> while <verb> into Darth Vader";

        // Replace first placeholder: <noun>
        int openBracketIndex = madLib.indexOf("<");
        int closeBracketIndex = madLib.indexOf(">");
        String wordType = madLib.substring(openBracketIndex + 1, closeBracketIndex);
        System.out.println("Enter a " + wordType + ": ");
        String userInput = scanner.nextLine();

        String firstPart = madLib.substring(0, openBracketIndex);
        String lastPart = madLib.substring(closeBracketIndex + 1);
        madLib = firstPart + userInput + lastPart;

        // Replace second placeholder: <plural_noun>
        openBracketIndex = madLib.indexOf("<");
        closeBracketIndex = madLib.indexOf(">");
        wordType = madLib.substring(openBracketIndex + 1, closeBracketIndex);
        System.out.println("Enter a " + wordType + ": ");
        String userInput2 = scanner.nextLine();

        firstPart = madLib.substring(0, openBracketIndex);
        lastPart = madLib.substring(closeBracketIndex + 1);
        madLib = firstPart + userInput2 + lastPart;

        // Replace third placeholder: <number>
        openBracketIndex = madLib.indexOf("<");
        closeBracketIndex = madLib.indexOf(">");
        wordType = madLib.substring(openBracketIndex + 1, closeBracketIndex);
        System.out.println("Enter a " + wordType + ": ");
        String userInput3 = scanner.nextLine();

        firstPart = madLib.substring(0, openBracketIndex);
        lastPart = madLib.substring(closeBracketIndex + 1);
        madLib = firstPart + userInput3 + lastPart;

        // Output the completed MadLib
        System.out.println("Here’s your completed Mad Lib:");
        System.out.println(madLib);
    }
}
