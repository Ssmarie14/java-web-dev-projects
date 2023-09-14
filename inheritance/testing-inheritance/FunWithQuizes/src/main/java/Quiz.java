import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<QuestionClass> questions = new ArrayList<>();

    public void addQuestion(QuestionClass question) {
        questions.add(question);
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (QuestionClass question : questions) {
            question.display();
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getAnswer() + "\n");
            }
        }

        System.out.println("Quiz complete! Your score: " + score + " out of " + questions.size());
    }
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add questions to the quiz
        quiz.addQuestion(new MultipleChoiceQuestionClass("What is the capital of France?", "1", new String[]{"Paris", "London", "Berlin"}));
        quiz.addQuestion(new TrueFalseQuestion("True or False: Is the Earth flat?", false));

        // Start the quiz
        quiz.start();
    }
}
