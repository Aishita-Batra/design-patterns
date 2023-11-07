package FactoryDesignPattern;

public class MathsExamPaper extends ExamPaper {
    @Override
    public void createPaper() {
        System.out.println("Maths Exam Paper Created");
    }
}