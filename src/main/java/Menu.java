import java.util.Scanner;

public class Menu {
    private static Boolean flag = false;

    public static void main(String[] ar) {
        initializeInterface();
    }

    public static void initializeInterface() {
        do {
            displayMenu();
        } while (flag);
    }

    public static void displayMenu() {
        Scanner tec = new Scanner(System.in);
        System.out.println("-- Welcome what you want --");
        System.out.println("| 1.- Do a sell");
        System.out.println("| 2.- Do a return");
        System.out.println("| 3.- Maintenance of resources");
        System.out.println("| 4.- Reports");
        System.out.println("--------------------------------");
        System.out.print(" Your choice: ");
        char election = tec.next().charAt(0);
        switch (election) {
            case '1' -> doASell();
            case '2' -> doAReturn();
            case '3' -> maintenance();
            case '4' -> reports();
            default -> catchOptionNoValid();
        }
    }

    private static void doASell() {
        System.out.println("option  sell");
    }

    private static void doAReturn() {
        System.out.println("option return");
    }

    private static void maintenance() {
        System.out.println("option maintenance");
    }

    private static void reports() {
        System.out.println("option reports");
    }

    private static void catchOptionNoValid() {
        System.out.println("option no valid");
        flag = false;
    }
}
