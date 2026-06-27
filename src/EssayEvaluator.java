public class EssayEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        return (answer != null && answer.length() > 50) ? q.getPoints() : 0;
    }
}