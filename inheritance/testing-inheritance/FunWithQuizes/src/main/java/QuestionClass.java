public class QuestionClass {
    private String text;
    private String answer;

    public QuestionClass (String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

public boolean checkAnswer(String userAnswer) {
    return userAnswer.equalsIgnoreCase(answer);
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public void display() {
        System.out.println(text);
    }
}


