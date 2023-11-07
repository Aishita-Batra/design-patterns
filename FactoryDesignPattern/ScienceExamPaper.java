package FactoryDesignPattern;

public class ScienceExamPaper extends ExamPaper {
    @Override
    public void createPaper() {
        System.out.println("Science Exam Paper Created");
    }
}