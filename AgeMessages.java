import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.println("How old are you?");
    age = keyboard.nextInt();

    System.out.println("You are: ");
    if (age < 13) {
      System.out.println("\ttoo young to create a facebook account");
    }
    if (age < 16) {
      System.out.println("\ttoo young to get a drivers license");
    }
    if (age < 18) {
      System.out.println("\ttoo young to get a drivers license");
    }
  }
}
