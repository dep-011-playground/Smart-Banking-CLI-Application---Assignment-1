import java.util.Scanner;

public class BankingApp {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final String CLEAR = "\033[H\033[2J";
        final String COLOUR_BLUE_BOLD = "\033[34;1m";
        final String COLOUR_GREEN_BOLD = "\033[32;1m";
        final String COLOUR_RED_BOLD = "\033[31;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "💰 Welcome to Smart Banking App ";
        final String NEW_ACCOUNT = "Create New Account";
        final String DEPOSIT ="Deposit Money";
        final String WITHDRAW = "Withdraw Money";
        final String TRANSFER = "Transfer Money";
        final String CHECK_BALANCE = "Check Account Balance";
        final String DROP_ACCOUNT = "Drop Existing Account";


        String screen = DASHBOARD;

        int[] idArrayMain = new int[0];
        String[] nameArrayMain = new String[0];
        double[] balanceArrayMain = new double[0];

        do{

            final String APP_TITLE = String.format("%s%s%s",
            COLOUR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.println("-".repeat(40));
            System.out.println(" ".repeat((40 - APP_TITLE.length() + 7)/2).concat(APP_TITLE));
            System.out.println("-".repeat(40));

            switch(screen){
                case DASHBOARD:
                System.out.println("\n[1]. Create new account");
                System.out.println("[2]. Deposit Money");
                System.out.println("[3]. Withdraw Money");
                System.out.println("[4]. Transfer Money");
                System.out.println("[5]. Check Account Balance");
                System.out.println("[6]. Withdraw Money");
                System.out.println("[7]. Exit\n");
                System.out.print("Enter an option to continue > ");
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option){
                    case 1: screen = NEW_ACCOUNT; break;
                    case 2: screen = DEPOSIT; break;
                    case 3: screen = WITHDRAW; break;
                    case 4: screen = TRANSFER; break;
                    case 5: screen = CHECK_BALANCE; break;
                    case 6: screen = DROP_ACCOUNT; break;
                    case 7: System.exit(0); break;
                    default: continue;
                }
                break;

                case NEW_ACCOUNT:


                case DEPOSIT:


                case WITHDRAW:


                case TRANSFER:


                case CHECK_BALANCE:


                case DROP_ACCOUNT:


                default: System.exit(0);

                
            }


        }while (true);

    }
}
