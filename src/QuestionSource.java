public interface QuestionSource {
    Question getQuestion();
    String getModeLabel();   // used for the "Question Sourcing Strategy" line
}