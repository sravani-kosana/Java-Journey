public class LogicalOperators {
    public static void main(String[] args) {

        int age = 19;
        boolean hasID = true;

        // Logical AND
        System.out.println("AND: " + (age >= 18 && hasID));

        // Logical OR
        System.out.println("OR: " + (age >= 18 || hasID));

        // Logical NOT
        System.out.println("NOT: " + (!hasID));
    }
}
