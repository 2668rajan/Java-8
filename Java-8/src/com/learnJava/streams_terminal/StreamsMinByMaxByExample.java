package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExample {

    public static Optional<Student> minByExample(){
        return StudentDataBase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxByExample(){
        return StudentDataBase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> minGrade(){
        return StudentDataBase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGradeLevel)));
    }
    public static Optional<Student> maxGrade(){
        return StudentDataBase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGradeLevel)));
    }


    public static void main(String[] args) {
        Optional<Student> optionalStudentMin = minByExample();
        if(optionalStudentMin.isPresent()) {
            System.out.println("Student with minimum Gpa : " +optionalStudentMin.get());
        }else{
            System.out.println("Student not found");
        }

        Optional<Student> optionalStudentMax = maxByExample();
        System.out.println("Student with maximum Gpa : "
                +(optionalStudentMax.isPresent()?optionalStudentMax.get():"Not found"));

        Optional<Student> minGradeOptional = minGrade();
        System.out.println("Student with minimum Grade : "
                +(minGradeOptional.isPresent()?minGradeOptional.get():"Not found"));

        Optional<Student> maxGradeOptional = maxGrade();
        System.out.println("Student with maximum Grade : "
                +(maxGradeOptional.isPresent()?maxGradeOptional.get():"Not found"));
    }
}
