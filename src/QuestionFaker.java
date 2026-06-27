public class QuestionFaker {
    public Question generateMCQ() {
        return new MCQQuestion("What is encapsulation?", 2, "Easy");
    }

    public Question generateEssay() {
        return new EssayQuestion("Compare composition vs inheritance.", 10, "Hard");
    }

    public Question generateProgramming() {
        return new ProgrammingQuestion("Implement a binary search in Java.", 20, "Hard");
    }

    public Question generateTrueFalse() {
        return new TrueFalseQuestion("Java is platform-independent.", true, 1, "Easy");
    }
}
