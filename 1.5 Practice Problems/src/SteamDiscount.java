public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */

    public static void main(String[] args) {
        double gameCost = 60.00;
        double discount = 0.2;

        double amountDiscountisWorth = gameCost * discount;
        double discountedPrice = gameCost - amountDiscountisWorth;

        System.out.println("The discounted price of this game is $" + discountedPrice);
    }
}
