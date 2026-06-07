import java.util.Arrays;

public class VarArgs {
    static void main() {
        fun(2,3,4,5,56,87,23,45,65);
        multiple(8,9,"ff","nisin","shjisi");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a+" " + b +" "+ Arrays.toString(v));
    }
}
