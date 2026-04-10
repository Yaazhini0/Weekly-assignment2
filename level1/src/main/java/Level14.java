public class Level14 {
    public static void main(String[] args){
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        System.out.println("The cost price is INR "+costPrice+" ad Selling price is INR "+ sellingPrice);
        System.out.println("The Profit is INR "+ profit+" and the Profit Percentage is "+profitPercentage);
    }
}

