import java.util.Scanner;

public class BankMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to your Bank Account!");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
       choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Viewing Balance...");
                break;
            case 2:
                System.out.println("Proceeding to Deposit...");
                break;
            case 3:
                System.out.println("Initiating Withdrawal...");
                break;
            case 4:
                System.out.println("Exiting. Thank you!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        input.close();
    }
}
