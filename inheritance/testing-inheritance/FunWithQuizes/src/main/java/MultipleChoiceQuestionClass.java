public class MultipleChoiceQuestionClass extends QuestionClass {
    private String[] choices;

    public MultipleChoiceQuestionClass(String text, String answer, String[] choices) {
        super(text, answer);
        this.choices = choices;
        }

    @Override
    public void display() {
        super.display();
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }

}



