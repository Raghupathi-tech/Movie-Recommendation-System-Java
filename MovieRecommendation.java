import java.util.Scanner;

public class MovieRecommendation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Horror");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Recommended: Leo");
                break;
            case 2:
                System.out.println("Recommended: Doctor");
                break;
            case 3:
                System.out.println("Recommended: Demonte Colony");
                break;
            default:
                System.out.println("No Recommendation");
        }

        sc.close();
    }
}