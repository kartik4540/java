import java.util.*;

class LensGlasses {
    String brand;
    String type;
    double price;
    int quantity;

    public LensGlasses(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        
    }

    public String toString() {
        return "Brand: " + brand + "\nType: " + type + "\nPrice: $" + price;
    }
}
	


class ShoppingCart {
    List<LensGlasses> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(LensGlasses item) {
        items.add(item);
    }

    public void removeItem(int index) {
        items.remove(index);
    }

    public double calculateTotal() {
        double total = 0;
        for (LensGlasses item : items) {
            total += item.price;
        }
        return total;
    }

    public void displayItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Item " + (i+1) + ":");
            System.out.println(items.get(i));
            System.out.println();
        }
    }
    public String getBrandNames() {
        StringBuilder sb = new StringBuilder();
        for (LensGlasses item : items) {
            sb.append(item.brand);
            sb.append("\t");
            sb.append(item.price);
            sb.append("\n");
        }
        sb.delete(sb.length() - 2, sb.length()); 
        return sb.toString();
}
}
class user {
    void detail(String name,String add2,String phone,String state,String city,String pin,int ch)
	{
	 System.out.println("\n*DETAILS*");
   
   System.out.println("Your name---\t " +name);
   System.out.println("Address ---\t "+add2);
   System.out.println("Phone number---\t "+phone);
   System.out.println("State---\t "+state);
   System.out.println("City---\t\t "+city);
   System.out.println("Pincode---\t "+pin);
   System.out.println("Mode of payment---\t ");
   if(ch==1)
    {
        System.out.print("COD");
    }
    else if(ch==2)
    {
        System.out.print("Net Banking");
    }
    else if(ch==3)
    {
        System.out.print("Credit or Debit Card");
    }

	}
    public static void main(String[] args) {
        String correctUsername = "Reetam";
        String correctPassword = "Kartik";

        Scanner sc = new Scanner(System.in);
        System.out.print(">>>>>>>>>>\t\t    L E N S  K I N G    \t\t<<<<<<<<<< /n");
        System.out.print("\n\nEnter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");

         
            System.out.println("Welcome, " + username + "!");
                LensGlasses lg1 = new LensGlasses("Ray-Ban", "Aviator", 10000.0 );
                LensGlasses lg2 = new LensGlasses("Oakley", "Holbrook", 12000.0);
                LensGlasses lg3 = new LensGlasses("Gucci", "Oversized Square", 20000.0);
                LensGlasses lg4 = new LensGlasses("Essilor", "Oversized Round", 8000.0);
                LensGlasses lg5 = new LensGlasses("Zeiss", "Square", 13000.0);
                LensGlasses lg6 = new LensGlasses("Hoya", "UV protection", 20000.0);
                LensGlasses lg7 = new LensGlasses("Rodenstock", "Glare coated", 10000.0);
                LensGlasses lg8 = new LensGlasses("Maui Jim", "Rounded", 9000.0);
                LensGlasses lg9 = new LensGlasses("Shamir", "Seamless vision", 5000.0);
                LensGlasses lg10 = new LensGlasses("Seiko", "Sunglass", 18000.0);
            
            
                ShoppingCart cart = new ShoppingCart();
                List<LensGlasses> availableItems = new ArrayList<>();
                availableItems.add(lg1);
                availableItems.add(lg2);
                availableItems.add(lg3);
                availableItems.add(lg4);
                availableItems.add(lg5);
                availableItems.add(lg6);
                availableItems.add(lg7);
                availableItems.add(lg8);
                availableItems.add(lg9);
                availableItems.add(lg10);
                
            
            
                System.out.println("Welcome to our online shopping store for Lens Glasses!");
                System.out.println("Here are the available items: ");
                for (int i = 0; i < availableItems.size(); i++) {
                    System.out.println("Item " + (i+1) + ":");
                    System.out.println(availableItems.get(i));
                    System.out.println();
                }
            
                while (true) {
                    System.out.println("Enter the index of the item you want to add to your cart (0 to exit):");
                    int index = sc.nextInt();
                    if (index == 0) {
                        break;
                    } else if (index < 1 || index > availableItems.size()) {
                        System.out.println("Invalid index. Please try again.");
                        continue;
                    }
                    LensGlasses selected = availableItems.get(index-1);
                    System.out.println("You have selected the following item:");
                    System.out.println(selected);
                    System.out.println();
                    cart.addItem(selected);
                }
            
                System.out.println("\nHere are the items in your cart:");
                cart.displayItems();
            
                System.out.println("\nDo you want to remove an item from your cart? (y/n)");
                
                String choice = sc.next();
               
                while (choice.equalsIgnoreCase("y")) {
                    System.out.println("Enter the index of the item you want to remove:");
                    int index = sc.nextInt();
                    cart.removeItem(index-1);
                    System.out.println("\n\nHere are the updated items in your cart:");
                    cart.displayItems();
                    System.out.println("\nDo you want to remove an item from your cart? (y/n)");
                    choice = sc.next();
                    if(choice.equalsIgnoreCase("y")){  
                   continue;
                    }else{break;}
                    
                }
                System.out.println(cart.getBrandNames());
                double total = cart.calculateTotal();
                System.out.println("Your total cost is: $" + total);
            
                System.out.println("\n\n**DETAILS**");
                System.out.println("\nEnter name");
                String name_=sc.nextLine();
                sc.nextLine();
                System.out.println("\nAddress");
                String add2_=sc.nextLine();
                sc.nextLine();
                System.out.println("\nPhone");
                String phone_=sc.nextLine();
                sc.nextLine();
                System.out.println("\nState");
                String state_=sc.nextLine();
                sc.nextLine();
                System.out.println("\nCity");
                String city_=sc.nextLine();
                sc.nextLine();
                System.out.println("\nPincode");
                String pin_=sc.nextLine();
                sc.nextLine();
                
                System.out.println("\nMode of Payment");
                System.out.println("\nMode of Payment\n1.COD\n2.Net banking\n3.Credit or Debit card");
                 int ch_=sc.nextInt();
                 user ob=new user();
            ob.detail(name_,add2_,phone_,state_,city_,pin_,ch_);
            
            }
            
            
        else {
            System.out.println("Invalid username or password. Login failed.");
        }

        sc.close();
}}
