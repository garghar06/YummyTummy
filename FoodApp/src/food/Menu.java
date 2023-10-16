package food;
import java.util.*; 
public class Menu {
	String item_name;
	double price;
	
	Menu(String item_name,double price){
		this.item_name = item_name;
		this.price = price;
	}
	
	String getItemName() {
		return item_name;
	}
	void setItemName(String item_name) {
		this.item_name = item_name;
	}
	
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	
	static List<Menu> YummyTummyMenu(){
		List<Menu> menuItems = new ArrayList<>();
		
		menuItems.add(new Menu("Burger",50.45));
		menuItems.add(new Menu("Pizza",105.5));
		menuItems.add(new Menu("Fries",40.45));
		menuItems.add(new Menu("Salad",89.45));
		menuItems.add(new Menu("Diet Coke",90.45));
		
		return menuItems;
	}
	
	static void displayMenu() {
		System.out.println("-------Welcome to YummyTummy Menu--------------- ");
		for(int i=0;i<Menu.YummyTummyMenu().size();i++) {
			Menu item = Menu.YummyTummyMenu().get(i);
			System.out.println(item.getItemName()+" Price --> "+item.getPrice());
		}
	}

}
