package ca.tetervak.multiplicationtrainer.service;

import ca.tetervak.multiplicationtrainer.domain.Grade;
import ca.tetervak.multiplicationtrainer.domain.Problem;

import java.util.Random;

public class ProblemService {

    private final Random random;

    public ProblemService(Random random) {
        this.random = random;
    }

    public ProblemService() {
        this(new Random());
    }

    public Problem getRandomProblem(){
        int a = 1 + random.nextInt(9);
        int b = 1 + random.nextInt(9);
        return new Problem(a, b);
    }

    public Grade gradeUserAnswer(Problem problem, String userAnswer){
        try {
            if (problem.getAnswer() == Double.parseDouble(userAnswer)) {
                return Grade.RIGHT_ANSWER;
            } else {
                return Grade.WRONG_ANSWER;
            }
        } catch(NumberFormatException e){
            return Grade.INPUT_ERROR;
        }
    }
}
