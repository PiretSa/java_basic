package week8;

public class Ex12 {
    public static void main(String[] args) {

        Purchase purchase = new Purchase("milk", 4, 1);
        System.out.println( "the total price of a purchase containing four milks is " + purchase.price() );
        System.out.println( purchase );
        purchase.increaseAmount();
        System.out.println( purchase );
    }
}
