package HW_210319;

public class Calculator {
    //Объявляем переменые
    private int operandOne;
    private int operandTwo;

    //Создаём сеттеры и геттеры
    public int getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(int operandOne) {
        this.operandOne = operandOne;
    }

    public int getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(int operandTwo) {
        this.operandTwo = operandTwo;
    }

    //Создаём конструктор
    public Calculator(int operandOne, int operandTwo) {
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
    }

    //Создаём методы
    public void addition() {
        int answer = this.operandOne + this.operandTwo;
        System.out.printf("Результат сложения %d и %d составил %d\n", this.operandOne,this.operandTwo, answer);
    }

    public void subtraction() {
        int answer = this.operandOne - this.operandTwo;
        System.out.printf("Результат вычитания %d из %d составил %d\n", this.operandTwo,this.operandOne, answer);
    }

    public void multiplication() {
        int answer = this.operandOne * this.operandTwo;
        System.out.printf("Результат умножения %d на %d составил %d\n", this.operandOne,this.operandTwo, answer);
    }

    public void division() {
        double answer = (double) this.operandOne / this.operandTwo;
        System.out.printf("Результат деления %d на %d составил %.2f\n", this.operandOne,this.operandTwo, answer);
    }
}
