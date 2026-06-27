public class TrueFalseRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println(q.getQuestionText());
        System.out.println("True / False");
    }
}