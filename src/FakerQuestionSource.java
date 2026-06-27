public class FakerQuestionSource implements QuestionSource {
    private final QuestionFaker faker;
    private int cursor = 0;

    public FakerQuestionSource(QuestionFaker faker) {
        this.faker = faker;
    }

    @Override
    public Question getQuestion() {
        // Round-robin through the four generated question types.
        switch (cursor % 4) {
            case 0: cursor++; return faker.generateMCQ();
            case 1: cursor++; return faker.generateEssay();
            case 2: cursor++; return faker.generateProgramming();
            default: cursor = 0; return faker.generateTrueFalse();
        }
    }

    @Override
    public String getModeLabel() {
        return "Faker Mode";
    }
}