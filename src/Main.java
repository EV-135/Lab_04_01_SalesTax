public class Main {
    public static void main(String[] args) {
        double purchase = 25.80;
        double tax = 0;
        double total = 0;
        tax = purchase*.05;
        total = purchase + tax;

        System.out.println("Your item total is "+purchase+", your toal tax is "+tax+", " +
                "and your total is "+total);
    }
}