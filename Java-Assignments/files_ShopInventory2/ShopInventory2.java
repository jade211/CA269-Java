import java.util.List;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.*;


class Item {
    final String name; // TODO: specify the name should not change once assigned
    final double price;  // price is a fixed double to allow decimal values

    // CONSTRUCTORS ////
    //TODO: Contructor that assigns a name and a price
    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // METHODS /////
    // getters & setters /////
    public String getName() {return this.name; }
    public double getPrice() { return this.price; }
 
    // TODO: toString method that returns the name and price of the item
    public String toString() { return this.name + " " + this.price; }
}




// TODO: Basket - STACK (LIFO)
class Basket {
    private final Stack<Item> basket;

    Basket() {
        // TODO: -> create the stack
        // List<integer> list = new Stack<Integer>();
        this.basket = new Stack<Item>();
    }

    // TODO: Add items to basket (push)
    public void addItem(Item item) {
        this.basket.push(item);
    }

    // TODO: Remove items from basket (pop)
    public Item removeItem() {
        if(this.size()) {
            return this.basket.pop();
        }
        return null;
    }

    // ***TODO: calculates the size of the basket for the removal of items.
    public boolean size() {
        return (this.basket.size() > 0);
    }
    
    public String toString() {
        return "basket:" + this.basket.toString();
    }
}




class Checkout {
    private final Queue<Item> checkout;

    // TODO: - create the queue, add items from basket by using addItem()
    Checkout(Basket basket) {
        this.checkout = new LinkedList<Item>();
        while (basket.size()) {
            Item basket_removed = basket.removeItem();
            this.checkout.add(basket_removed);
        }
    }


    // TODO: Adds to checkout bag
    public void addItem(Item item) {
        this.checkout.add(item);
    }

    
    // TODO: Removes from checkout bag
    public Item removeItem() {
        // if(!(this.checkout.isEmpty())) {
        if(size()) {
            return this.checkout.remove();
        }
        else {
            return null;
        }
    }

    public String toString() {
        return "checkout:" + this.checkout.toString();
    }
    
    // TODO: gets checkout size for removal of items
    public boolean size() {
        return (this.checkout.size() > 0);
    }

}




class Bill {
    private final Map<String, Integer> basket;
    private double price;

    // TODO: - initialise Map, set price, bill items from checkout
    Bill(Checkout checkout) {
        this.basket = new LinkedHashMap<String, Integer>();
        this.price = 0.00;
        while (checkout.size()) {
            Item checkout_removed = checkout.removeItem();
            this.billItem(checkout_removed);
        }
    }

    // TODO: - put item in map, keep count of same items being billed
    // Note that the Map is from String to Integer
    // Items have names as Strings and count of items is an integer
    public void billItem(Item item) {
        String item_name = item.getName();
        if (!(this.basket.containsKey(item_name))) {
            this.basket.put(item_name, 1);
        } else {
            int old_value = this.basket.get(item_name);
            this.basket.put(item_name, old_value + 1);
        }
        this.price += item.getPrice();
    }


    public double getTotal() {
        return this.price;
    }

    public String toString() {
        String output = "";
        for(String item: this.basket.keySet()) {
            output += item + " (" + this.basket.get(item) + "nos)\n";
        }
        return output + "total: " + this.price;
    }
}


// MAIN CLASS **
public class ShopInventory2 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        loadBasket(basket);
        // System.out.println(basket); // for DEBUG
        Checkout checkout = new Checkout(basket);
        // System.out.println(checkout); // for DEBUG
        Bill bill = new Bill(checkout);
        System.out.println(bill);
    }
    
    
    static void loadBasket(Basket basket) {
        basket.addItem(new Item("Twinings Earl Grey Tea", 4.50));
        basket.addItem(new Item("Folans Orange Marmalade", 4.00));
        basket.addItem(new Item("Free-range Eggs", 3.35));
        basket.addItem(new Item("Brennan's Bread", 2.15));
        basket.addItem(new Item("Ferrero Rocher", 7.00));
        basket.addItem(new Item("Ferrero Rocher", 7.00));
    }
}
