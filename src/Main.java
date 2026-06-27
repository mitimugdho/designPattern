public class Main {
    public static void main(String[] args) {
        ExamFactory examFactory = new MidtermExamFactory();
        Exam exam = examFactory.createExam();

        ExamConfiguration config = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .negativeMarking()
                .shuffle()
                .autoSubmit()
                .build();

        QuestionBank bank = new QuestionBank();
        bank.addQuestion(new MCQQuestion("What is the capital of France?", 2, "Medium"));
        bank.addQuestion(new MCQQuestion("Which keyword creates a subclass in Java?", 2, "Easy"));
        bank.addQuestion(new EssayQuestion("Discuss the four pillars of OOP.", 10, "Hard"));
        bank.addQuestion(new ProgrammingQuestion("Implement quicksort in Java.", 20, "Hard"));
        bank.addQuestion(new TrueFalseQuestion("Java is a purely object-oriented language.", false, 1, "Easy"));

        QuestionSource source = new BankQuestionSource(bank);


        QuestionFactory mcqFactory        = new MCQFactory(source);
        QuestionFactory essayFactory      = new EssayFactory(source);
        QuestionFactory programmingFactory= new ProgrammingFactory(source);
        QuestionFactory tfFactory         = new TrueFalseFactory(source);

        Question q1 = mcqFactory.createQuestion();
        Question q2 = mcqFactory.createQuestion();
        Question q3 = essayFactory.createQuestion();
        Question q4 = programmingFactory.createQuestion();
        Question q5 = tfFactory.createQuestion();

        System.out.println("===========================");
        System.out.println("EXAM CREATED SUCCESSFULLY");
        System.out.println("===========================");
        System.out.println("Type: " + exam.getType());
        System.out.println("Title: " + config.getTitle());
        System.out.println("Duration: " + config.getDuration() + " minutes");
        System.out.println("Passing Score: " + config.getPassingScore() + " Marks");
        System.out.println("Configuration Profiles:");
        System.out.println((config.isNegativeMarking() ? "\u2713 " : "\u2717 ") + "Negative Marking Enabled");
        System.out.println((config.isQuestionShuffle() ? "\u2713 " : "\u2717 ") + "Question Shuffle Activated");
        System.out.println((config.isCalculatorAllowed() ? "\u2713 " : "\u2717 ") + "Embedded Calculator Allowed");
        System.out.println((config.isAutoSubmit() ? "\u2713 " : "\u2717 ") + "Auto-Submit On Timeout");
        System.out.println("Question Sourcing Strategy: " + source.getModeLabel());
        System.out.println("Compiled Structural Components:");
        System.out.println("- [Type: " + q1.getType() + "] Points: " + q1.getPoints() + " Difficulty: " + q1.getDifficulty());
        System.out.println("- [Type: " + q2.getType() + "] Points: " + q2.getPoints() + " Difficulty: " + q2.getDifficulty());
        System.out.println("- [Type: " + q3.getType() + "] Points: " + q3.getPoints() + " Difficulty: " + q3.getDifficulty());
        System.out.println("- [Type: " + q4.getType() + "] Points: " + q4.getPoints() + " Difficulty: " + q4.getDifficulty());
        System.out.println("- [Type: " + q5.getType() + "] Points: " + q5.getPoints() + " Difficulty: " + q5.getDifficulty());
        System.out.println("===========================");
    }
}