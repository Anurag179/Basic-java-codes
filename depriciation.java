import java.util.Scanner;
class depriciation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        if(b>a){
            sum = b-a;
            System.out.println("the value is depriciated by: " +sum);
        }
        else if(a>b){
            sum = a-b;
            System.out.println("the value is incremented by: " +sum);
        }
        else{
            System.out.println("Enter valid input");
        }
    }
}