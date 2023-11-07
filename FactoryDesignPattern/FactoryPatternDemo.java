package FactoryDesignPattern;

import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        System.out.println("Enter the subject name");
        Scanner sc = new Scanner(System.in);
        String subject = sc.next();
        ExamPaper paper = ExamFactory.creatExamPaper(subject);
        paper.createPaper();
    }
}
