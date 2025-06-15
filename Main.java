//NAME: Ariana Etemadi
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //CATEGORIES
        ArrayList<String> categoryNamesArrayList = new ArrayList<>(); //stores the category NAMES
        categoryNamesArrayList.add("Tutoring");
        categoryNamesArrayList.add("Cleaning");
        categoryNamesArrayList.add("Plumbing");
        categoryNamesArrayList.add("Freelancer");

        //CATEGORY SERVICES (NAMES ONLY)
        //tutoring:
        ArrayList<String> tutoringCategoryServicesNamesArrayList = new ArrayList<>(); //stores the tutoring services NAMES
        tutoringCategoryServicesNamesArrayList.add("Abby's Music Tutoring");
        tutoringCategoryServicesNamesArrayList.add("Bosso's Circus Tutoring");
        tutoringCategoryServicesNamesArrayList.add("Carter's Magic Class");
        //cleaning
        ArrayList<String> cleaningCategoryServicesNamesArrayList = new ArrayList<>(); //stores the cleaning services NAMES
        cleaningCategoryServicesNamesArrayList.add("Leila's Magic Clean");
        cleaningCategoryServicesNamesArrayList.add("Kaz's Kleaners");
        cleaningCategoryServicesNamesArrayList.add("Germs-Be-Gone Cleaners");
        //plumbing
        ArrayList<String> plumbingCategoryServicesNamesArrayList = new ArrayList<>(); //stores the plumbing services NAMES
        plumbingCategoryServicesNamesArrayList.add("Wylan's Pro Plumbers");
        plumbingCategoryServicesNamesArrayList.add("Alyssa's Plumbing Service");
        plumbingCategoryServicesNamesArrayList.add("Varvara's Plumbers");
        //freelancer
        ArrayList<String> freelancerCategoryServicesNamesArrayList = new ArrayList<>(); //stores the freelancer services NAMES
        freelancerCategoryServicesNamesArrayList.add("Ghost's Tech Freelance");
        freelancerCategoryServicesNamesArrayList.add("Derek's Graphic Designs");
        freelancerCategoryServicesNamesArrayList.add("Iroh's Coding Company");

        //CATEGORY SERVICES (PRICES ONLY)
        //tutoring
        ArrayList<Integer> tutoringCategoryServicesPricesArrayList = new ArrayList<>(); //stores the tutoring services PRICES
        tutoringCategoryServicesPricesArrayList.add(15);
        tutoringCategoryServicesPricesArrayList.add(17);
        tutoringCategoryServicesPricesArrayList.add(18);
        //cleaning
        ArrayList<Integer> cleaningCategoryServicesPricesArrayList = new ArrayList<>(); //stores the cleaning services PRICES
        cleaningCategoryServicesPricesArrayList.add(16);
        cleaningCategoryServicesPricesArrayList.add(21);
        cleaningCategoryServicesPricesArrayList.add(19);
        //plumbing
        ArrayList<Integer> plumbingCategoryServicesPricesArrayList = new ArrayList<>(); //stores the plumbing services PRICES
        plumbingCategoryServicesPricesArrayList.add(12);
        plumbingCategoryServicesPricesArrayList.add(20);
        plumbingCategoryServicesPricesArrayList.add(14);
        //freelancer
        ArrayList<Integer> freelancerCategoryServicesPricesArrayList = new ArrayList<>(); //stores the freelancer services PRICES
        freelancerCategoryServicesPricesArrayList.add(15);
        freelancerCategoryServicesPricesArrayList.add(20);
        freelancerCategoryServicesPricesArrayList.add(13);


        //AVAILABILITY OF CATEGORY SERVICES
        //tutoring:
        ArrayList<Boolean> tutoringCategoryServicesAvailabilityArrayList = new ArrayList<>(); // stores the tutoring services AVAILABILITIES
        tutoringCategoryServicesAvailabilityArrayList.add(true);
        tutoringCategoryServicesAvailabilityArrayList.add(true);
        tutoringCategoryServicesAvailabilityArrayList.add(true);
        //cleaning
        ArrayList<Boolean> cleaningCategoryServicesAvailabilityArrayList = new ArrayList<>(); // stores the cleaning services AVAILABILITIES
        cleaningCategoryServicesAvailabilityArrayList.add(true);
        cleaningCategoryServicesAvailabilityArrayList.add(true);
        cleaningCategoryServicesAvailabilityArrayList.add(true);
        //plumbing
        ArrayList<Boolean> plumbingCategoryServicesAvailabilityArrayList = new ArrayList<>(); // stores the plumbing services AVAILABILITIES
        plumbingCategoryServicesAvailabilityArrayList.add(true);
        plumbingCategoryServicesAvailabilityArrayList.add(true);
        plumbingCategoryServicesAvailabilityArrayList.add(true);
        //freelancer
        ArrayList<Boolean> freelancerCategoryServicesAvailabilityArrayList = new ArrayList<>(); // stores the freelancer services AVAILABILITIES
        freelancerCategoryServicesAvailabilityArrayList.add(true);
        freelancerCategoryServicesAvailabilityArrayList.add(true);
        freelancerCategoryServicesAvailabilityArrayList.add(true);



        //carts:
        //stores category names in cart
        ArrayList<String> userCartArrayListCategoryNames = new ArrayList<>();
        //stores services in cart
        ArrayList<String> userCartArrayListServiceNames = new ArrayList<>();
        //stores prices in cart
        ArrayList<Integer> userCartArrayListServicePrices = new ArrayList<>();


        System.out.println("Welcome to the Local Service Marketplace! I am ServiceBot and I will be assisting you today.");
        Scanner sc = new Scanner(System.in);
        boolean myProgramLoop = true;
        int userInputAddBookExit = -1; 
        while (myProgramLoop) { //allows code to loop back to the beginning menu until they terminate the program
            if (userInputAddBookExit == -1) {
                System.out.println("Would you like to:\n 1 - Add a Service (enter 1)\n 2 - Book a Service (enter 2)\n 0 - Exit the Program (enter 0)"); //main menu display
                userInputAddBookExit = sc.nextInt();
            }
            switch (userInputAddBookExit) {
                case 0:
                    if (userCartArrayListServiceNames.size() == 0) {
                        System.out.println("Your cart is empty... are you sure you want to exit? (Y/N)");

                        String userChoiceExitingProgram = sc.next().toUpperCase();

                        if (userChoiceExitingProgram.equals("Y")) {
                            System.out.println("Thank you for being here and testing my program! ServiceBot bids you farewell."); //farewell message, prints after checkout message as well
                            myProgramLoop = false;
                            break;
                        } else if (userChoiceExitingProgram.equals("N")) { //everything within this statement works to bring it back to the main menu (the break brings it back to the beginning and setting the variable to -1 allows the main menu text to be accessed again)
                            userInputAddBookExit = -1;
                            System.out.println("In that case, ServiceBot will take you back to the main menu options.");
                            break;
                        } else {
                            System.out.println("Invalid input.");
                            userInputAddBookExit = -1;
                            break;
                        }
                    } else {
                        System.out.println("Thank you for being here and testing my program! ServiceBot bids you farewell.");
                    }
                    myProgramLoop = false;
                    break;
                case 1://if user input 1:
                    // for adding service(s)
                    boolean addingServicesLoop = true;
                    while (addingServicesLoop) {
                        System.out.println("\nYou have selected to Add a Service. ");
                        System.out.println("This is the list of categories you may choose to add your service to: ");

                        //displaying category names
                        for (int i = 0; i <= categoryNamesArrayList.size()-1;i++) {
                            int j = i+1;
                            System.out.println(j+" - "+categoryNamesArrayList.get(i));
                        }
                        //receiving user input for category name
                        System.out.println("Choose a category from the list above (enter the number associated with the category):");
                        int userChosenCategoryAddingService = sc.nextInt();

                        if (!(userChosenCategoryAddingService > 0 && userChosenCategoryAddingService < 5)) {
                            System.out.println("Your input is invalid. Please try again.");
                            //break;
                        } else {
                            //receiving user input for service name
                            System.out.println("You chose this category: "+categoryNamesArrayList.get(userChosenCategoryAddingService-1));
                            System.out.println("Great! Please enter your Service Name:");
                            sc.nextLine(); //this catches the extra characters remaining from line 139 sc.nextInt() -> I had to search up the solution to this error
                            String addAServiceName = sc.nextLine();

                            System.out.println("You have entered this service name: "+addAServiceName); //confirmation message for the service name

                            //receiving user input for price
                            System.out.println("Final step: Please enter hourly rate for your service: ");
                            int userInputHourlyRate = sc.nextInt();
                            //adding the service, its price and availability to the respective array lists
                            switch (userChosenCategoryAddingService-1) {
                                case 0: //adds to tutoring category
                                    tutoringCategoryServicesNamesArrayList.add(addAServiceName);
                                    tutoringCategoryServicesPricesArrayList.add(userInputHourlyRate);
                                    tutoringCategoryServicesAvailabilityArrayList.add(true);
                                    break;
                                case 1: //adds to cleaning category
                                    cleaningCategoryServicesNamesArrayList.add(addAServiceName);
                                    cleaningCategoryServicesPricesArrayList.add(userInputHourlyRate);
                                    cleaningCategoryServicesAvailabilityArrayList.add(true);
                                    break;
                                case 2: //adds to plumbing category
                                    plumbingCategoryServicesNamesArrayList.add(addAServiceName);
                                    plumbingCategoryServicesPricesArrayList.add(userInputHourlyRate);
                                    plumbingCategoryServicesAvailabilityArrayList.add(true);
                                    break;
                                case 3: //adds to freelancer category
                                    freelancerCategoryServicesNamesArrayList.add(addAServiceName);
                                    freelancerCategoryServicesPricesArrayList.add(userInputHourlyRate);
                                    freelancerCategoryServicesAvailabilityArrayList.add(true);
                                    break;
                                default:
                                    break;
                            }
                            System.out.println("You have successfully added the service \""+addAServiceName+"\" for the price of $"+userInputHourlyRate+" per hour in category \""+categoryNamesArrayList.get(userChosenCategoryAddingService-1)+"\"!"); //confirmation message
                            System.out.println("Would you like to add another service? (Y/N)"); //gives user a choice to continue or end the loop
                            String userInputContinueAddingOrBreak = sc.next().toUpperCase();
                            if (userInputContinueAddingOrBreak.equals("Y")) {
                                System.out.println("You have selected \"Y\" for adding another service. You will be brought back to the Adding Services Menu.\n");
                                //break;
                            } else if (userInputContinueAddingOrBreak.equals("N")) { //setting the variable to -1 allows the main menu text to be accessed again and the break brings it back to the beginning
                                System.out.println("You have selected \"N\" for not adding another service. You will be brought back to the Main Menu.\n");
                                userInputAddBookExit = -1;
                                addingServicesLoop = false;
                            } else {
                                System.out.println("Invalid input. Please try again."); //accounts for invalid inputs w/ error message printed
                            }
                        }
                    }
                    break;

                case 2: //if input 2, book a service
                    System.out.println("You have selected to Book a Service.");
                    boolean browsingInputLoop = true;
                    while (browsingInputLoop) { //allows user to go through/loop through this category as many times as they want
                        System.out.println("These are the available service categories: ");
                        for (int i = 0; i < categoryNamesArrayList.size(); i++) {
                            int j = i + 1;
                            System.out.println(j + " - " + categoryNamesArrayList.get(i));
                        }
                        System.out.println("Please select a category to browse their services and prices (enter the number associated with the category). If you would like to exit to the main menu, enter 0"); //menu for browsing services
                        int userCategoryChoiceBrowse = sc.nextInt();

                        if (!(userCategoryChoiceBrowse >= 0 && userCategoryChoiceBrowse < 5)) { //checks if the user input is valid in terms of selected category and prints and error message if it not
                            System.out.println("Your input is invalid. Please try again.");
                            //break;
                        } else {
                            if (userCategoryChoiceBrowse !=0){ //checks if the user did not enter 0 (0 is the choice to exit the program)
                                System.out.println("You chose this category: " +categoryNamesArrayList.get(userCategoryChoiceBrowse - 1)); //confirmation message
                            }
                            switch (userCategoryChoiceBrowse - 1) {
                                case -1: //Exiting (to the main menu)
                                    userInputAddBookExit = -1;
                                    browsingInputLoop = false;
                                    break;

                                case 0: //tutoring category services list
                                    boolean loopTutoringCategory = true;
                                    while (loopTutoringCategory) { //allows user to loop through this specific category as many times as they want
                                        System.out.println("\nTutoring Category Service List: ");
                                        for (int i = 0; i < tutoringCategoryServicesNamesArrayList.size(); i++) { //prints the list of services
                                            int j = i + 1;
                                            String bookedServiceMessage = "";
                                            if (!tutoringCategoryServicesAvailabilityArrayList.get(i)) { //if already full, prints additionally beside the service that it is full
                                                bookedServiceMessage = "--> FULLY BOOKED";
                                            }
                                            System.out.println(j + " - " + tutoringCategoryServicesNamesArrayList.get(i) + ", $" + tutoringCategoryServicesPricesArrayList.get(i) + " per hour. "+bookedServiceMessage);
                                        }
                                        System.out.println("Please select which service you would like to add to your cart (enter the service's corresponding number), or enter 0 for the Category List: ");
                                        int tutoringServiceSelectionForCart = sc.nextInt();
                                        if (tutoringServiceSelectionForCart == 0) { //if user enters 0, the program goes back to the select a category page
                                            loopTutoringCategory = false;
                                            break;
                                        }else if (!(tutoringServiceSelectionForCart > 0 && tutoringServiceSelectionForCart < tutoringCategoryServicesNamesArrayList.size()+1)) {
                                            System.out.println("Your input is invalid. Please try again."); //checks for validity and prints an error message if not valid
                                        } else {
                                            if (!tutoringCategoryServicesAvailabilityArrayList.get(tutoringServiceSelectionForCart - 1)) {
                                                System.out.println("Unfortunately, "+tutoringCategoryServicesNamesArrayList.get(tutoringServiceSelectionForCart - 1)+" is unavailable."); //error message if unavailable
                                            } else {
                                                System.out.println("The selected service is AVAILABLE"); //confirmation message, then the program adds the selected services' name, price, and category to the proper cart array lists
                                                userCartArrayListCategoryNames.add(categoryNamesArrayList.get(0)); //0 is the index for the tutoring category
                                                userCartArrayListServiceNames.add(tutoringCategoryServicesNamesArrayList.get(tutoringServiceSelectionForCart - 1));
                                                userCartArrayListServicePrices.add(tutoringCategoryServicesPricesArrayList.get(tutoringServiceSelectionForCart - 1));
                                                tutoringCategoryServicesAvailabilityArrayList.set(tutoringServiceSelectionForCart - 1, false); //makes availability false
                                                int cartSize = userCartArrayListServiceNames.size();
                                                System.out.println("You have successfully added the service \""+userCartArrayListServiceNames.get(cartSize-1)+"\" with the price of $"+userCartArrayListServicePrices.get(cartSize-1)+" per hour from the "+userCartArrayListCategoryNames.get(cartSize-1)+" Category to your cart.");
                                                System.out.println("Cart Size: "+cartSize);
                                            }
                                        }

                                        String emptyCartMessage = "";
                                        if (userCartArrayListServiceNames.size() == 0) {
                                            emptyCartMessage = "\n\t\t\t  [The Cart is Empty]"; //if the cart is empty, the empty string variable will be replaced by this message and will be printed when the cart is printed
                                        }
                                        System.out.println("\t\t\t\t-- Your Cart: -- "+emptyCartMessage);

                                        for (int i = 0; i < userCartArrayListServiceNames.size(); i++) {
                                            int j = i+1;
                                            System.out.println("\t"+j+" - "+userCartArrayListServiceNames.get(i)+", $"+userCartArrayListServicePrices.get(i)+" per hour in "+userCartArrayListCategoryNames.get(i));
                                        }

                                        System.out.println("\nWould you like to... \n -> Remove items (enter R)\n -> Add more items from the Tutoring Category (enter A)\n -> Go back to the Category List (enter L)\n -> Proceed to Checkout (enter C)");
                                        String userDecisionBrowsingTutoring = sc.next().toUpperCase();
                                        switch (userDecisionBrowsingTutoring) {
                                            case "R":
                                                System.out.println("Great! Enter the number that corresponds with the service to remove it from the cart: ");
                                                int userInputRemoveServiceFromCart = sc.nextInt();
                                                if (!(userInputRemoveServiceFromCart > 0 && userInputRemoveServiceFromCart < userCartArrayListServiceNames.size()+1)) {
                                                    System.out.println("Invalid Input. Please try again."); //checks for invalid input
                                                } else if (!userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart-1).equals("Tutoring")) {
                                                        System.out.println("Unable to remove this service while in this category, please visit the " + userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart - 1) + " category to remove the selected service");
                                                    loopTutoringCategory = false; //doesn't allow the user to remove a service when it is currently in a different category (ex cant remove tutoring service when you are in the cleaning service page)
                                                    break;
                                                } else {
                                                    String removedItemMessage = "\""+userCartArrayListServiceNames.get(userInputRemoveServiceFromCart-1)+"\" for $"+userCartArrayListServicePrices.get(userInputRemoveServiceFromCart-1)+" per hour in the "+userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart-1)+" category.";

                                                    int oldUserInputRemoveServiceFromCart = userInputRemoveServiceFromCart-1 ; //saves the old index
                                                    int findIndexServiceName = tutoringCategoryServicesNamesArrayList.indexOf(userCartArrayListServiceNames.get(oldUserInputRemoveServiceFromCart)); //uses the old index to find the index of the service in the original array, which is then saved in the variable
                                                    userCartArrayListServiceNames.remove(userInputRemoveServiceFromCart-1);
                                                    userCartArrayListCategoryNames.remove(userInputRemoveServiceFromCart-1);
                                                    userCartArrayListServicePrices.remove(userInputRemoveServiceFromCart-1);
                                                    tutoringCategoryServicesAvailabilityArrayList.set(findIndexServiceName, true); //makes the service available again, uses the old index to find the service in the original array list

                                                    System.out.println("You have removed the following service from your cart: "+removedItemMessage+"\n" +
                                                            "\nHere is your updated cart: "); //prints the new cart

                                                    if (userCartArrayListServiceNames.size() == 0) {
                                                        emptyCartMessage = "\n\t\t\t  [The Cart is Empty]"; //if the cart is empty, the empty string variable will be replaced by this message and will be printed when the cart is printed
                                                    }
                                                    System.out.println("\t\t\t\t-- Your Cart: -- "+emptyCartMessage);
                                                    for (int i = 0; i < userCartArrayListServiceNames.size(); i++) {
                                                        int j = i+1;
                                                        System.out.println("\t"+j+" - "+userCartArrayListServiceNames.get(i)+", $"+userCartArrayListServicePrices.get(i)+" per hour in "+userCartArrayListCategoryNames.get(i));
                                                    }
                                                    System.out.println("We will take you back to the Tutoring Services List."); //once the removal has been successful, the program goes back to the list of services in the category it is currently browsing
                                                }
                                                break;
                                            case "A":
                                                System.out.println("Great! We will take you back to the list of Services in the Tutoring Category."); //if chosen the program goes back to the list of services in the category it is currently browsing
                                                break;
                                            case "L":
                                                System.out.println("Alright. We will take you back to the Category List."); //if chosen, the program takes the user back to the full list of categories
                                                loopTutoringCategory = false;

                                                break;
                                            case "C":
                                                System.out.println("Wonderful. We will take you to the Checkout page now.");
                                                //if chosen, takes the user to the checkout page. Brings it to the main menu and sets the variable to case of the checkout (automatically goes to the checkout without printing the main menu again)
                                                loopTutoringCategory = false;
                                                browsingInputLoop = false;
                                                userInputAddBookExit = 3;
                                                break;
                                            default:
                                                System.out.println("This is not a valid input. Please try again."); //checks for invalid input and prints an error message
                                                break;
                                        }
                                    }
                                    break;

                                case 1: //cleaning category services list
                                    boolean loopCleaningCategory = true;
                                    while (loopCleaningCategory) { //allows user to loop through this specific category as many times as they want
                                        System.out.println("\nCleaning Category Service List: ");
                                        for (int i = 0; i < cleaningCategoryServicesNamesArrayList.size(); i++) { //prints the list of services
                                            int j = i + 1;
                                            String bookedServiceMessage = "";
                                            if (!cleaningCategoryServicesAvailabilityArrayList.get(i)) { //if already full, prints additionally beside the service that it is full
                                                bookedServiceMessage = "--> FULLY BOOKED";
                                            }
                                            System.out.println(j + " - " + cleaningCategoryServicesNamesArrayList.get(i) + ", $" + cleaningCategoryServicesPricesArrayList.get(i) + " per hour. "+bookedServiceMessage);
                                        }
                                        System.out.println("Please select which service you would like to add to your cart (enter the service's corresponding number), or enter 0 for the Category List: ");
                                        int cleaningServiceSelectionForCart = sc.nextInt();
                                        if (cleaningServiceSelectionForCart == 0) { //if user enters 0, the program goes back to the select a category page
                                            loopCleaningCategory = false;
                                            break;
                                        }else if (!(cleaningServiceSelectionForCart >= 0 && cleaningServiceSelectionForCart < cleaningCategoryServicesNamesArrayList.size()+1)) {
                                            System.out.println("Your input is invalid. Please try again."); //checks for validity and prints an error message if not valid
                                        } else {
                                            if (!cleaningCategoryServicesAvailabilityArrayList.get(cleaningServiceSelectionForCart - 1)) {
                                                System.out.println("Unfortunately, "+cleaningCategoryServicesNamesArrayList.get(cleaningServiceSelectionForCart - 1)+" is unavailable."); //error message if unavailable
                                            } else {
                                                System.out.println("The selected service is AVAILABLE"); //confirmation message, then the program adds the selected services' name, price, and category to the proper cart array lists
                                                userCartArrayListCategoryNames.add(categoryNamesArrayList.get(1)); //1 is the index for the cleaning category
                                                userCartArrayListServiceNames.add(cleaningCategoryServicesNamesArrayList.get(cleaningServiceSelectionForCart - 1));
                                                userCartArrayListServicePrices.add(cleaningCategoryServicesPricesArrayList.get(cleaningServiceSelectionForCart - 1));
                                                cleaningCategoryServicesAvailabilityArrayList.set(cleaningServiceSelectionForCart - 1, false); //makes availability false
                                                int cartSize = userCartArrayListServiceNames.size();
                                                System.out.println("You have successfully added the service \""+userCartArrayListServiceNames.get(cartSize-1)+"\" with the price of $"+userCartArrayListServicePrices.get(cartSize-1)+" per hour from the "+userCartArrayListCategoryNames.get(cartSize-1)+" Category to your cart.");
                                                System.out.println("Cart Size: "+cartSize);
                                            }
                                        }

                                        String emptyCartMessage = "";
                                        if (userCartArrayListServiceNames.size() == 0) {
                                            emptyCartMessage = "\n\t\t\t  [The Cart is Empty]"; //if the cart is empty, the empty string variable will be replaced by this message and will be printed when the cart is printed
                                        }
                                        System.out.println("\t\t\t\t-- Your Cart: -- "+emptyCartMessage);

                                        for (int i = 0; i < userCartArrayListServiceNames.size(); i++) {
                                            int j = i+1;
                                            System.out.println("\t"+j+" - "+userCartArrayListServiceNames.get(i)+", $"+userCartArrayListServicePrices.get(i)+" per hour in "+userCartArrayListCategoryNames.get(i));
                                        }


                                        System.out.println("\nWould you like to... \n -> Remove items (enter R)\n -> Add more items from the Cleaning Category (enter A)\n -> Go back to the Category List (enter L)\n -> Proceed to Checkout (enter C)");
                                        String userDecisionBrowsingCleaning = sc.next().toUpperCase();
                                        switch (userDecisionBrowsingCleaning) {
                                            case "R":
                                                System.out.println("Great! Enter the number that corresponds with the service to remove it from the cart: ");
                                                int userInputRemoveServiceFromCart = sc.nextInt();
                                                if (!(userInputRemoveServiceFromCart > 0 && userInputRemoveServiceFromCart < userCartArrayListServiceNames.size()+1)) { //checks for invalid input and prints an error message
                                                    System.out.println("Invalid Input. Please try again.");
                                                } else if (!userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart-1).equals("Cleaning")) {
                                                    System.out.println("Unable to remove this service while in this category, please visit the " + userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart - 1) + " category to remove the selected service");
                                                    loopCleaningCategory = false; //doesn't allow the user to remove a service when it is currently in a different category (ex cant remove tutoring service when you are in the cleaning service page)
                                                    break;
                                                } else {
                                                    String removedItemMessage = "\""+userCartArrayListServiceNames.get(userInputRemoveServiceFromCart-1)+"\" for $"+userCartArrayListServicePrices.get(userInputRemoveServiceFromCart-1)+" per hour in the "+userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart-1)+" category.";

                                                    int oldUserInputRemoveServiceFromCart = userInputRemoveServiceFromCart-1 ; //saves the old index
                                                    int findIndexServiceName = cleaningCategoryServicesNamesArrayList.indexOf(userCartArrayListServiceNames.get(oldUserInputRemoveServiceFromCart)); //uses the old index to find the index of the service in the original array, which is then saved in the variable
                                                    userCartArrayListServiceNames.remove(userInputRemoveServiceFromCart-1);
                                                    userCartArrayListCategoryNames.remove(userInputRemoveServiceFromCart-1);
                                                    userCartArrayListServicePrices.remove(userInputRemoveServiceFromCart-1);
                                                    cleaningCategoryServicesAvailabilityArrayList.set(findIndexServiceName, true); //makes the service available again, uses the old index to find is corresponding availability in the original array


                                                    System.out.println("You have removed the following service from your cart: "+removedItemMessage+"\n" +
                                                            "\nHere is your updated cart: ");

                                                    if (userCartArrayListServiceNames.size() == 0) {
                                                        emptyCartMessage = "\n\t\t\t  [The Cart is Empty]"; //if the cart is empty, the empty string variable will be replaced by this message and will be printed when the cart is printed
                                                    }
                                                    System.out.println("\t\t\t\t-- Your Cart: -- "+emptyCartMessage);
                                                    for (int i = 0; i < userCartArrayListServiceNames.size(); i++) {
                                                        int j = i+1;
                                                        System.out.println("\t"+j+" - "+userCartArrayListServiceNames.get(i)+", $"+userCartArrayListServicePrices.get(i)+" per hour in "+userCartArrayListCategoryNames.get(i));
                                                    }
                                                    System.out.println("We will take you back to the Cleaning Services List."); //once removal is successful, it brings you back to the list of services you were browsing
                                                }
                                                break;
                                            case "A":
                                                System.out.println("Great! We will take you back to the list of Services in the Cleaning Category."); //takes you back to the list of services you were browsing
                                                break;
                                            case "L":
                                                System.out.println("Alright. We will take you back to the Category List."); //takes you back to the list of categories
                                                loopCleaningCategory = false;
                                                break;
                                            case "C":
                                                System.out.println("Wonderful. We will take you to the Checkout page now.");
                                                //if chosen, takes the user to the checkout page. Brings it to the main menu and sets the variable to case of the checkout (automatically goes to the checkout without printing the main menu again)
                                                loopCleaningCategory = false;
                                                browsingInputLoop = false;
                                                userInputAddBookExit = 3;
                                                break;
                                            default:
                                                System.out.println("This is not a valid input. Please try again."); //checks for invalid inputs and displays error message
                                                break;
                                        }
                                    }
                                    break;


                                case 2: //plumbing category services list
                                    boolean loopPlumbingCategory = true;
                                    while (loopPlumbingCategory) { //allows the user to loop through this category as many times as they want
                                        System.out.println("\nPlumbing Category Service List: ");
                                        for (int i = 0; i < plumbingCategoryServicesNamesArrayList.size(); i++) { //prints the services in the category
                                            int j = i + 1;
                                            String bookedServiceMessage = "";
                                            if (!plumbingCategoryServicesAvailabilityArrayList.get(i)) {
                                                bookedServiceMessage = "--> FULLY BOOKED"; //if booked, prints fully booked beside the service
                                            }
                                            System.out.println(j + " - " + plumbingCategoryServicesNamesArrayList.get(i) + ", $" + plumbingCategoryServicesPricesArrayList.get(i) + " per hour. "+bookedServiceMessage);
                                        }
                                        System.out.println("Please select which service you would like to add to your cart (enter the service's corresponding number), or enter 0 for the Category List: ");
                                        int plumbingServiceSelectionForCart = sc.nextInt();
                                        if (plumbingServiceSelectionForCart == 0) { //if 0, takes user to the category list
                                            loopPlumbingCategory = false;
                                            break;
                                        } else if (!(plumbingServiceSelectionForCart > 0 && plumbingServiceSelectionForCart < plumbingCategoryServicesNamesArrayList.size()+1)) {
                                            System.out.println("Your input is invalid. Please try again."); //checks for invalid input and displays error message
                                        } else {
                                            if (!plumbingCategoryServicesAvailabilityArrayList.get(plumbingServiceSelectionForCart - 1)) {
                                                System.out.println("Unfortunately, "+plumbingCategoryServicesNamesArrayList.get(plumbingServiceSelectionForCart - 1)+" is unavailable."); //if unavailable prints error message
                                            } else {
                                                System.out.println("The selected service is AVAILABLE"); //confirmation message, then the program adds the selected services' name, price, and category to the proper cart array lists
                                                userCartArrayListCategoryNames.add(categoryNamesArrayList.get(2)); //2 is the index for the plumbing category
                                                userCartArrayListServiceNames.add(plumbingCategoryServicesNamesArrayList.get(plumbingServiceSelectionForCart - 1));
                                                userCartArrayListServicePrices.add(plumbingCategoryServicesPricesArrayList.get(plumbingServiceSelectionForCart - 1));
                                                plumbingCategoryServicesAvailabilityArrayList.set(plumbingServiceSelectionForCart - 1, false); //makes availability false
                                                int cartSize = userCartArrayListServiceNames.size();
                                                System.out.println("You have successfully added the service \""+userCartArrayListServiceNames.get(cartSize-1)+"\" with the price of $"+userCartArrayListServicePrices.get(cartSize-1)+" per hour from the "+userCartArrayListCategoryNames.get(cartSize-1)+" Category to your cart.");
                                                System.out.println("Cart Size: "+cartSize);
                                            }
                                        }

                                        String emptyCartMessage = "";
                                        if (userCartArrayListServiceNames.size() == 0) {
                                            emptyCartMessage = "\n\t\t\t  [The Cart is Empty]"; //if the cart is empty, the empty string variable will be replaced by this message and will be printed when the cart is printed
                                        }
                                        System.out.println("\t\t\t\t-- Your Cart: -- "+emptyCartMessage);

                                        for (int i = 0; i < userCartArrayListServiceNames.size(); i++) {
                                            int j = i+1;
                                            System.out.println("\t"+j+" - "+userCartArrayListServiceNames.get(i)+", $"+userCartArrayListServicePrices.get(i)+" per hour in "+userCartArrayListCategoryNames.get(i));
                                        }


                                        System.out.println("\nWould you like to... \n -> Remove items (enter R)\n -> Add more items from the Plumbing Category (enter A)\n -> Go back to the Category List (enter L)\n -> Proceed to Checkout (enter C)");
                                        String userDecisionBrowsingTutoring = sc.next().toUpperCase();
                                        switch (userDecisionBrowsingTutoring) {
                                            case "R":
                                                System.out.println("Great! Enter the number that corresponds with the service to remove it from the cart: ");
                                                int userInputRemoveServiceFromCart = sc.nextInt();
                                                if (!(userInputRemoveServiceFromCart > 0 && userInputRemoveServiceFromCart < userCartArrayListServiceNames.size()+1)) {
                                                    System.out.println("Invalid Input. Please try again.");
                                                }  else if (!userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart-1).equals("Plumbing")) {
                                                    System.out.println("Unable to remove this service while in this category, please visit the " + userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart - 1) + " category to remove the selected service");
                                                    loopPlumbingCategory = false; //doesn't allow the user to remove a service when it is currently in a different category (ex cant remove tutoring service when you are in the cleaning service page)
                                                    break;
                                                } else {
                                                    String removedItemMessage = "\""+userCartArrayListServiceNames.get(userInputRemoveServiceFromCart-1)+"\" for $"+userCartArrayListServicePrices.get(userInputRemoveServiceFromCart-1)+" per hour in the "+userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart-1)+" category.";

                                                    int oldUserInputRemoveServiceFromCart = userInputRemoveServiceFromCart-1 ; //saves the old index
                                                    int findIndexServiceName = plumbingCategoryServicesNamesArrayList.indexOf(userCartArrayListServiceNames.get(oldUserInputRemoveServiceFromCart)); //uses the old index to find the index of the service in the original array, which is then saved in the variable
                                                    userCartArrayListServiceNames.remove(userInputRemoveServiceFromCart-1);
                                                    userCartArrayListCategoryNames.remove(userInputRemoveServiceFromCart-1);
                                                    userCartArrayListServicePrices.remove(userInputRemoveServiceFromCart-1);
                                                    plumbingCategoryServicesAvailabilityArrayList.set(findIndexServiceName, true); //makes the service available again, uses the old index to find is corresponding availability in the original array

                                                    System.out.println("You have removed the following service from your cart: "+removedItemMessage+"\n" +
                                                            "\nHere is your updated cart: "); //shows updated cart


                                                    if (userCartArrayListServiceNames.size() == 0) {
                                                        emptyCartMessage = "\n\t\t\t  [The Cart is Empty]"; //if the cart is empty, the string will be replaced by this message and will be printed when the cart is printed
                                                    }
                                                    System.out.println("\t\t\t\t-- Your Cart: -- "+emptyCartMessage);

                                                    for (int i = 0; i < userCartArrayListServiceNames.size(); i++) {
                                                        int j = i+1;
                                                        System.out.println("\t"+j+" - "+userCartArrayListServiceNames.get(i)+", $"+userCartArrayListServicePrices.get(i)+" per hour in "+userCartArrayListCategoryNames.get(i));
                                                    }
                                                    System.out.println("We will take you back to the Plumbing Services List."); //automatically brings the user back to the category they were viewing
                                                }
                                                break;
                                            case "A":
                                                System.out.println("Great! We will take you back to the list of Services in the Plumbing Category."); //brings the user back to the category they were viewing
                                                break;
                                            case "L":
                                                System.out.println("Alright. We will take you back to the Category List."); //brings the user to the list of categories
                                                loopPlumbingCategory = false;
                                                break;
                                            case "C":
                                                System.out.println("Wonderful. We will take you to the Checkout page now.");
                                                //if chosen, takes the user to the checkout page. Brings it to the main menu and sets the variable to case of the checkout (automatically goes to the checkout without printing the main menu again)
                                                loopPlumbingCategory = false;
                                                browsingInputLoop = false;
                                                userInputAddBookExit = 3;
                                                break;
                                            default:
                                                System.out.println("This is not a valid input. Please try again."); //checks for invalid inputs and displays error message
                                                break;
                                        }
                                    }
                                    break;

                                case 3: //freelancer category services list
                                    boolean loopFreelancerCategory = true;
                                    while (loopFreelancerCategory) { //allows user to loop through this category as many times as they want
                                        System.out.println("\nFreelancer Category Service List: ");
                                        for (int i = 0; i < freelancerCategoryServicesNamesArrayList.size(); i++) {
                                            int j = i + 1;
                                            String bookedServiceMessage = "";
                                            if (!freelancerCategoryServicesAvailabilityArrayList.get(i)) { //checks if booked
                                                bookedServiceMessage = "--> FULLY BOOKED"; //if fully booked, displays this message beside the service when it prints
                                            }
                                            System.out.println(j + " - " + freelancerCategoryServicesNamesArrayList.get(i) + ", $" + freelancerCategoryServicesPricesArrayList.get(i) + " per hour. "+bookedServiceMessage);
                                        }
                                        System.out.println("Please select which service you would like to add to your cart (enter the service's corresponding number), or enter 0 for the Category List: ");
                                        int freelancerServiceSelectionForCart = sc.nextInt();
                                        if (freelancerServiceSelectionForCart == 0) { //if 0, brings user back to the category list
                                            loopFreelancerCategory = false;
                                            break;
                                        } else if (!(freelancerServiceSelectionForCart > 0 && freelancerServiceSelectionForCart < freelancerCategoryServicesNamesArrayList.size()+1)) {
                                            System.out.println("Your input is invalid. Please try again."); //checks for invalid inputs and displays error message
                                        } else {
                                            if (!freelancerCategoryServicesAvailabilityArrayList.get(freelancerServiceSelectionForCart - 1)) {
                                                System.out.println("Unfortunately, "+freelancerCategoryServicesNamesArrayList.get(freelancerServiceSelectionForCart - 1)+" is unavailable.");
                                            } else {
                                                System.out.println("The selected service is AVAILABLE"); //confirmation message, then the program adds the selected services' name, price, and category to the proper cart array lists
                                                userCartArrayListCategoryNames.add(categoryNamesArrayList.get(3)); //3 is the index for the freelancer category
                                                userCartArrayListServiceNames.add(freelancerCategoryServicesNamesArrayList.get(freelancerServiceSelectionForCart - 1));
                                                userCartArrayListServicePrices.add(freelancerCategoryServicesPricesArrayList.get(freelancerServiceSelectionForCart - 1));
                                                freelancerCategoryServicesAvailabilityArrayList.set(freelancerServiceSelectionForCart - 1, false); //makes the service unavailable
                                                int cartSize = userCartArrayListServiceNames.size();
                                                System.out.println("You have successfully added the service \""+userCartArrayListServiceNames.get(cartSize-1)+"\" with the price of $"+userCartArrayListServicePrices.get(cartSize-1)+" per hour from the "+userCartArrayListCategoryNames.get(cartSize-1)+" Category to your cart.");
                                                System.out.println("Cart Size: "+cartSize);
                                            }
                                        }

                                        String emptyCartMessage = "";
                                        if (userCartArrayListServiceNames.size() == 0) {
                                            emptyCartMessage = "\n\t\t\t  [The Cart is Empty]"; //if the cart is empty, the empty string variable will be replaced by this message and will be printed when the cart is printed
                                        }
                                        System.out.println("\t\t\t\t-- Your Cart: -- "+emptyCartMessage);

                                        for (int i = 0; i < userCartArrayListServiceNames.size(); i++) {
                                            int j = i+1;
                                            System.out.println("\t"+j+" - "+userCartArrayListServiceNames.get(i)+", $"+userCartArrayListServicePrices.get(i)+" per hour in "+userCartArrayListCategoryNames.get(i));
                                        }


                                        System.out.println("\nWould you like to... \n -> Remove items (enter R)\n -> Add more items from the Freelancer Category (enter A)\n -> Go back to the Category List (enter L)\n -> Proceed to Checkout (enter C)");
                                        String userDecisionBrowsingTutoring = sc.next().toUpperCase();
                                        switch (userDecisionBrowsingTutoring) {
                                            case "R":
                                                System.out.println("Great! Enter the number that corresponds with the service to remove it from the cart: ");
                                                int userInputRemoveServiceFromCart = sc.nextInt();
                                                if (!(userInputRemoveServiceFromCart > 0 && userInputRemoveServiceFromCart < userCartArrayListServiceNames.size()+1)) {
                                                    System.out.println("Invalid Input. Please try again."); //checks for invalid inputs and displays error message
                                                }  else if (!userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart-1).equals("Freelancer")) {
                                                    System.out.println("Unable to remove this service while in this category, please visit the " + userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart - 1) + " category to remove the selected service");
                                                    loopFreelancerCategory = false; //doesn't allow the user to remove a service when it is currently in a different category (ex cant remove tutoring service when you are in the cleaning service page)
                                                    break;
                                                } else {
                                                    String removedItemMessage = "\""+userCartArrayListServiceNames.get(userInputRemoveServiceFromCart-1)+"\" for $"+userCartArrayListServicePrices.get(userInputRemoveServiceFromCart-1)+" per hour in the "+userCartArrayListCategoryNames.get(userInputRemoveServiceFromCart-1)+" category.";

                                                    int oldUserInputRemoveServiceFromCart = userInputRemoveServiceFromCart-1 ; //saves the old index
                                                    int findIndexServiceName = freelancerCategoryServicesNamesArrayList.indexOf(userCartArrayListServiceNames.get(oldUserInputRemoveServiceFromCart)); //uses the old index to find the index of the service in the original array, which is then saved in the variable
                                                    userCartArrayListServiceNames.remove(userInputRemoveServiceFromCart-1);
                                                    userCartArrayListCategoryNames.remove(userInputRemoveServiceFromCart-1);
                                                    userCartArrayListServicePrices.remove(userInputRemoveServiceFromCart-1);
                                                    freelancerCategoryServicesAvailabilityArrayList.set(findIndexServiceName, true); //makes the service available again, uses the old index to find is corresponding availability in the original array

                                                    System.out.println("You have removed the following service from your cart: "+removedItemMessage+"\n" +
                                                            "\nHere is your updated cart: ");


                                                    if (userCartArrayListServiceNames.size() == 0) {
                                                        emptyCartMessage = "\n\t\t\t  [The Cart is Empty]"; //if the cart is empty, the empty string variable will be replaced by this message and will be printed when the cart is printed
                                                    }
                                                    System.out.println("\t\t\t\t-- Your Cart: -- "+emptyCartMessage);

                                                    for (int i = 0; i < userCartArrayListServiceNames.size(); i++) {
                                                        int j = i+1;
                                                        System.out.println("\t"+j+" - "+userCartArrayListServiceNames.get(i)+", $"+userCartArrayListServicePrices.get(i)+" per hour in "+userCartArrayListCategoryNames.get(i));
                                                    }
                                                    System.out.println("We will take you back to the Freelancer Services List."); //automatically takes the user back to the category they were browsing
                                                }
                                                break;
                                            case "A":
                                                System.out.println("Great! We will take you back to the list of Services in the Freelancer Category."); //takes the user back to the category they were browsing
                                                break;
                                            case "L":
                                                System.out.println("Alright. We will take you back to the Category List."); //takes the user back to the category list
                                                loopFreelancerCategory = false;
                                                break;
                                            case "C":
                                                System.out.println("Wonderful. We will take you to the Checkout page now.");
                                                //if chosen, takes the user to the checkout page. Brings it to the main menu and sets the variable to case of the checkout (automatically goes to the checkout without printing the main menu again)
                                                loopFreelancerCategory = false;
                                                browsingInputLoop = false;
                                                userInputAddBookExit = 3;
                                                break;
                                            default:
                                                System.out.println("This is not a valid input. Please try again."); //checks for invalid input and prints error message
                                                break;
                                        }
                                    }
                                    break;
                                default: //checks for invalid input and prints error message
                                    System.out.println("Invalid input. Please try again.");
                                    break;
                            }
                        }
                    }
                    break;
                case 3:
                    //if input 3: check out case
                    System.out.println("\n\t\t\t   ⏵ Welcome to Checkout ⏴");
                    System.out.println("\t\t\t\t-- Your Final Cart: -- ");
                    int totalCostOfServices = 0;
                    for (int i = 0; i < userCartArrayListServiceNames.size(); i++) { //prints the final cart and adds the prices to the total cost of service variable
                        int j = i+1;
                        totalCostOfServices += userCartArrayListServicePrices.get(i);
                        System.out.println("\t"+j+" - "+userCartArrayListServiceNames.get(i)+" $"+userCartArrayListServicePrices.get(i)+" per hour");
                    }

                    System.out.println("\n\t\t\t\t\t\t\t\t\n" + "----------------------\n"+
                            "Final Cost:     $"+totalCostOfServices+" per hour"); //prints the total cost outside the loop
                    System.out.println("\nPlease confirm the order. Is everything in order? (Y/N)"); //gives user choice to confirm
                    String lastConfirmationOfCart = sc.next().toUpperCase();
                    if (lastConfirmationOfCart.equals("Y")) {
                        System.out.println("ServiceBot thanks you for confirming your order. Have a great day and enjoy the services you purchased!\n"); //prints this and the farewell message from case 0
                        userInputAddBookExit = 0;
                        break;
                    } else if (lastConfirmationOfCart.equals("N")){
                        System.out.println("Thank you for your selection. We will take you back to the main menu."); //does not print any final messages
                        userInputAddBookExit = -1;
                    }
                    break;
                default: //checks for invalid inputs and prints error message
                    System.out.println("This is not a valid option, please try again.");
                    userInputAddBookExit = -1;
                    break;
            }
        }
        sc.close();
    }
}