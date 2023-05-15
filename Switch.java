import java.util.Scanner;
class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        switch (fruit) {
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("sweet fruits");
                break;
            case "orange":
                System.out.println("orange");
                break;
            default:
                System.out.println("give a valid response");
        }
    }
}
