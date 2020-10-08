import java.util.Scanner;
/**
 * a program that determines where a user entered number is out of 10 numbers
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    int[] integers = new int[10];

    // ask the user to enter 10 integers
    System.out.println("Please enter in 10 integers to put into the array");
    // create a for loop to get the 10 integers
    for(int i = 0; i < 10; i++){
    integers[i] = input.nextInt();
    }

    // ask the user for a number to find
    System.out.println("Please enter a number to find");
    int findNum = input.nextInt();


    // create a for loop to find the matching numbers
    for(int i = 0; i < 10; i++){
    // create an if statement to locate where the numbers are 
    if(findNum == integers[i]){
      System.out.println(findNum + " is located at index " + i);
    }
    }
  }
}
