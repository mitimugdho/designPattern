public class QuizFactory extends ExamFactory {
    @Override
    public Exam createExam() {
        return new PracticeQuiz();
    }
}