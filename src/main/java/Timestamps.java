import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.println(" First hours: ");
        int hours1 = scanner.nextInt();
        System.out.println(" First minutes: ");
       int minutes1 = scanner.nextInt();
       System.out.println(" First seconds: ");
       int seconds1 = scanner.nextInt();
       System.out.println(" Second hours: ");
       int hours2 = scanner.nextInt();
       System.out.println(" Second minutes: ");
       int minutes2 = scanner.nextInt();
       System.out.println(" Second seconds: ");
       int seconds2 = scanner.nextInt();
       int diffHours;
       int diffMins;
       int diffSec;
       int totalSec;
       int convHours;
       int convMins;

        /*
         *  your code goes here
         */
       diffHours = hours2 - hours1;
       diffMins = minutes2 - minutes1;
       diffSec = seconds2 - seconds1;
 
       convHours = diffHours * 3600;
       convMins = diffMins * 60;
 
       totalSec = diffSec + convHours + convMins ;
 
       System.out.println(totalSec);


        // closing the scanner object
        scanner.close();
    }
}