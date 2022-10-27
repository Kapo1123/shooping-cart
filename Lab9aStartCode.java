/*
Program/Project: Lab9a - Starter Code

Your Name: /*Sateki & Kapo & Desemond
Date: 06/14/2022
Instructor: Jeff Light
Description: Displays a menu to the screen 
*/
package Week09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab9aStartCode {
	/** main() method displays a menu to the user and asks them to select a command.
	 * The method will continue to display the menu to the user until they wish to quit by selecting 'Exit' from the menu.
	 * The method also creates a new, empty shoppingList of type ArrayList<String>
	 * Based on the user input, the appropriate method will be called to perform actions on the shoppingList.
	 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
	 */
	public static void main(String[] args) {
	    //Initialize variables
	    Scanner sIn = new Scanner(System.in);						//Input Scanner for String
	    ArrayList<String> shoppingList = new ArrayList<String>();	//ArrayList for shoppingList
	    String choice;												//Holds user input of type String
	    boolean done = false;										//Keeps program running until user wants to quit
	
	    // Keep running the program until the user quits
	    do{
	    	//Print out the menu to the console
	        System.out.println();
	        System.out.println("1. Add Items");
	        System.out.println("2. Delete Items");
	        System.out.println("3. Show Items");
	        System.out.println("4. Sort Items");
	        System.out.println("5. Exit");
	        System.out.print("Please enter a command: ");
	        choice = sIn.nextLine(); 
	        		
	        //Call the appropriate method for the choice selected.
	        switch (choice) { 
	            case "1":	//Add items to the Shopping List
	                System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
	                break;
	            case "2":	//Delete items from the Shopping List
	            	System.out.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
	                break;
	            case "3":	//Show the items in the Shopping List
	                showItems(shoppingList);
	                break;
	            case "4":	//Sort the items in the Shopping List
	                sortItems(shoppingList);
	                break;
	            case "5":	//Exit the program 
	            	System.out.println("\nGoodbye");
	                done = true;
	                break;
	            default:	//Handles all input that is not between 1-5
	            	System.out.println("Invalid response.  Please enter a choice from the menu (1-5).");
	        } //End of switch (choice) 
	    }while(!done);  //Keep running the program until the user quits
	}//end of main()


        //////////////////////////////////////////////
        // STUDENTS, FILL IN THE METHOD STUBS BELOW://
		//  addItems()								//
		//	deleteItems()							//
		//	showItems()								//
		//	sortItems()								//
        //////////////////////////////////////////////
	
	/** addItems() method asks the user to enter an item to be stored in the shoppingList and then adds the item to the shoppingList ArrayList.
	 * The user may enter as many items as they want, hitting ENTER to stop entering items and return to main().
	 * Each time the user enters an item into the list, a message will be displayed showing the item entered in the following format:
	 *     '<item>' has been added to the Shopping List.  [Example:  'Eggs' has been added to the Shopping List.]
	 * Returns the number of items added to the shoppingList
	 */
	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
		Scanner in = new Scanner(System.in);
		String answer;
		int items =0;
		boolean valid = false;
		while(!valid) {
		System.out.println("Please add an item to the list.(or just hit 'Enter' when done)");
		answer = in.nextLine();
		if (answer == "") {
			System.out.println(items + " items have been added to your Shopping List.");
			valid = true;
		} else{ 
		System.out.print(answer+" has been added to the Shopping List");
		items ++ ;
		shoppingList.add(answer);
		}
		}
		return items;
		

	}//end of method addItems(ArrayList<String>)

	
	/** deleteItems() method asks the user to enter an item to be deleted from the shoppingList and then deletes the item from the shoppingList ArrayList.
	 * The user may delete as many items as they want, hitting ENTER to stop deleting items and return to main().
	 * Each time the user deletes an item from the list, a message will be displayed showing the item deleted in the following format:
	 *     '<item>' has been deleted to the Shopping List.  [Example:  'Peaches' has been deleted to the Shopping List.]
	 * If the user tries to delete an item not in the list, a message will be displayed indicating the error and showItems() will be called.
	 * Returns the number of items deleted from the shoppingList
	 */	
	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
		Scanner in = new Scanner(System.in); 
		String answer;
		int items =0;
		boolean valid = false;
		while(!valid) {
		System.out.println("delete an item from the list.(or just hit 'Enter' when done)");
		answer = in.nextLine();
		if (shoppingList.contains(answer)) {
			items ++;
			System.out.println(items + " items have been removed from the Shopping List.");
			shoppingList.remove(answer);
			
	}// sucessful removed
		else if (answer == "") {
		
		System.out.print(items +" has been removed from your Shopping List");
		valid = true;
		} else {
			System.out.println("Invalid reponse!" + answer + " is not an item in the list!");
			showItems(shoppingList);
		}
		
		}
		return items;		

	}//end of method deleteItems(ArrayList<String>)
	
	
	/** showItems() method simply displays the contents of the shoppingList ArrayList in it's simplest form:
	 * Example output:
	 * 
	 * The Shopping List contains the following items:
	 * [item-1, item-2, item-n]
	 */	
	public static void showItems(ArrayList<String> shoppingList) {
		System.out.println(shoppingList);
	}//end of method showItems(ArrayList<String>)
	
	
	/** sortItems() method sorts the items in the shoppingList ArrayList, then calls showItems() to display the sorted list.
	 * Example output:
	 * The Shopping List has been sorted.
	 * 
	 * The Shopping List contains the following items:
	 * [item-1, item-2, item-n]
	 */	
	public static void sortItems(ArrayList<String> shoppingList) {
		Collections.sort(shoppingList);
		System.out.println("The Shopping List has been sorted.");	
	}//end of method sortItems(ArrayList<String>)

}//end of class Lab9aStartCode
