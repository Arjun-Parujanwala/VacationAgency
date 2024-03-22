import java.util.Locale;
import java.util.Scanner;
public class VacationAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = getInput(scanner);
        printRecommendation(destination);
        scannerClose(scanner);
    }

    public static String getInput(Scanner scanner){
        System.out.print("Enter your Summer vacation destination: ");
        return scanner.next();
    }
    public static void printRecommendation(String destination){
        switch(destination.toLowerCase(Locale.ROOT)){
            case "singapore":
                System.out.println("Singaporean Airlines!");
                break;
            case "india":
                System.out.println("Air India!");
                break;
            case "florida":
                System.out.println("United Airlines!");
                break;
            default:
                System.out.println("Club Home!");
                break;
        }
    }
    public static void scannerClose(Scanner scanner){
        scanner.close();
    }
}