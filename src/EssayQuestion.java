public class EssayQuestion implements Question {
    private String questionText;
    private int points;
    private String difficulty;

    public EssayQuestion() {
        this("Explain polymorphism with examples.", 10, "Hard");
    }

    public EssayQuestion(String questionText, int points, String difficulty) {
        this.questionText = questionText;
        this.points       = points;
        this.difficulty   = difficulty;
    }

    @Override public String getType()        { return "Essay"; }
    @Override public int    getPoints()      { return points; }
    @Override public String getDifficulty()  { return difficulty; }
    @Override public String getQuestionText(){ return questionText; }
}