public class Pricing {

    // Buy three for a USD
    public static double threeForaDollar (int qty, double price) {
        
        // if quantity less then three, the price is without offer
        if (qty < 3) {
            return qty * price;
        }
        else {
            // Price for every 3 items is equal to 1 USD, The modulo take the price without offer
            return (qty/3) * 1 + (qty % 3) * price;

        }
    }

        // Buy two and get one free
    public static double buyTwoGetOneFree (int qty, double price) {
        // If quantity is less then 3, the offer is not applied
        if (qty < 3) {
            return qty * price;
        }
        else{
            // calculate how many free items, then reduce them from the qty to calculate the final price
             int free = qty/3;
             return (qty - free) * price;
        }
    }
       
        // Default calculation for items prices based on weight 
    public static double defaultPerWeight (Double qty, double price) {
        
            return qty * price;

    }

    // Default calculation for prices per items 
    public static double defaultItem (int qty, double price) {
        
        return qty * price;

}
    
}
