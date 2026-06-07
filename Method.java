import java.util.Scanner;

public class Method {
    /*
            access modifier (we will look in oop) return_type name () {
             body
             return statement;
             }
       */
    static void main() {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
//        System.out.println(greet());
//        System.out.println(sum3(20,30));
        Scanner in = new Scanner(System.in);
        String name = in.next();

        String Personalized = myGreet(name);
        System.out.println(Personalized);

    }

    static String myGreet(String name) {
        String message ="Hello " + name;
        return message;
    }

    static int sum3(int num1,int num2){
        int sum1 = num1 + num2;
        return sum1;
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum1 = num1 + num2;
        return sum1;
//        System.out.println("hi");     unreachable it will give an error bcz it will write after return
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum= "+sum);
    }

    static String greet(){
        String greeting = "how are you";
        return greeting;
    }
}
