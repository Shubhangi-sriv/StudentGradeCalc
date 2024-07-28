package Level1;

import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Grade to be entered: ");
        int numOfGrades= sc.nextInt();
        int[] marksOfEachGrade= new int[numOfGrades];
        int totalGrade= 0;

//        array for taking input for the marks of each grade
        for(int i=0; i< numOfGrades; i++){
            System.out.println("Enter the marks obtained in each grade: ");
            marksOfEachGrade[i]= sc.nextInt();
            totalGrade= totalGrade + marksOfEachGrade[i];
        }
        System.out.println("Total grade is: "+totalGrade);
//        average of total marks of each grade
        double average= (double)totalGrade/ (numOfGrades*100)*100;
        System.out.println("Average percentage if: "+average+ "%");
    }
}
