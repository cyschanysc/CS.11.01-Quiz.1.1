import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;

        System.out.println("Please type in your age:");
        age = scanner.nextInt();
        System.out.println("Please type in your first name:");
        firstName = scanner1.nextLine();
        System.out.println("Please type in your favourite food:");
        favouriteFood = scanner2.nextLine();

        System.out.println("Age: " + age + "\nName: " + firstName + "\nFavourite Food: " + favouriteFood);
    }
}