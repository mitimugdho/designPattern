public class MCQEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        MCQQuestion m = (MCQQuestion) q;
        return answer.equalsIgnoreCase(m.getCorrectAnswer()) ? m.getPoints() : 0;
    }
}