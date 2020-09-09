import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
       
        int hours1 = scanner.nextInt();
       int minutes1 = scanner.nextInt();
       int seconds1 = scanner.nextInt();
       int hours2 = scanner.nextInt();
       int minutes2 = scanner.nextInt();
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
 
       System.out.print(totalSec);


        // closing the scanner object
        scanner.close();
    }
}