import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String bill (String cusName, String cusType, double totalValue) {
        double totalPay = totalValue;
        double totalSale = 0;
        String billDetails = "Customer: " + cusName + "\n";
        billDetails += "Type: " + cusType + "\n";

        if (cusType == "vip1") {
            totalSale += totalValue * 0.05;
        }
        if (cusType == "vip2") {
            totalSale += totalValue * 0.1;
        }

        if (totalValue > 10000) {
            totalSale += totalValue * 0.1;
        } else if (totalValue > 5000) {
            totalSale += totalValue * 0.07;
        } else if (totalValue > 1000) {
            totalSale += totalValue * 0.01;
        }

        totalPay -= totalSale;

        billDetails += "Total Sale: " + totalSale * 1000 + " VND\n";
        billDetails += "Total Pay: " + totalPay * 1000 + " VND\n";

        return billDetails;
    }

    public static void main(String[] args) {
//        Customer customer1 = new Customer("Nguyen Van A", 1, "Norm");
//        Customer customer2 = new Customer("Nguyen Van B", 2, "Vip1");
//        Customer customer3 = new Customer("Nguyen Van C", 3, "Vip2");
//        ArrayList<Integer> customers = new ArrayList<>();
//        customers.add(customer1.getID());
//        customers.add(customer2.getID());
//        customers.add(customer3.getID());
//
//        Product product1 = new Product("Ao", 200, 5);
//        Product product2 = new Product("Quan dai", 300, 10);
//        Product product3 = new Product("Quan dui", 150, 20);
//        Product product4 = new Product("Khan quang", 100, 15);
//        ArrayList<String> productList = new ArrayList<>();
//        productList.add(product1.getName());
//        productList.add(product2.getName());
//        productList.add(product3.getName());
//        productList.add(product4.getName());

        double totalValue = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.print("Product: ");
            String product = scanner.next();
            product = product.toLowerCase();
            double productPrice = 0;

            switch (product) {
                case "ao":
                    productPrice = 200;
                    break;
                case "quan":
                    productPrice = 300;
                    break;
                case "khan quang":
                    productPrice = 100;
                    break;
                case "\n":
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Product");
                    flag = false;
                    break;
            }

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            totalValue += productPrice * quantity;
        } while (flag);

        String customerName = scanner.next();
        String customerType = scanner.next();
        customerType = customerType.toLowerCase();

        System.out.println(bill(customerName, customerType, totalValue));
    }
}
