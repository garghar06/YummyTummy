package food;
import java.util.Scanner;

public class YummyTummy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Address rAdd = new Address( "Cityville", "State", "12345");
        Restaurant restaurant = new Restaurant("Food Haven", rAdd, "555-123-4567", 4.5);
        System.out.println("Restaurant Information:");
        System.out.println(restaurant);
        
		String typeCustomer;
		Menu.displayMenu();
		System.out.println("Enter the item number you want to order : ");
		int choice;
		do {
			choice = sc.nextInt();
			if(choice>=1 && choice<=5) {
				Menu selectedItem = Menu.YummyTummyMenu().get(choice-1);
				System.out.println("Enter your Customer type from the following : RC , PC and GC ");
				typeCustomer = sc.next();
				switch(typeCustomer) {
				case "RC" :
					System.out.println("Enter your fname:");
					String fname = sc.next();
					sc.nextLine();
					System.out.println("Enter your lname:");
					String lname = sc.next();
					System.out.println("Enter your address:");
					String add = sc.next();
					System.out.println("Enter your phone no:");
					String ph = sc.next();
					System.out.println("Enter discount:");
					double dis = sc.nextDouble();
					sc.nextLine();
					RegularCustomers rc = new RegularCustomers(new Name(fname,lname),add,ph,dis);
					Order rco = new Order(1,rc);
					rco.addItemToOrder(selectedItem);
					
					System.out.println("Regular customers details: ");
					System.out.println("Customer id "+rc.cust_id);
					
					rco.getbill();
					System.out.println("Total Amount: rupee" + rc.payBill(rco));
					break;
					
				case "PC" :
					System.out.println("Enter your fname:");
					String pfname = sc.next();
					sc.nextLine();
					System.out.println("Enter your lname:");
					String plname = sc.next();
					System.out.println("Enter your address:");
					String padd = sc.next();
					System.out.println("Enter your phone no:");
					String pph = sc.next();
					System.out.println("Enter membership card number:");
					String mcn = sc.next();
					sc.nextLine();
					PremiumCustomer pc = new PremiumCustomer(new Name(pfname,plname),padd,pph,mcn);
					Order pco = new Order(1,pc);
					pco.addItemToOrder(selectedItem);
					
					System.out.println("Regular customers details: ");
					System.out.println("Customer id "+pc.cust_id);
					
					System.out.println("Bill :");
					pco.getbill();
					System.out.println("Total Amount: rupee" + pc.payBill(pco));
					break;
					
				case "GC" :
					System.out.println("Enter your fname:");
					String gfname = sc.next();
					sc.nextLine();
					System.out.println("Enter your lname:");
					String glname = sc.next();
					System.out.println("Enter your address:");
					String gadd = sc.next();
					System.out.println("Enter your phone no: ");
					String gph = sc.next();
					System.out.println("Enter delivery charges: ");
					double gd = sc.nextDouble();
					sc.nextLine();
				    Guest gc = new Guest(new Name(gfname,glname),gadd,gph,gd);
					Order gco = new Order(1,gc);
					gco.addItemToOrder(selectedItem);
					
					System.out.println("Regular customers details: ");
					System.out.println("Name "+gc.getName());
					System.out.println("Customer id "+gc.cust_id);
					System.out.println("Customer address "+gc.address);
					System.out.println("Phone no "+gc.phone_no);
					System.out.println("Item name  "+selectedItem.item_name);
					System.out.println("delivery charges "+gc.getDeliveryCharges());
					gco.getbill();
					System.out.println("Total Amount: rupee" + gc.payBill(gco));
					break;
					
				default:
					System.out.println("Thanks for visiting YummyTummy!!!");
				}
			}
		}while(choice!=0);
		
		
		
		sc.close();
	}

}
