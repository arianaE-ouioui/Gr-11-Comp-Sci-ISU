import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int addOrBookChoice = 0; //variable to store user's choice
        while (addOrBookChoice != 3) { //allows code to loop back to the beginning menu until they terminate the program
        System.out.println("◆ Welcome to the Local Service Marketplace! I am ServiceBot, and I will be assisting you today.\n◆ Would you like to Add or Book a Service?\nOr would you like to terminate the program?\n (Please enter 1 for Adding a Service, 2 for Booking a Service, 3 for terminating the program)");
            ArrayList<String> addedServicesArray = new ArrayList<>();
             addOrBookChoice = sc.nextInt();
            switch (addOrBookChoice) {
                case 1:
                    //if output 1: for adding service
                    System.out.println("Wonderful! You have selected to Add a Service. Please enter your Service Name:");
                    String addAServiceName = sc.nextLine();
                    //addAServiceName.add(addAServiceName); <-- fix this

                    break;
                case 2:
                    //if output 2:
                    System.out.println("Great! You have selected to Book a Service.");
                    boolean browsingInputLoop = true;
                    while (browsingInputLoop) {
                        System.out.println("These are the services you are able to book:\n◆ Tutoring (enter 1)\n◆ Cleaning (enter 2)\n◆ Plumbing (enter 3)\n◆ Freelancers (enter 4)");
                        int browsingServiceSelection = sc.nextInt();

                        if (browsingServiceSelection == 1 || browsingServiceSelection == 2 || browsingServiceSelection == 3 || browsingServiceSelection == 4 ) {
                            System.out.println("This is an invalid input. Please enter a new input.");
                        } else {
                            switch (browsingServiceSelection) {
                                case 1:

                                    break;
                                case 2:

                                    break;
                                case 3:

                                    break;
                                case 4:

                                    break;
                                default:
                                    System.out.println("ServiceBot does not understand this input. Please enter another input.");
                                    break;
                            }
                        }

                        }

                        break;

                        case 3:

                            break;
                        default:

                            break;
                    }
                    }
            }
        }
    }
}