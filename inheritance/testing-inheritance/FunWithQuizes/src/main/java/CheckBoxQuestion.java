public class CheckBoxQuestion extends QuestionClass {
    private String[] choices;

    public CheckBoxQuestion(String text, String answer, String[] choices) {
        super(text, answer);
        this.choices = choices;
    }

}

