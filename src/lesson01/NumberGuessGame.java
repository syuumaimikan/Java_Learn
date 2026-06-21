package lesson01;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int answer = random.nextInt(100) + 1;
        int count = 0;

        System.out.println("1〜100の数字を当ててください！");

        while (true) {
            System.out.print("数字を入力: ");
            int guess = scanner.nextInt();
            count++;

            if (guess == answer) {
                System.out.println("正解！");
                System.out.println(count + "回で当たりました！");
                break;
            } else if (guess < answer) {
                System.out.println("もっと大きいです");
            } else {
                System.out.println("もっと小さいです");
            }
        }

        scanner.close();
    }
}