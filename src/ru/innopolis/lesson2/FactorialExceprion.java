package ru.innopolis.lesson2;

public class FactorialExceprion extends Exception {

    private int number;

    public int getNumber() {
        return number;
    }

    public FactorialExceprion(String message, int number){

        super(message);
        this.number=number;
    }

}
