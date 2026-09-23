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
		String drink="";
		if (drinkyn.startsWith("n")||drinkyn.startsWith("N")) {
				System.out.println("Sounds good, what would you like to eat?");
		} else {
				System.out.println("Perfect! You can choose from the options below, just type in what drink you want, and how many (item in first line, quantity in next)");
				System.out.println("Water-$1.00");
				System.out.println("Soda-$2.50");
				System.out.println("Milk-$1.50");
				System.out.println("Coffee-$3.00");
				System.out.println("Lemonade-$2.00");
				String drinkitem = in.nextLine();
				//milk and soda options
				if (drinkitem.equalsIgnoreCase("Soda")) {
				System.out.println("What type of Soda would you like? We have,");
				System.out.println("Coca-Cola");
				System.out.println("Fanta");
				System.out.println("Root Beer");
				System.out.println("Sprite");
				System.out.println("Dr. Pepper");
				drink = in.nextLine();
				drink = drink.toLowerCase();
				if (drink.startsWith("c")) {
					drink="Coca-Cola";
				}else if (drink.startsWith("f")) {
					drink="Fanta";
				}else if (drink.startsWith("r")) {
					drink="Root Beer";
				}else if (drink.startsWith("s")) {
					drink="Sprite";
				}else if (drink.startsWith("d")) {
					drink="Dr.Pepper";
				}else {
					System.out.println("Sorry thats not available, no drink for you");
				}}
				if (drinkitem.equalsIgnoreCase("Milk")) {
					System.out.println("What type of milk would you like?");
					System.out.println("We have almond, chocolate, strawberry, and regular milk");
					drink = in.nextLine();
					drink = drink.toLowerCase();
					if (drink.startsWith("a")) {
						drink="Almond Milk";
					}else if (drink.startsWith("c")) {
						drink="Chocolate Milk";
					}else if (drink.startsWith("s")) {
						drink="Strawberry Milk";
					}else if (drink.startsWith("r")) {
						drink="Regular Milk";
					}else {
						System.out.println("Sorry thats not available, no drink for you");
					}
				}
				//prices
				if (drinkitem.equalsIgnoreCase("Water")) {
					double drinkprice = (1.00);
					drink = ("Water");
				}
				if (drinkitem.equalsIgnoreCase("Soda")) {
					double drinkprice = (2.50);
				}
				if (drinkitem.equalsIgnoreCase("Coffee")) {
					double drinkprice = (3.00);
					drink = ("Coffee");
				}
				if (drinkitem.equalsIgnoreCase("Lemonade")) {
					double drinkprice = (2.00);
					drink = ("Lemonade");
				}
				if (drinkitem.equalsIgnoreCase("Milk")) {
					double drinkprice = (1.50);
				}
		}
	}
}
