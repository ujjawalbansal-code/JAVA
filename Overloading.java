public class Overloading {
    static void main() {
        fun("j");
        fun(5);
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);

    }
}
