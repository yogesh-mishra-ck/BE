package org.example;

//Student Report
//Create a Student class with fields for name and marks in 3 subjects.
//Add a method to calculate total and average marks.

class Student{
    public String name;
    public int marksEnglish;
    public int marksCS;
    public int marksMaths;

    public Student(String name, int marksEnglish, int marksCS, int marksMaths){
        this.name = name;
        this.marksEnglish = marksEnglish;
        this.marksCS = marksCS;
        this.marksMaths = marksMaths;
    }

    public String getName(){
        return this.name;
    }

    public int totalMarks(){
        int total = this.marksEnglish+this.marksMaths+this.marksCS;
        return total;
    }

    public double average(){
        int totalMarks = totalMarks();
        double avg = ((double) totalMarks/300)*100;
        return avg;
    }
}
public class Question6 {
    public static void main(String[] args) {
        Student student = new Student("Yogesh",92,98,90);
        int totalMarks = student.totalMarks();
        double averageMarks = student.average();
        System.out.println("The summary for the student "+student.getName()+" is as follows:");
        System.out.println("Total Marks: "+totalMarks);
        System.out.printf("Average Marks: %.2f",averageMarks);
    }
}
