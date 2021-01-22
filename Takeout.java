package Remhomework;

public class Takeout {
    public static void displayMainmenu(){
        System.out.println("Please choose one of them");
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3. American");

    }
    public static void displayItalianFoodMenu() {
        System.out.println("Please choose items number");
        System.out.println("1. Lasanga Tray  feeds 5  price 17.99");
        System.out.println("2. Pizza Pack  feeds 7  price 15.99");
        System.out.println("3. Gazpacho soup, salad and bread stick pack  feeds 4  price 12.99");

    }
    public static void displayChineseFoodMenu() {
        System.out.println("Please choose item number");
        System.out.println("1. Chicken and broccoli tray (includes 7 wonton soups, 7 egg rolls) feeds 7  price 18.99");
        System.out.println("2. Sweet and sour pork tray  (includes 7 hot and sour soups, 7 egg rolls) feeds 7  price 18.99");
        System.out.println("3. Shrimp fried rice tray (includes 10 egg rolls) feeds 5  price 10.99");


    }
    public static void displayAmericanFoodMenu() {
        System.out.println("Please enter item number");
        System.out.println("1. Hamburger and hot dog tray - includes bun and condiments feeds 8 price 21.99");
        System.out.println("2. Grilled chicken sandwich and mozzarella stick tray - includes dipping sauces feeds 5 price 22.99");
        System.out.println("3. Barbeque tray - includes bun and peach cobbler feeds 10 price 26.99");

    }
    public static int DetermineTrays(int people, int feeds){
        int numberoftrays = 0;
        if(people%feeds==0){
         numberoftrays = (people/feeds) ;
        }
        else {
             numberoftrays = (people/feeds)+1;
        }
        System.out.println("you need " + numberoftrays + " trays");
        System.out.println("feeds: " + feeds);

        return numberoftrays;
    }
    public static double getSubTotal(double price, int trays) {
        double total = price*trays;
        System.out.println("the price for " + trays + " is " + total);
        return total;
    }
    public static double getTax(double subtotal, double taxrate){
        double totaltax = taxrate * subtotal;
        System.out.println("the total tax is " + totaltax);
        return totaltax;
    }
    public static double getTip(double subtotal, double tiprate){
        double totaltip = tiprate*subtotal;
        System.out.println("the total tip is " + totaltip);
        return totaltip;
    }
    public static double getGrandTotal(double subtotal, double tax, double tip){
        double grandtotal = subtotal + tax + tip;
        System.out.println("grandtotal amount is" + grandtotal);
        return grandtotal;
    }
    public static double pricePerPerson(double grandtotal, int person){
        double eachcost = grandtotal/person;
        System.out.println("each cost price is " + eachcost);
        return grandtotal;
    }
    public static int determineLeftOver(int feeds, int trays, int people){
        int leftover = (feeds*trays)-people;
        System.out.println("leftover serving for delivery person is: " + leftover);
        return feeds;
    }
}
