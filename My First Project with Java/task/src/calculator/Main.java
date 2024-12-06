package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");

        double earnedAmount = 202 + 118 + 2250 + 1680 + 1075 + 80;
        System.out.println("Income: $" + earnedAmount );

        Scanner sc = new Scanner(System.in);
        System.out.print("Staff expenses: ");
        double staffExpenses = sc.nextDouble();
        System.out.println("Other expenses: ");
        double otherExpenses = sc.nextDouble();
        double total = earnedAmount - staffExpenses - otherExpenses;
        System.out.println("Net income: " + total);
    }
}