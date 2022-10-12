import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String bill (String cusName, String cusType, double totalValue) {
        double totalPay = totalValue;
        double totalSale = 0;
        String billDetails = "** BILL DETAILS **\n";
        billDetails += "Customer: " + cusName + "\n";
        billDetails += "Type: " + cusType + "\n";

        if (cusType == "vip1") {
            totalSale += totalValue * 0.05;
        }
        if (cusType == "vip2") {
            totalSale += totalValue * 0.1;
        }

        if (totalValue >= 10000) {
            totalSale += totalValue * 0.1;
        } else if (totalValue >= 5000) {
            totalSale += totalValue * 0.07;
        } else if (totalValue >= 1000) {
            totalSale += totalValue * 0.05;
        }

        totalPay -= totalSale;

        billDetails += "Total Value: " + (int) totalValue * 1000 + " VND\n";
        billDetails += "Total Sale: " + (int) totalSale * 1000 + " VND\n";
        billDetails += "Total Pay: " + (int) totalPay * 1000 + " VND\n";

        return billDetails;
    }

    public static void main(String[] args) {
//        double totalValue = 0;
//        Scanner scanner = new Scanner(System.in);
//        boolean flag = true;
//
//        do {
//            System.out.print("Product: ");
//            String product = scanner.next();
//            double productPrice = 0;
//
//            switch (product.toLowerCase()) {
//                case "ao":
//                    productPrice = 200;
//                    break;
//                case "quan":
//                    productPrice = 300;
//                    break;
//                case "khan quang":
//                    productPrice = 100;
//                    break;
//                default:
//                    System.out.println("Invalid Product!");
//                    flag = false;
//                    break;
//            }
//
//            if(flag) {
//                System.out.print("Quantity: ");
//                int quantity = scanner.nextInt();
//                totalValue += productPrice * quantity;
//            }
//
//            System.out.print("Continue?: ");
//            String cont = scanner.next();
//            if (cont.toLowerCase() == "yes") {
//                flag = true;
//            } else {
//                flag = false;
//            }
//        } while (flag);
//
//        scanner.nextLine();
//        String customerName = scanner.nextLine();
//        String customerType = scanner.nextLine();
//        customerType = customerType.toLowerCase();
//
//        System.out.println(bill(customerName, customerType, totalValue));

        double totalValue = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.print("Product: ");
            String product = scanner.next();
            double productPrice = 0;

            switch (product.toLowerCase()) {
                case "ao":
                    productPrice = 200;
                    break;
                case "quan":
                    productPrice = 300;
                    break;
                case "khan quang":
                    productPrice = 100;
                    break;
                default:
                    System.out.println("Invalid Product!");
                    flag = false;
                    break;
            }

            if(flag) {
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();
                totalValue += productPrice * quantity;
            }

            System.out.print("Continue?: ");
            String cont = scanner.next();
            if (cont.toLowerCase() == "yes") {
                flag = true;
            } else {
                flag = false;
            }
        } while (flag);

        scanner.nextLine();
        String customerName = scanner.nextLine();
        String customerType = scanner.nextLine();
        customerType = customerType.toLowerCase();

        System.out.println(bill(customerName, customerType, totalValue));

        System.out.println(bill("A", "norm", 10000));
    }
}
