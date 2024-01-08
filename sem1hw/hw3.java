package sem1hw;

public class hw3 {
    public static void main(String[] args) {
    class Calculator {
        public static int calculate(char op, int a, int b) {
            // Введите свое решение ниже
            if (op == '+') {
                return a + b;
            } else if (op == '-') {
                return a - b;
            } else if (op == '*') {
                return a * b;
            } else if (op == '/') {
                return a / b;
            }
        }
    }
    int a = 3;
    char op = '+';
    int b = 7;
    if(op!='+'||op!='-'||op!='/'||op!='*'){
        throw new IllegalArgumentException("Некорректный оператор: " + op);
    }
    int result = Calculator.calculate(op, a, b);
    System.out.println(result);
    }
}