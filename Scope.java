public class Scope {
    static void main() {
//        Function scoped
//        Block Scoped  == for loop scoped
//        block mai defined value ko change ker dega but new value ka acces bhar nhi dega
        int a =10;
        {
            a = 78;
            int c =8;
//value initialize in this block will remain in this block

        }

        System.out.println(a);
//        System.out.println(c);
//        it will give me no access of c var

    }
}
