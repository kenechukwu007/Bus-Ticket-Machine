package Assignment2_000791775;


import java.util.Scanner;

/**
 * This lab is about creating a ticket machine which will allow the user to select
 *   his or her destination plus add credit to their balance as well as print the tickets.
 *   Also you can add the number of adult passengers as well as child passengers
 *   @ author: Ohia William Kenechukwu 000791775
 */
public class main {
    public static void main(String[] args) {

        // creating machine and assigning it routes
        TicketMachine machine_1 = new TicketMachine();
        machine_1.route1 = "Uptown";
        machine_1.route2 = "Downtown";

        // creating machine 2 and assigning its route
        TicketMachine machine_2 = new TicketMachine();
        machine_2.route1 = "Main St.";
        machine_2.route2 = "King St.";

        // inital choice on the machine
        int choice = 0;
        Scanner input = new Scanner(System.in);

        // while loop which asks the user to select which machine they desire to use
        do {
            System.out.println("Welcome To The Ticket Counter");
            System.out.println("                           ");
            System.out.println("1. Approach machine 1");
            System.out.println("2. Approach machine 2");
            System.out.println("3 Exit");
            System.out.println( "Your choice: " + choice );
            choice = input.nextInt();


            // do while loop which shows the selection of machine1 and loops until the user exits it with a kill switch
            if (choice == 1){
                do {
                    System.out.println(machine_1);
                    System.out.println("1. Select Route 'Uptown' ");
                    System.out.println("2. Select Route 'Downtown' ");
                    System.out.println("3. Add Adult");
                    System.out.println("4. Remove Adult");
                    System.out.println("5. Add Child");
                    System.out.println("6. Remove Child");
                    System.out.println("7. Insert Quarter");
                    System.out.println("8. Insert Loonie");
                    System.out.println("9. Insert Toonie");
                    System.out.println("10. Print Ticket");
                    System.out.println("11. Step away from machine");
                    System.out.println("Your choice: " + choice);
                    choice = input.nextInt();


                    // this sets of if and else if statements that allows the machine to indicate the result of the user choice in Machine_1
                    if (choice == 1) {
                        machine_1.currentRoute = "Uptown";

                    } else if (choice == 2){
                        machine_1.currentRoute = "Downtown";
                    }else if (choice == 3) {
                        machine_1.addAdult();
                    }else if (choice == 4) {
                        machine_1.removeAdult();
                    }else if (choice == 5) {
                        machine_1.addChild();
                    }else if (choice == 6) {
                        machine_1.removeChild();
                    }else if (choice == 7) {
                        machine_1.addQuarter();
                    }else if (choice == 8) {
                        machine_1.addloonie();
                    }else if (choice == 9) {
                        machine_1.addToonie();
                    }else if (choice == 10) {
                        System.out.println(machine_1.PrintTicket());
                    }else if (choice == 11) {
                        System.out.println("Step away from the Ticket Machine");
                    }

                }while (choice != 12); // loop until the user enters a number greater than 11

            }else if (choice == 2) { // do & else if statement for the result of choice in machine 2
                do{
                    System.out.println(machine_2);
                    System.out.println("1. Select Route 'Main St.' ");
                    System.out.println("2. Select Route 'King St.' ");
                    System.out.println("3. Add Adult");
                    System.out.println("4. Remove Adult");
                    System.out.println("5. Add Child");
                    System.out.println("6. Remove Child");
                    System.out.println("7. Insert Quarter");
                    System.out.println("8. Insert Loonie");
                    System.out.println("9. Insert Toonie");
                    System.out.println("10. Print Ticket");
                    System.out.println("11. Step away from machine");
                    System.out.println("Your choice: " + choice);
                    choice = input.nextInt(); // asks the user to make another choice from the menu


                    if (choice == 1) {
                        machine_2.currentRoute = "Main St.";

                    } else if (choice == 2){
                        machine_2.currentRoute = "King St.";
                    }else if (choice == 3) {
                        machine_2.addAdult();
                    }else if (choice == 4) {
                        machine_2.removeAdult();
                    }else if (choice == 5) {
                        machine_2.addChild();
                    }else if (choice == 6) {
                        machine_2.removeChild();
                    }else if (choice == 7) {
                        machine_2.addQuarter();
                    }else if (choice == 8) {
                        machine_2.addloonie();
                    }else if (choice == 9) {
                        machine_2.addToonie();
                    }else if (choice == 10) {
                        System.out.println(machine_2.PrintTicket());
                    }else if (choice == 11) {
                        System.out.println("Step away from the Ticket Machine");
                    }

                }while (choice != 11);

            }

        } while(choice <= 3);

    }
}


