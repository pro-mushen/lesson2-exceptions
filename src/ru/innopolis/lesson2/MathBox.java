package ru.innopolis.lesson2;

public class MathBox {

    public int summa (Integer a, Integer b){
        return a + b;
    }

    public int diff (Integer a, Integer b){
        return a - b;
    }

    public long factorialStack (Integer a){
        if (a == 0) {
            return 1;
        }

        return  a * factorialStack(a-1);
    }

    public long factorialFor (Integer a) throws FactorialExceprion {

        if (a < 0 || a > 20){
            throw new FactorialExceprion("Не могу посчитать такой факториал :'(",a);
        }

        long fac = 1;

        for (int i = 1; i <= a; ++i) {
            fac *= i;
        }

        return fac;
    }



    public double dividerExceptionInside(Integer a, Integer b){
        if (b == 0) {
            return 0;
        }

        return (double) a / b;
    }

    public double divider (Integer a, Integer b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Зачем ты делишь на ноль? Хотя так можно :)");
        }
        return (double) a / b;
    }

}
