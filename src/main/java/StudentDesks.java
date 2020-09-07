import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.println("Students A: ");
       int numStudentsA = scanner.nextInt();
       System.out.println("Student B: ");
       int numStudentsB = scanner.nextInt();
       System.out.println("Students C: ");
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
 
       System.out.println(totalDesks);

        // closing the scanner object
        scanner.close();
    }
}