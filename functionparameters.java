//paramaters in function using user input
// import java.util.Scanner;
// class functionparameters {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int ans = sum1(a,b);
//         System.out.println(ans);
//     }
//     static int sum1(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
// }

import java.util.Scanner;
class functionparameters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ans = greet(a);
        System.out.println(ans);
    }
    static String greet(String a){
        String greeting = a;
        return greeting;
    }
}