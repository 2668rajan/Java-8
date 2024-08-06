package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {

    public static int getNoOfNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebook)
                .reduce(0,(a,b)->a+b);
    }

    public static int getNoNotebooksByGender(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("male"))
                .map(Student::getNotebook)
                //.reduce(0,(a,b)->a+b);
                .reduce(0,Integer::sum);
    }

    public static int getNoNotebooksByGenderAndActivity(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getActivities().contains("aerobics"))
                .map(Student::getNotebook)
                .reduce(0,(a,b)->a+b);
    }

    public static void main(String[] args) {

        System.out.println("Total no of books is : " + getNoOfNotebooks());
        System.out.println("getNoNotebooksByGender : "+getNoNotebooksByGender());
        System.out.println("getNoNotebooksByGenderAndActivity : "+getNoNotebooksByGenderAndActivity());
    }
}
