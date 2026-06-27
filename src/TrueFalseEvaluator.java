public class TrueFalseEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        TrueFalseQuestion t = (TrueFalseQuestion) q;
        boolean given = Boolean.parseBoolean(answer);
        return given == t.getCorrectAnswer() ? t.getPoints() : 0;
    }
}