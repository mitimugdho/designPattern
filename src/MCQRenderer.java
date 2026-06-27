public class MCQRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        MCQQuestion m = (MCQQuestion) q;
        System.out.println("Question: " + m.getQuestionText());
        char letter = 'A';
        for (String opt : m.getOptions()) {
            System.out.println(letter + ". " + opt);
            letter++;
        }
    }
}