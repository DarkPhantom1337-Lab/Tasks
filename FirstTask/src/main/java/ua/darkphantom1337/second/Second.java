package ua.darkphantom1337.second;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of earth days and hours in the following format: number_of_earth_days, number_of_earth_hours");
        input = scanner.nextLine();
        if (input.contains(", ")) {
            String[] spl = input.split(", ");
            if (spl.length == 2) {
                int firstNumber = 0, secondNumber = 0;
                try {
                    firstNumber = Integer.parseInt(spl[0]);
                    secondNumber = Integer.parseInt(spl[1]);
                } catch (Exception e) {
                    // ToDo error
                }
                System.out.println("number_of_earth_days: " + firstNumber + " number_of_earth_hours: " + secondNumber);
                double sol = (firstNumber + secondNumber / 24) * 1.02595675;
                System.out.println("Sol: " + sol);
            } else {
                // ToDo error
            }
        } else {
            // ToDo error
        }
    }

}
