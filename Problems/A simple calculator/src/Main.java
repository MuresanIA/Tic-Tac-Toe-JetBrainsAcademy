import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long first = scanner.nextLong();
        char operator = scanner.next().charAt(0);
        long second = scanner.nextLong();


        scanner.close();
        switch (operator) {
            case '+':
                System.out.println(addition(first, second));
                break;
            case '-':
                System.out.println(subtraction(first, second));

                break;
            case '/':
                try {
                    System.out.println(integerDivision(first, second));
                } catch (Exception ignored) {
                    System.out.println("Division by 0!");
                }
                break;
            case '*':
                System.out.println(multiplication(first, second));
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }

    static long addition(long a, long b) {
        return a + b;
    }

    static long subtraction(long a, long b) {
        return a - b;
    }

    static long integerDivision(long a, long b) throws Exception {
        long result;
        if (b != 0) {
            result = a / b;
        } else {

            throw new Exception("Division by 0!");
        }
        return result;
    }

    static long multiplication(long a, long b) {
        return a * b;
    }

}

