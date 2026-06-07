import java.util.Scanner;

public class Switch {
    static void main() {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
//     in switch cases condition value like here fruit and its value like mango both have same datatype requires
        switch (fruit){
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":{
                System.out.println("A sweet red fruit");
                System.out.println("called apple");
                break;}
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }

//        after alt+enter (selecting switch)
//        also write multiple statement in any condition by using :{}

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> {
                System.out.println("A sweet red fruit");
                System.out.println("called apple");
            }
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit");
        }
        int day = in.nextInt();

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }


        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

//        it also works
        switch (day){
            case 1 , 2 ,3 , 4 , 5:
                System.out.println("Weekday");
                break;
            case 6 , 7:
                System.out.println("Weekend");
        }
        int empID = in.nextInt();
        String department=in.next();
        switch (empID){
            case 1:
                System.out.println("Ujjawal Bansal");
                break;
            case 2:
                System.out.println("Nupur Saraswat");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department exist");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }

        switch (empID) {
            case 1 -> System.out.println("Ujjawal Bansal");
            case 2 -> System.out.println("Nupur Saraswat");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department exist");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
