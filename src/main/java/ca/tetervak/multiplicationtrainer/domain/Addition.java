package ca.tetervak.multiplicationtrainer.domain;

public class Addition extends Problem{
    public Addition(){
        super();
    }
    public Addition(int a, int b, int answer) {
        super(a,b, a + b);
    }
}
