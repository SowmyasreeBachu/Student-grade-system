// Team members: Sowmya Sree , Sri Ram 

// Project Team Name: Marvel

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        char Grade;

        System.out.print(" \n Team members: Sowmya Sree , Sri Ram\n\n");

        Scanner Name = new Scanner(System.in);

        System.out.println(" Enter Student Name: \n");

        String name = Name.next();

        Scanner homeWork = new Scanner(System.in);

        System.out.println("\n Enter Homework One marks: \n");

        double homeworkOne = homeWork.nextDouble();

        System.out.println("\n Enter Homework Two marks: \n");

        double homeworkTwo = homeWork.nextDouble();

        System.out.println("\n Enter Homework Three marks: \n");

        double homeworkThree = homeWork.nextDouble();

        System.out.println("\n Enter Homework Four marks: \n");

        double homeworkFour = homeWork.nextDouble();

        System.out.println("\n Enter Homework Five marks: \n");

        double homeworkFive = homeWork.nextDouble();

        System.out.println("\n Enter Homework Six marks: \n");

        double homeworkSix = homeWork.nextDouble();

        System.out.println("\n Enter Homework Seven marks: \n");

        double homeworkSeven = homeWork.nextDouble();

        System.out.println("\n Enter Homework Eight marks: \n");

        double homeworkEight = homeWork.nextDouble();

        double avgHomework = Home_work(homeworkOne, homeworkTwo, homeworkThree, homeworkFour, homeworkFive, homeworkSix, homeworkSeven, homeworkEight);

        System.out.println("\n Average Homework marks are: \n" + avgHomework);

        // Quiz marks average

        Scanner Quiz = new Scanner(System.in);

        System.out.println("\n Enter Quiz One marks: \n");

        double quizOne = Quiz.nextDouble();

        System.out.println("\n Enter quiz Two marks: \n");

        double quizTwo = Quiz.nextDouble();

        System.out.println("\n Enter Quiz Three marks: \n");

        double quizThree = Quiz.nextDouble();

        System.out.println("\n Enter Quiz Four marks: \n");

        double quizFour = Quiz.nextDouble();

        System.out.println("\n Enter Quiz Five marks: \n");

        double quizFive = Quiz.nextDouble();

        double avgQuiz = avg_Quiz(quizOne, quizTwo, quizThree, quizFour, quizFive);

        System.out.println("\n  Average quiz marks are: \n" + avgQuiz);

        // Exam One Marks Calculation

        Scanner midTerm = new Scanner(System.in);

        System.out.println("\n Enter Mid-Term Exam marks: \n");

        double midExam = midTerm.nextDouble();

        double avgmidTerm = midExam * 0.25;

        // Exam Two Marks Calculation

        Scanner finalExam = new Scanner(System.in);

        System.out.println("\n Enter Final Exam marks: \n");

        double Exam = finalExam.nextDouble();

        double avgfinalExam = Exam * 0.30;

        // Project Marks Calculation

        Scanner Project = new Scanner(System.in);

        System.out.println("\n Enter Project marks: \n");

        double project = Project.nextDouble();

        double avgProject = project * 0.25;

        

        double Total = (avgHomework* 0.15) + (avgQuiz * 0.5) + avgmidTerm + avgfinalExam + avgProject ;

        System.out.println("\n  Total  marks : \n" + Total);

        if (Total<=100 && Total >= 95) {

            String studentGrade = "A+";

            System.out.println("\n Your test grade is:" + " " + studentGrade);
        }

        // if grade >= 90, set the letterGrade to A

        else if (Total<=94 && Total >= 90) {
            Grade = 'A';

            System.out.println(" Your test grade is:" + " " + Grade);
        }

        // if grade >= 85, set the letterGrade to B+

        else if ( Total<=89 && Total >= 85) {
            String studentGrade = "B+";

            System.out.println(" Your test grade is:" + " " + studentGrade);
        }

        // if grade >= 80, set the letterGrade to B

        else if (Total<=84 && Total >= 80) {
            Grade = 'B';

            System.out.println(" Your test grade is:" + " " + Grade);
        }

        // if grade >= 75, set the letterGrade to C+

        else if (Total<=79 && Total >= 75) {
            String studentGrade = "C+";

            System.out.println(" Your test grade is:" + " " + studentGrade);
        }
        // if grade >= 70, set the letterGrade to C

        else if (Total<=74 && Total >= 70) {
            Grade = 'C';

            System.out.println(" Your test grade is:" + " " + Grade);
        }

        // if grade >= 65, set the letterGrade to D+

        else if (Total<=69 && Total >= 65) {
            String studentGrade = "D+";

            System.out.println(" Your test grade is:" + " " + studentGrade);
        }
        // if grade >= 60, set the letterGrade to D

        else if (Total >= 60) {
            Grade = 'D';

            System.out.println(" Your test grade is:" + " " + Grade);
        }

        // if grade <= 60, set the letterGrade to F

        else {
            System.out.println(" Your test grade is: F");
        }
    }

    public static double Home_work(double homeworkOne, double homeworkTwo, double homeworkThree, double homeworkFour, double homeworkFive, double homeworkSix, double homeworkSeven, double homeworkEight) {
        return (homeworkOne + homeworkTwo + homeworkThree + homeworkFour + homeworkFive + homeworkSix +homeworkSeven + homeworkEight) / 8;
    }

    public static double avg_Quiz(double quizOne, double quizTwo, double quizThree, double quizFour, double quizFive) {
        return (quizOne + quizTwo + quizThree+ quizFour + quizFive) / 5;
    }

}
