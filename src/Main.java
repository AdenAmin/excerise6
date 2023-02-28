import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer.");
        UserInput input1 = new UserInput();
        double aDouble = input1.promptDouble("Enter A number with a decimal");
        UserInput input2 = new UserInput();
        String aString = new input2.promptString();

        }

}

class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
        }

        return userInt;
    }
    public double promptDouble(String message) {
        double input = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(message);
            try {
                input = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
            }
        }
        return input;
    }
    public String promptString(String message) {
        String input = null;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(message);
            try {
                input = scanner.nextLine();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
            }
        }
        return input;
    }


}


