public class ProgrammingEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        return (answer != null && answer.contains("for")) ? q.getPoints() : 0;
    }
}