public class BankQuestionSource implements QuestionSource {
    private final QuestionBank bank;
    private int cursor = 0;

    public BankQuestionSource(QuestionBank bank) {
        this.bank = bank;
    }

    @Override
    public Question getQuestion() {
        Question q = bank.get(cursor % bank.size());
        cursor++;
        return q;
    }

    @Override
    public String getModeLabel() {
        return "Question Bank Mode";
    }
}