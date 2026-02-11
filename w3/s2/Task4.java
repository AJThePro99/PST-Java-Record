// You are given a list of student information: ID, FirstName, and CGPA.
//
// Your task is to rearrange them according to their CGPA in decreasing order.
// If two student have the same CGPA, then arrange them according to their first name in alphabetical order.
// If those two students also have the same first name, then order them according to their ID.
//  No two students have the same ID.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Student {

    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();
            students.add(new Student(id, name, cgpa));
        }
        sc.close();

        List<Student> sortedStudents = students
            .stream()
            .sorted(
                Comparator.comparingDouble(Student::getCGPA)
                    .reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getId)
            )
            .collect(Collectors.toList());

        String result = sortedStudents
            .stream()
            .map(s -> s.getName())
            .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}

// 5
// 33 Rumpa 3.68
// 85 Ashis 3.85
// 56 Samiha 3.75
// 19 Samara 3.75
// 22 Fahim 3.76
