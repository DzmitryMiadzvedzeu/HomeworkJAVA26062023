package homeworks;

import java.util.Scanner;

public class Dz26062023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число для проверки ");
        int chis = sc.nextInt();
        sc.close();

        if (chis % 2 == 0) {
            System.out.println("число чётное");
        } else {
            System.out.println("число нечётное");
        }

    }
}



