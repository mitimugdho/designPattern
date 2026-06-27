import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private final List<Question> questions = new ArrayList<>();

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public Question get(int index) {
        return questions.get(index);
    }

    public int size() {
        return questions.size();
    }
}