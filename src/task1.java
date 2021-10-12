import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите сдачу");
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int M;
        if (S % 10 == 0){
            while (S != 0){
                System.out.print(10 + " ");
                S -= 10;
            }
        } else if (S % 9 == 0 && S <= 81){
            while (S != 0){
                System.out.print(9 + " ");
                S -= 9;
            }
        } else if (S % 5 == 0){
            S -= 5;
            while (S != 0){
                System.out.print(10 + " ");
                S -= 10;
            }
            System.out.print(5 + " ");
        } else if (S % 10 == 1){
            S -= 1;
            while (S != 0){
                System.out.print(10 + " ");
                S -= 10;
            }
            System.out.print(1 + " ");
        } else if (S % 10 == 2) {
            S -= 2;
            while (S != 0) {
                System.out.print(10 + " ");
                S -= 10;
            }
            System.out.print(1 + " " + 1);
        } else if (S % 10 == 3) {
            S -= 3;
            while (S != 0) {
                System.out.print(10 + " ");
                S -= 10;
            }
            System.out.print(1 + " " + 1 + " " + 1);
        }else if (S % 10 == 4) {
            S -= 4;
            while (S != 0) {
                System.out.print(10 + " ");
                S -= 10;
            }
            System.out.print(1 + " " + 1 + " " + 1 + " " + 1);
        } else if (S % 10 == 6) {
            S -= 6;
            while (S != 0) {
                System.out.print(10 + " ");
                S -= 10;
            }
            System.out.print(5 + " " + 1);
        } else if (S % 10 == 7) {
            S -= 7;
            while (S != 0) {
                System.out.print(10 + " ");
                S -= 10;
            }
            System.out.print(5 + " " + 1 + " " + 1);
        } else if (S % 10 == 8) {
            S -= 8;
            while (S != 0) {
                System.out.print(10 + " ");
                S -= 10;
            }
            System.out.print(5 + " " + 1 + " " + 1 + " " + 1);
        } else if (S % 10 == 9) {
            S -= 9;
            while (S != 0) {
                System.out.print(10 + " ");
                S -= 10;
            }
            System.out.print(9);
        } else if (S < 9 && S >= 5){
            System.out.print(5 + " ");
            S -= 5;
            while (S != 0) {
                System.out.print(1 + " ");
                S -= 1;
            }
        } else {
            while (S != 0) {
                System.out.print(1 + " ");
                S -= 1;
            }
        }
    }
}
