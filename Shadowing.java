public class Shadowing {
    static int x = 90;
    static void main() {
        System.out.println(x);
        int x;
        x=40;
        System.out.println(x);
        fun();


    }
//  in shadowing variable with the higher level scope is hidden
//    lower level is overriding the upper level.
//    if we change then it will change in all






    private static void fun() {
        System.out.println(x);
    }
}
