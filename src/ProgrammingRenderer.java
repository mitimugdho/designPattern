public class ProgrammingRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println(q.getQuestionText());
    }
}