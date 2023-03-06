public class ShopApp{
    public static void main(String[] args) {
        // DATA
        String productName1 = "Pizza";
        String productName2 = "Salad";
        String productName3 = "Apple Juce";
        
        int productPrice1 = 100;
        int productPrice2 = 85;
        int productPrice3 = 30;

        int orderQuantity1 = 5;
        int orderQuantity2 = 3;
        int orderQuantity3 = 8;
        
        // OPERATIONS
        int orderTotal1  = productPrice1 * orderQuantity1;
        int orderTotal2  = productPrice2 * orderQuantity2;
        int orderTotal3  = productPrice3 * orderQuantity3;

        int totalCosts = orderTotal1 + orderTotal2 + orderTotal3;

        // VIEW
        // 100  x 5 = 500

        System.out.println(); // pentru spatiu in terminal
        System.out.println(productName1 + " " + "(" + productPrice1+" MDL"+")" + " x "  + orderQuantity1 +  " items" + " = " + orderTotal1 + " MDL"); 
        System.out.println(productName2 + " " + "(" + productPrice2+" MDL"+")" + " x "  + orderQuantity2 +  " items" + " = " + orderTotal2 + " MDL"); 
        System.out.println(productName3 + " " + "(" + productPrice3+" MDL"+")" + " x "  + orderQuantity3 +  " items" + " = " + orderTotal3 + " MDL");  
        System.out.println("Total Costs: " + totalCosts + " MDL");  // costul total afisat
        System.out.println();
    
    
    }
}