package FactoryDesignPattern;

public class ExamFactory {
    public static ExamPaper creatExamPaper(String subject) {
        if (subject.equalsIgnoreCase("Maths")) {
            return new MathsExamPaper();
        } else if (subject.equalsIgnoreCase("Science")) {
            return new ScienceExamPaper();
        } else {
            throw new IllegalArgumentException("Invalid subject: " + subject);
        }
    }
}
