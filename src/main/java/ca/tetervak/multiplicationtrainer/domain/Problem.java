package ca.tetervak.multiplicationtrainer.domain;



import lombok.Data;

import java.io.Serializable;


public class Problem implements Serializable {
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    //instance variables  two input and 1 answer
    private int a;
    private int b;
    private int answer;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getAnswer() {
        return answer;
    }

    public Problem(int a, int b, int answer) {
        this.a = a;
        this.b = b;
        this.answer = answer;
    }

    public Problem(int a, int b) {
        this(a, b, a * b);
    }

    public Problem() {
        this(1, 1);
    }

    @Override
    public String toString() {
        return String.format("Problem[%d x %d = %d]", a, b, answer);
    }
}
