import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
      int degHour = scanner.nextInt();
      int hour;
      int degMin;
      int min;
 
       /*
        *  your code goes here
        */
      hour = degHour / 30;
      min = (degHour % 30) * 2;
      degMin = min * 6;
 
      System. out.println(degMin);
        // closing the scanner object
        scanner.close();
    }
}