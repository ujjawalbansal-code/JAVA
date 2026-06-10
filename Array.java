public class Array {
    static void main() {
//        datatype[] variable_name = new datatype[size];
//        store 5 int value
        int[] rno = new int[5];
//        compile time(int[] rno) = run time(new int[5])     at run time there is memory allocated known as dynamic memory allocation
//        Dynamic Memory Allocation : assigning the memory space during the execution time or run time
//        or directly
        int[] rno2 = {1, 2, 3, 4, 5};

        int[] rnos; //declaration of array. ros is getting defined in the stack
        rnos = new int[5]; // initialization : actually here object is being created in the memory (heap)
        System.out.println(rnos[1]); //0

        String[] arr = new String[4];
        System.out.println(arr[0]);  //null
//        null value is assign to any non primitive only like string and array
//    without initialisatoon the value is null for non-primitive
    }
}
