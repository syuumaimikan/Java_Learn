package lesson02;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("じゃんけんゲーム");
        System.out.println("0:グー 1:チョキ 2:パー");
        System.out.print("入力: ");

        int player = input.nextInt();
        int cpu = rand.nextInt(3);

        String[] hands = {"グー", "チョキ", "パー"};

        System.out.println("あなた: " + hands[player]);
        System.out.println("CPU: " + hands[cpu]);

        if (cpu == player) {
            System.out.println("あいこ!");
        } else if ((player == 0 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 0)) {
            System.out.println("あなたの勝ち!");
        } else {
            System.out.println("CPUの勝ち!");
        }
    }
}
