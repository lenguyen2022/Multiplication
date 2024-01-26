package ca.tetervak.multiplicationtrainer.config;

import ca.tetervak.multiplicationtrainer.service.ProblemService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;

@Configuration
public class QuizConfiguration {

    @Bean
    public ProblemService provideQuizService(){
        return new ProblemService(new SecureRandom());
    }
}
