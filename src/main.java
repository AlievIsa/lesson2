
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
//        System.err.println("ERROR HERE");
        System.out.println(args.length);
        System.out.println("Enter number1");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
////        int number2 = sc.nextInt();
//        if (number1 > 5) {
//            System.out.println("number1 more than 5");
//        } else if (number1 < 5) {
//            System.out.println("number1 less than 5");
//        } else {
//            System.out.println("number1 equals to 5");
//        }
//        System.out.println("Sum is " + (number1 + number2));
        while (number1 < 10){
            System.out.println("while loop: " + number1);
            number1 += 1;
        }
        do {
            System.out.println("do while loop: " + number1);
            number1 -= 1;
        } while (number1 > 6);
        int N = 4;
        for (int i = 0; i < N; i++){
            System.out.println("for loop: " + i);
        }
        for (String argument : args) {
            System.out.println(argument);
        }
        int[] array1 = new int[3];
        array1[0] = 65;
        array1[1] = 3;
        array1[2] = 6;

        int[] array2 = {65, 5, 8};

        for (int value: array1){
            System.out.println(value);
        }
        int[][] dem2arr = new int[2][5];
        for (int[] row: dem2arr){
            for (int value: row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
//    static int readNumber(){
//        Scanner sc = new Scanner(System.in);
//        return sc.nextInt();
//    }
}
