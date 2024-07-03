import java.util.Scanner;

/**
 * A CollatzConjecture program.
 * <p>
 * Purdue University -- CS18000 -- Spring 2022 -- Homework 05 -- Challenge
 *
 * @author Purdue CS
 * @version January 10, 2021
 */
public class CollatzConjecture {

    public static void calculator(Scanner scanner) {
        String welcome = "Welcome to Collatz Conjecture Calculator!";
        String optionOne = "1. Calculate with upper limit";
        String optionTwo = "2. Calculate until the end";
        String initialNumPrompt = "Enter the starting number:";
        String upperLimitPrompt = "Enter the upper limit:";
        String result = "Operation performed %d times, and the resulting number is %d.";
        String unfinishedPrompt = "Do you want to continue the calculations %d more times? (yes/no)";
        String againPrompt = "Do you want to use the calculator again? (yes/no)";
        String farewellPrompt = "Thanks for using Collatz Conjecture Calculator!";



        int up = 0;
        int initial = 0;
        int count = 0;
        int sum = 0;
        int count2 = 0;
        boolean y = true;
        boolean z = true;
        boolean a = true;
        String finish = "";
        System.out.println(optionOne);
        System.out.println(optionTwo);
        int x = scanner.nextInt();
        scanner.nextLine();
        if ((x != 1) && (x != 2)) {
            y = false;
        }
        while (y == false) {
            System.out.println(optionOne);
            System.out.println(optionTwo);
            x = scanner.nextInt();
            scanner.nextLine();
            if ((x != 1) && (x != 2)) {
                y = false;
            } else {
                y = true;
            }

        }
        if (x == 1) {
            System.out.println(initialNumPrompt);
            initial = scanner.nextInt();
            scanner.nextLine();
            System.out.println(upperLimitPrompt);
            up = scanner.nextInt();
            scanner.nextLine();
            System.out.print(initial);
            while (up > count + 1) {
                if (initial == 1) {
                    break;
                } else if (initial == 2) {
                    initial = initial / 2;
                    System.out.print("..." + initial);
                    count++;
                    break;
                } else if (initial % 2 == 0) {
                    initial = initial / 2;
                    count++;
                    System.out.print("..." + initial);
                } else {
                    initial = initial * 3 + 1;
                    count++;
                    System.out.print("..." + initial);
                }
            }
            System.out.print("!");
        } else {
            System.out.println(initialNumPrompt);
            initial = scanner.nextInt();
            scanner.nextLine();
            System.out.print(initial);
            while (z == true) {
                if (initial == 1) {
                    z = false;
                } else if (initial == 2) {
                    initial = initial / 2;
                    count++;
                    System.out.print("..." + initial);
                } else if (initial % 2 == 0) {
                    initial = initial / 2;
                    count++;
                    System.out.print("..." + initial);
                } else {
                    initial = initial * 3 + 1;
                    count++;
                    System.out.print("..." + initial);

                }
            }
            System.out.print("!");
        }
        System.out.println("\nOperation performed " + count + " times, and the resulting number is " + initial + ".");
        while (initial != 1) {
            System.out.println("Do you want to continue the calculations " + up + " more times? (yes/no)");
            finish = scanner.nextLine();
            if ((finish.compareTo("yes") == 0) || (finish.compareTo("Yes") == 0)) {
                //count2=up;
                a = false;
            } else if ((finish.compareTo("no") == 0) || (finish.compareTo("No") == 0)) {
                //count2=up;
                break;
            }
            if (a == false) {
                System.out.print(initial);
                while (up > count2 + 1) {
                    if (initial == 1) {
                        a = true;
                        break;
                    }
                    if (initial == 2) {
                        initial = initial / 2;
                        count2++;
                        System.out.print("..." + initial);
                    } else if (initial % 2 == 0) {
                        initial = initial / 2;
                        count2++;
                        System.out.print("..." + initial);
                    } else {
                        initial = initial * 3 + 1;
                        count2++;
                        System.out.print("..." + initial);
                    }

                }

                System.out.print("!");
                sum = count + count2;
                System.out.print("\nOperation performed " + sum);

                System.out.print("\nOperation performed " + sum);
                System.out.print(" times, and the resulting number is " + initial + ".\n");

            }
        }
    }

    public static void main(String[] args) {
        String welcome = "Welcome to Collatz Conjecture Calculator!";
        String optionOne = "1. Calculate with upper limit";
        String optionTwo = "2. Calculate until the end";
        String initialNumPrompt = "Enter the starting number:";
        String upperLimitPrompt = "Enter the upper limit:";
        String result = "Operation performed %d times, and the resulting number is %d.";
        String unfinishedPrompt = "Do you want to continue the calculations %d more times? (yes/no)";
        String againPrompt = "Do you want to use the calculator again? (yes/no)";
        String farewellPrompt = "Thanks for using Collatz Conjecture Calculator!";
        System.out.println(welcome);
        Scanner scanner = new Scanner(System.in);
        calculator(scanner);

        String again = "";
        boolean b = false;
        while (b == false) {
            System.out.println(againPrompt);
            again = scanner.nextLine();
            if ((again.compareTo("yes") == 0) || (again.compareTo("Yes") == 0)) {
                b = false;
                if (b == false) {
                    calculator(scanner);
                }
            } else {
                b = true;
            }
        }
        System.out.println(farewellPrompt);
    }
}

