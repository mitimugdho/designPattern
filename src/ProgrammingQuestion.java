public class ProgrammingQuestion implements Question {
    private String problemStatement;
    private int points;
    private String difficulty;
    private String expectedOutput;

    public ProgrammingQuestion() {
        this("Write a Java method to reverse a string.", 20, "Hard", "olleh");
    }

    public ProgrammingQuestion(String problemStatement, int points, String difficulty) {
        this(problemStatement, points, difficulty, "");
    }

    public ProgrammingQuestion(String problemStatement, int points, String difficulty,
                               String expectedOutput) {
        this.problemStatement = problemStatement;
        this.points           = points;
        this.difficulty       = difficulty;
        this.expectedOutput   = expectedOutput;
    }

    @Override public String getType()        { return "Programming"; }
    @Override public int    getPoints()      { return points; }
    @Override public String getDifficulty()  { return difficulty; }
    @Override public String getQuestionText(){ return problemStatement; }

    public String getExpectedOutput() { return expectedOutput; }
}