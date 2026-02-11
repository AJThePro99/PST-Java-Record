/*
A list of students is given, where each student has a name and total marks.
The task is to sort students based on marks in descending order.
If two students have the same marks, they must be sorted alphabetically by name.
Finally, collect the top K students using Java Streams and Collectors API.
*/

import java.util.*;
import java.util.stream.Collectors;

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }
        sc.close();

        System.out.print("Value of K: ");
        int k = sc.nextInt();

        List<Student> sortedStudents = students
            .stream()
            .sorted(
                Comparator.comparingInt(Student::getMarks)
                    .reversed()
                    .thenComparing(Student::getName)
            )
            .limit(k)
            .collect(Collectors.toList());

        String result = sortedStudents
            .stream()
            .map(s -> s.getName())
            .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
