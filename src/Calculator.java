import java.util.Scanner;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("첫 번째 숫자를 입력");
        double a1 = scanner.nextDouble();
        System.out.print("+,-,*,/를 입력 하시오");
        char i = scanner.next().charAt(0);
        System.out.print("두 번째 숫자 입력");
        double a2 = scanner.nextDouble();

        double a3 = 0.0;

        if (i == '+') {
            a3 = calculator.add(a1, a2);
        } else if (i == '-') {
            a3 = calculator.subtract(a1, a2);
        } else if (i == '*') {
            a3 = calculator.multiply(a1, a2);
        } else if (i == '/') {
            a3 = calculator.divide(a1, a2);
        } else {
            System.out.println("연설자를 잘못 입력 했습니다");
            scanner.close();
            return;
        }
        System.out.println("결과: " + a3);
    }
}