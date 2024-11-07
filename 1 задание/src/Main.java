import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Доступние операции: +, -, *, ^, % /\nВведите выражение типа a $ b, где a, b - числа, $ - операция\nДля выхода пропишите 'exit'");

        while (true) {

            String input = scan.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            String[] arr = input.split(" ");
            if (arr.length != 3) {
                System.out.println("Неправильный ввод, введите выражение снова: ");
                continue;
            }
            try {
                double operand1 = Double.parseDouble(arr[0]);
                String operator = arr[1];
                double operand2 = Double.parseDouble(arr[2]);
                Operation operation = null;
                switch (operator) {
                    case "+":
                        operation = new Addition(operand1, operand2);
                        break;
                    case "-":
                        operation = new Subtraction(operand1, operand2);
                        break;
                    case "*":
                        operation = new Multiplication(operand1, operand2);
                        break;
                    case "/":
                        operation = new Division(operand1, operand2);
                        break;
                    case "^":
                        operation = new Power(operand1, operand2);
                        break;
                    case "%":
                        operation = new Modulus(operand1, operand2);
                        break;
                    default:






                        System.out.println("Неверный ввод\n ");
                        continue;
                }
                double result = calc.calculate(operation);
                System.out.println("Результат: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод числа");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        scan.close();
    }
}