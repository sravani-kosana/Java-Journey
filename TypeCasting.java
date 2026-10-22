public class TypeCasting {
    public static void main(String[] args) {

        // Widening: int to double
        int number = 10;
        double decimal = number;

        System.out.println("Original integer: " + number);
        System.out.println("After widening: " + decimal);

        // Narrowing: double to int
        double price = 99.99;
        int convertedPrice = (int) price;

        System.out.println("Original decimal: " + price);
        System.out.println("After narrowing: " + convertedPrice);
    }
}
