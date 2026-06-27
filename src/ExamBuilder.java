public class ExamBuilder {
    private final ExamConfiguration config;
    public ExamBuilder() {
        config = new ExamConfiguration();
    }
    public ExamBuilder setTitle(String title) {
        config.setTitle(title);
        return this;
    }

    public ExamBuilder setDuration(int duration) {
        config.setDuration(duration);
        return this;
    }

    public ExamBuilder setPassingScore(int score) {
        config.setPassingScore(score);
        return this;
    }
    public ExamBuilder negativeMarking() {
        config.setNegativeMarking(true);
        return this;
    }

    public ExamBuilder shuffle() {
        config.setQuestionShuffle(true);
        return this;
    }

    public ExamBuilder autoSubmit() {
        config.setAutoSubmit(true);
        return this;
    }

    public ExamBuilder allowCalculator() {
        config.setCalculatorAllowed(true);
        return this;
    }

    public ExamConfiguration build() {
        return config;
    }
}