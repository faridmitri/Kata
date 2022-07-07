import java.util.Scanner;

public class App {
    static double totalthree;
    static double totalbuytwo;
    static double totalPerPound;
    static double totalPerItem;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       
        // call offer 1: Get three for one USD
        offer1();
        // call offer 2 buy two and get one free
        offer2();
        // default pricing by weight 
        defaultWeight();
        // default pricing by Items
        defaultItem();
        // Total to pay
        double total = totalPerItem + totalPerPound + totalbuytwo + totalthree;
        System.out.println("Your total amount is: " + total + " USD");
        
    }

    public static void offer1() {
       

        System.out.println("Enter one unit price from the offer product (Get three  for one usd): ");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter Number of Qty from the offer product (Get three  for one usd): ");
        
        if (sc.hasNextInt()) {
            int three = sc.nextInt();
            totalthree =  Pricing.threeForaDollar(three,unitPrice);
            System.out.println("You bought " + three + " Items for: " + totalthree + " USD from three for one USD offer");
        }
        else
            {
                System.out.println("Enter a Valid Qty  !!");
                sc.next();
                offer1();
                
            }
        }


        public static void offer2() {
       
            System.out.println("Enter one unit price from the offer product (Buy two and get one free): ");
            double unitPrice = sc.nextDouble();
            System.out.println("Enter Number of Qty from the offer product (Buy two and get one free): ");
            if (sc.hasNextInt()) {
                int three = sc.nextInt();
                totalbuytwo =  Pricing.buyTwoGetOneFree(three,unitPrice);
                System.out.println("Youu bought " + three + " Items for: " + totalbuytwo + " USD from Buy two get one free offer");
            }
            else
                {
                    System.out.println("Enter a Valid Qty  !!");
                    sc.next();
                    offer2();
                  
                }
            }

            public static void defaultWeight() {
       
                System.out.println("Enter the price of 1 pound: ");
                double poundPrice = sc.nextDouble();
                System.out.println("Enter Number of Qty from the offer product (Buy two and get one free): ");
                double qtyPound = sc.nextDouble();
                totalPerPound =  Pricing.defaultPerWeight(qtyPound,poundPrice);
                System.out.println("Youu bought " + qtyPound + " Pound for: " + totalPerPound + " USD");
                }


                public static void defaultItem() {
       
                    System.out.println("Enter the Price of one Item: ");
                    double priceItem = sc.nextDouble();
                    System.out.println("Enter Number of Items: ");
                    
                    if (sc.hasNextInt()) {
                        int items = sc.nextInt();
                        totalPerItem=  Pricing.defaultItem(items,priceItem);
                        System.out.println("You bought " + items + " Items for: " + totalPerItem + " USD");
                    }
                    else
                        {
                            System.out.println("Enter a Valid Qty  !!");
                            sc.next();
                            defaultItem();

                        }
                    }
            

    


}
