import java.util.*;
/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date: Friday Sept. 25
 * Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the following criteria:
Create a restaurant of your choosing
Print menu items one at a time, including the price.
Ask how many of each item they would like to purchase
Must have at least 5 different menu items
Calculate the total price
If the total is more than $30, take off 10%.
If the total is more than $50, take off 20%.
Add 13% HST  to the total
Print out the initial price, any discounts, taxes, and the grand total.
Read in a payment amount from the user
Calculate the change
If the change is negative, state that they still owe you money.
This is to be done individually.
DO NOT use AI! 
Feel free to use previous notes, videos, and online resources like w3schools.com
Fork the repository, add me (MrZebarth) as a collaborator, clone the repository to your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to");
		System.out.println("Would you like a drink to start?");
		String drinkyn = in.nextLine();
		if (drinkyn.equalsIgnoreCase("yes")) {
				System.out.println("Perfect! You can choose from the options below, just type in what drink you want");
				System.out.println("Water-$1.00");
				System.out.println("Soda-$2.50");
				//add options for soda and milk
				System.out.println("Milk-$1.50");
				System.out.println("Coffee-$3.00");
				System.out.println("Lemonade-$2.00");
				String drinkitem = in.nextLine();
				if (drinkitem.equalsIgnoreCase("Water")) {
					double drinkprice = (1.00);
				}
				if (drinkitem.equalsIgnoreCase("Soda")) {
					double drinkprice = (2.50);
				}
				if (drinkitem.equalsIgnoreCase("Coffee")) {
					double drinkprice = (3.00);
				}
				if (drinkitem.equalsIgnoreCase("Lemonade")) {
					double drinkprice = (2.00);
				}
		} else {
				System.out.println("Sounds good, what would you like to eat?");
			}
	}

}
