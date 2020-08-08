import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        float miles = scanner.nextInt();
        float hours = scanner.nextInt();
        
        float average = miles / hours;
        
        System.out.println(average);
    }
}
