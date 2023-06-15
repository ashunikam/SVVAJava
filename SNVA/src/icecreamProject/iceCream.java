package icecreamProject;
import java.util.Scanner;
public class iceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] quantities = new int[8];
        double[] prices = {2, 3, 4, 5, 4.5, 8, 6, 7};
        double[] flavorTotalAmounts = new double[8];
        double totalAmount = 0;

        boolean stop = false;
        while (!stop) {
            System.out.println("Welcome to the Ice Cream Shop!");
            System.out.println("Please select an option to place an order:");
            System.out.println("1. Online");
           System.out.println("2. From Shop");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    System.out.println("Hello, " + name);
                    System.out.println("These are the flavors we have: ");
                    System.out.println("1. Vanilla\n2. Chocolate\n3. Strawberry");
                    System.out.print("Enter the flavor");
                    String flavor = scanner.next();
                    System.out.println("Your " + flavor + " ice cream is ready!");

                    boolean continueOnline = true;
                    while (continueOnline) {
                        System.out.println("\nAvailable flavors:");
                        System.out.println("1. Vanilla\n2. Chocolate\n3. Strawberry\n4. Mango\n" +
                                "5. Nuts\n6. Strawberry Cheesecake\n7. Salted Caramel\n8. Pistachio");
                        System.out.print("Enter the flavor: ");
                        int flavorOnline = scanner.nextInt();
                        System.out.print("Enter the quantity: ");
                        int quantityOnline = scanner.nextInt();

                        if (flavorOnline >= 1 && flavorOnline <= 8) {
                            quantities[flavorOnline - 1] += quantityOnline;
                            double amountOnline = prices[flavorOnline - 1] * quantityOnline;
                            flavorTotalAmounts[flavorOnline - 1] += amountOnline;
                            totalAmount += amountOnline;

                            // Print item details
                            System.out.println("\nItem added to cart:");
                            System.out.println("Flavor: " + flavorOnline);
                            System.out.println("Quantity: " + quantityOnline);
                            System.out.println("Amount: $" + amountOnline);

                            // Print updated cart details
                            printCartDetails(quantities, prices, flavorTotalAmounts, totalAmount);

                        } else {
                            System.out.println("Invalid flavor selection!");
                        }

                        System.out.print("Do you want to add more ice cream to your cart? (yes/no): ");
                        String continueChoice = scanner.next();
                        if (continueChoice.equalsIgnoreCase("no")) {
                            continueOnline = false;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ice Cream Shop");
                    System.out.println("1. Scoops\n2. Exquisites");

                    boolean continueShop = true;
                    while (continueShop) {
                        System.out.print("Enter your choice: ");
                        int iceCreamTypeShop = scanner.nextInt();

                        switch (iceCreamTypeShop) {
                            case 1:
                                System.out.println("Available flavors for scoops:");
                                System.out.println("1. Vanilla\n2. Chocolate\n3. Strawberry\n4. Mango");

                                System.out.print("Enter the flavor number: ");
                                int flavorScoopsShop = scanner.nextInt();
                                System.out.print("Enter the quantity: ");
                                int quantityScoopsShop = scanner.nextInt();

                                if (flavorScoopsShop >= 1 && flavorScoopsShop <= 4) {
                                    quantities[flavorScoopsShop - 1] += quantityScoopsShop;
                                    double amountScoopsShop = prices[flavorScoopsShop - 1] * quantityScoopsShop;
                                    flavorTotalAmounts[flavorScoopsShop - 1] += amountScoopsShop;
                                    totalAmount += amountScoopsShop;

                                    // Print item details
                                    System.out.println("\nItem added to cart:");
                                    System.out.println("Flavor: " + flavorScoopsShop);
                                    System.out.println("Quantity: " + quantityScoopsShop);
                                    System.out.println("Amount: $" + amountScoopsShop);

                                    // Print updated cart details
                                    printCartDetails(quantities, prices, flavorTotalAmounts, totalAmount);
                                } else {
                                    System.out.println("Invalid flavor selection!");
                                }
                                break;

                            case 2:
                                System.out.println("Available flavors for exquisites:");
                                System.out.println("5. Nuts\n6. Strawberry Cheesecake\n7. Salted Caramel\n8. Pistachio");

                                System.out.print("Enter the flavor number: ");
                                int flavorExquisitesShop = scanner.nextInt();
                                System.out.print("Enter the quantity: ");
                                int quantityExquisitesShop = scanner.nextInt();

                                if (flavorExquisitesShop >= 5 && flavorExquisitesShop <= 8) {
                                    quantities[flavorExquisitesShop - 1] += quantityExquisitesShop;
                                    double amountExquisitesShop = prices[flavorExquisitesShop - 1] * quantityExquisitesShop;
                                    flavorTotalAmounts[flavorExquisitesShop - 1] += amountExquisitesShop;
                                    totalAmount += amountExquisitesShop;

                                    // Print item details
                                    System.out.println("\nItem added to cart:");
                                    System.out.println("Flavor: " + flavorExquisitesShop);
                                    System.out.println("Quantity: " + quantityExquisitesShop);
                                    System.out.println("Amount: $" + amountExquisitesShop);

                                    // Print updated cart details
                                    printCartDetails(quantities, prices, flavorTotalAmounts, totalAmount);
                                } else {
                                    System.out.println("Invalid flavor selection!");
                                }
                                break;

                            default:
                                System.out.println("Invalid option!");
                                break;
                        }

                        System.out.print("Do you want to add more ice cream to your cart? (yes/no): ");
                        String continueChoice = scanner.next();
                        if (continueChoice.equalsIgnoreCase("no")) {
                            continueShop = false;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for shopping at the Ice Cream Shop!");
                    stop = true;
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
        
    }

    private static void printCartDetails(int[] quantities, double[] prices, double[] flavorTotalAmounts, double totalAmount) {
        System.out.println("\nYour Bill:");
        System.out.println("Item\t\tFlavor\t\tQuantity\tPrice\t\tTotal Amount");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] > 0) {
                String flavor;
                switch (i + 1) {
                    case 1:
                        flavor = "Vanilla";
                        break;
                    case 2:
                        flavor = "Chocolate";
                        break;
                    case 3:
                        flavor = "Strawberry";
                        break;
                    case 4:
                        flavor = "Mango";
                        break;
                    case 5:
                        flavor = "Nuts";
                        break;
                    case 6:
                        flavor = "Strawberry Cheesecake";
                        break;
                    case 7:
                        flavor = "Salted Caramel";
                        break;
                    case 8:
                        flavor = "Pistachio";
                        break;
                    default:
                        flavor = "Unknown";
                        break;
                }
                System.out.println(i + 1 + "\t\t" + flavor + "\t\t" + quantities[i] + "\t\t$" + prices[i] +
                        "\t\t$" + flavorTotalAmounts[i]);
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println();
    }
}