import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число -> ");
        float a = scanner.nextFloat();
        System.out.print("Введите второе число -> ");
        float b = scanner.nextFloat();
        System.out.print("Введите оператор (+, -, *, /) -> ");
        char c = scanner.next().charAt(0);
        if(c != '+' && c != '-' && c != '*' && c != '/') {
            System.out.print("Ошибка ввода!");
            System.exit(0);
        }
        float res = 0;
        switch (c) {
            case '+': res = a + b; break;
            case '-': res = a - b; break;
            case '*': res = a * b; break;
            case '/': {
                if(b == 0) {
                System.out.print("На ноль делить нельзя!");
                System.exit(0);
                }
                res = a / b;
                break;
            }
            default: break;
        }
        System.out.printf("Результат -> %.1f", res);
    }
}