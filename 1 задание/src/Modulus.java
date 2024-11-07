public class Modulus extends Operation {
    public Modulus(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double execute() {
        if (operand2 == 0) {
            throw new ArithmeticException("Остаток деления на ноль");
        }
        return operand1 % operand2;
    }
}
