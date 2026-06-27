public class MCQQuestion implements Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;
    private int points;
    private String difficulty;

    public MCQQuestion() {
        this("What is OOP?",
                new String[]{"Java", "Object-Oriented Programming", "Database", "Network"},
                "Object-Oriented Programming",
                2, "Medium");
    }

    public MCQQuestion(String questionText, int points, String difficulty) {
        this(questionText,
                new String[]{"Option A", "Option B", "Option C", "Option D"},
                "Option A",
                points, difficulty);
    }

    public MCQQuestion(String questionText, String[] options, String correctAnswer,
                       int points, String difficulty) {
        this.questionText  = questionText;
        this.options       = options;
        this.correctAnswer = correctAnswer;
        this.points        = points;
        this.difficulty    = difficulty;
    }

    @Override public String getType()        { return "MCQ"; }
    @Override public int    getPoints()      { return points; }
    @Override public String getDifficulty()  { return difficulty; }
    @Override public String getQuestionText(){ return questionText; }

    public String[] getOptions()       { return options; }
    public String   getCorrectAnswer() { return correctAnswer; }
}