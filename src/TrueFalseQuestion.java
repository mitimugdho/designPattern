public class TrueFalseQuestion implements Question {
    private String questionText;
    private boolean correctAnswer;
    private int points;
    private String difficulty;

    public TrueFalseQuestion() {
        this("Java supports multiple inheritance.", false, 1, "Easy");
    }

    public TrueFalseQuestion(String questionText, boolean correctAnswer,
                             int points, String difficulty) {
        this.questionText  = questionText;
        this.correctAnswer = correctAnswer;
        this.points        = points;
        this.difficulty    = difficulty;
    }

    @Override public String getType()        { return "True/False"; }
    @Override public int    getPoints()      { return points; }
    @Override public String getDifficulty()  { return difficulty; }
    @Override public String getQuestionText(){ return questionText; }

    public boolean getCorrectAnswer() { return correctAnswer; }
}