import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
      
       int numStudentsA = scanner.nextInt();
       int numStudentsB = scanner.nextInt();
       int numStudentsC = scanner.nextInt();
       int numDeskA;
       int numDeskB;
       int numDeskC;
       int totalDesks;
       final int perDesk = 2;
 
       /*
        *  your code goes here
        */
       numDeskA = (numStudentsA / perDesk) + (numStudentsA % perDesk);
       numDeskB = (numStudentsB / perDesk) + (numStudentsB % perDesk);
       numDeskC = (numStudentsC / perDesk) + (numStudentsC % perDesk);
      
       totalDesks = numDeskA + numDeskB + numDeskC;
 
       System.out.print(totalDesks);

        // closing the scanner object
        scanner.close();
    }
}