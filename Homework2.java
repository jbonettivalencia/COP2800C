package cop2800;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Sales\tCommission");

        int sales = 5000;
        double commission;

        while (sales <= 20000) {
            if (sales <= 10000)
                commission = sales * 0.10;
            else if (sales <= 15000)
                commission = sales * 0.12;
            else
                commission = sales * 0.15;

            System.out.printf("$%,d\t$%.2f%n", sales, commission);
            sales += 1000;
        }
    }
}
