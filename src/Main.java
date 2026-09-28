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
		System.out.println("Welcome to Kara's Gluten-Free Bakery!");
		System.out.println("Would you like a drink to start?");
		String drinkyn = in.nextLine();
		String drink="";
		int drinkqty = 0;
		String receipt1 ="";
		String receipt2="";
		double drinkprice = 0;
		if (drinkyn.startsWith("n")||drinkyn.startsWith("N")) {

		} else {
				System.out.println("Perfect! You can choose from the options below, just type in what drink you want, and how many");
				System.out.println("Water-$1.00");
				System.out.println("Soda-$2.50");
				System.out.println("Milk-$1.50");
				System.out.println("Coffee-$3.00");
				System.out.println("Lemonade-$2.00");
				System.out.println("DRINK:");
				String drinkitem = in.nextLine();
				System.out.println("QUANTITY:");
				drinkqty = in.nextInt();
				
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
					drinkprice = (1.00);
					drink = ("Water");
				}
				if (drinkitem.equalsIgnoreCase("Soda")) {
					 drinkprice = (2.50);
				}
				if (drinkitem.equalsIgnoreCase("Coffee")) {
					 drinkprice = (3.00);
					drink = ("Coffee");
				}
				if (drinkitem.equalsIgnoreCase("Lemonade")) {
					 drinkprice = (2.00);
					drink = ("Lemonade");
				}
				if (drinkitem.equalsIgnoreCase("Milk")) {
					 drinkprice = (1.50);
				}
		}
		//Food time
		System.out.println("Sounds good! Can I get you something to eat?");
		String foodyn = in.nextLine();
		String food="";
		String flavour ="";
		int foodqty=0;
		double foodprice = 0;
		double price1=0;
		String discount="";
		String filling ="";
		if (foodyn.startsWith("n")||foodyn.startsWith("N")) {

		} else {
			System.out.println("Good choice! State below what you would like to eat, and how many");
			System.out.println("Cake-$10.00");
			System.out.println("Doughnut-$7.00");
			System.out.println("Cake Pop-$4.50");
			System.out.println("Cookie-$3.00");
			System.out.println("Cupcake-$2.00");
			System.out.println("Croissant-$4.00");
			System.out.println("Cinnamon Roll-$2.50");
			System.out.println("FOOD:");
			food = in.nextLine();
			System.out.println("QUANTITY:");
			foodqty = in.nextInt();
			//flavor for all
			if (food.equalsIgnoreCase("Cake")) {
				System.out.println("What type of Cake would you like? We have,");
				System.out.println("Vanilla");
				System.out.println("Chocolate");
				System.out.println("Red Velvet");
				System.out.println("Lemon");
				System.out.println("Funfetti");
				flavour = in.nextLine();
				flavour = flavour.toLowerCase();
				if (flavour.startsWith("c")) {
					flavour=" Chocolate ";
				}else if (flavour.startsWith("f")) {
					flavour=" Funfetti ";
				}else if (flavour.startsWith("v")) {
					flavour=" Vanilla ";
				}else if (flavour.startsWith("l")) {
					flavour=" Lemon ";
				}else if (flavour.startsWith("r")) {
					flavour=" Red Velvet ";
				}else {
					System.out.println("Sorry thats not available, no Cake for you");
				}}
			if (food.equalsIgnoreCase("Cake Pop")) {
				System.out.println("What type of Cake Pop would you like? We have,");
				System.out.println("Vanilla");
				System.out.println("Chocolate");
				System.out.println("Red Velvet");
				System.out.println("Lemon");
				System.out.println("Funfetti");
				flavour = in.nextLine();
				flavour = flavour.toLowerCase();
				if (flavour.startsWith("c")) {
					flavour=" Chocolate ";
				}else if (flavour.startsWith("f")) {
					flavour=" Funfetti ";
				}else if (flavour.startsWith("v")) {
					flavour=" Vanilla ";
				}else if (flavour.startsWith("l")) {
					flavour=" Lemon ";
				}else if (flavour.startsWith("r")) {
					flavour=" Red Velvet ";
				}else {
					System.out.println("Sorry thats not available, no Cake Pop for you");
				}}
			if (food.equalsIgnoreCase("Cupcake")) {
				System.out.println("What type of Cupcake would you like? We have,");
				System.out.println("Vanilla");
				System.out.println("Chocolate");
				System.out.println("Red Velvet");
				System.out.println("Lemon");
				System.out.println("Funfetti");
				flavour = in.nextLine();
				flavour = flavour.toLowerCase();
				if (flavour.startsWith("c")) {
					flavour=" Chocolate ";
				}else if (flavour.startsWith("f")) {
					flavour=" Funfetti ";
				}else if (flavour.startsWith("v")) {
					flavour=" Vanilla ";
				}else if (flavour.startsWith("l")) {
					flavour=" Lemon ";
				}else if (flavour.startsWith("r")) {
					flavour=" Red Velvet ";
				}else {
					System.out.println("Sorry thats not available, no Cupcake for you");
				}}
			if (food.equalsIgnoreCase("Doughnut")) {
				System.out.println("What type of Doughnut would you like? We have,");
				System.out.println("Regular Glazed");
				System.out.println("Chocolate Glazed");
				System.out.println("Boston Cream");
				System.out.println("Jelly-Filled");
				flavour = in.nextLine();
				flavour = flavour.toLowerCase();
				if (flavour.startsWith("r")) {
					flavour=" Regular Glazed ";
				}else if (flavour.startsWith("c")) {
					flavour=" Chocolate Glazed ";
				}else if (flavour.startsWith("b")) {
					flavour=" Boston Cream ";
				}else if (flavour.startsWith("j")) {
					flavour=" Jelly-Filled ";
				}else {
					System.out.println("Sorry thats not available, no Doughnut for you");
				}}
			if (food.equalsIgnoreCase("Cookie")) {
				System.out.println("What type of Cookie would you like? We have,");
				System.out.println("Chocolate Chip");
				System.out.println("Peanut Butter");
				System.out.println("Oatmeal Raisin");	
				System.out.println("Snickerdoodle");
				flavour = in.nextLine();
				flavour = flavour.toLowerCase();
				if (flavour.startsWith("c")) {
					flavour=" Chocolate Chip ";
				}else if (flavour.startsWith("p")) {
					flavour=" Peanut Butter ";
				}else if (flavour.startsWith("o")) {
					flavour=" Oatmeal Rasin ";
				}else if (flavour.startsWith("s")) {
					flavour=" Snickerdoodle ";
				}else {
					System.out.println("Sorry thats not available, no Cookies for you");
				}}
			//croissant filling
			if (food.equalsIgnoreCase("Croissant")) {
				System.out.println("What type of filling would you like? We have,");
				System.out.println("Chocolate");
				System.out.println("Almond");
				System.out.println("Cream and Fruit");
				System.out.println("Jam");
				filling = in.nextLine();
				filling = filling.toLowerCase();
				if (filling.startsWith("c")) {
					filling=" Chocolate filled ";
				}else if (filling.startsWith("A")) {
					filling=" Almond Spread filled ";
				}else if (filling.startsWith("c")) {
					filling=" Cream and Fruit filled ";
				}else if (filling.startsWith("J")) {
					filling=" Jam filled ";
				}else {
					System.out.println("Sorry thats not available, no filling for you");
				}}
			//prices
			if (food.equalsIgnoreCase("Cake")) {
				foodprice = (10.00);
				food = (" Cake");
			}
			if (food.equalsIgnoreCase("Doughnut")) {
				foodprice = (7.00);
				food=(" Doughnut");
			}
			if (food.equalsIgnoreCase("Cake Pop")) {
				foodprice = (4.50);
				food = (" Cake Pop");
			}
			if (food.equalsIgnoreCase("Cookie")) {
				foodprice = (3.00);
				food = (" Cookie");
			}
			if (food.equalsIgnoreCase("Cupcake")) {
				foodprice = (2.00);
				food = (" Cupcake");
			}
			if (food.equalsIgnoreCase("Croissant")) {
				foodprice = (4.00);
				food = (" Croissant");
			}
			if (food.equalsIgnoreCase("Cinnamon Roll")) {
				foodprice = (2.50);
				food = (" Cinnamon Roll");
			}
			//math!! receipt
			double price3=0;
			double price = (foodprice+drinkprice*drinkqty*foodqty);
			if (price>=30) {
				price1=price*0.9;
				 discount = ("10% Discount");
				 price3 = (price1-price);
			}else if (price>=50) {
				price1=price*0.8;
				 discount=("20% Discount");
				 price3 = (price1-price);
			}
			double totalprice = (price1*1.13);
			double tax =  (totalprice-price1);
			receipt1 =  (drinkqty+" "+drink+" for $"+drinkprice+", "+foodqty+flavour+filling+food+" for $"+foodprice );
			receipt2 = ("Subtotal: $"+price+" "+discount+": -$"+price3+" Tax: $"+tax+" Total: $"+totalprice);
			System.out.println(receipt1);
			System.out.println(receipt2);
		}
	}
}
