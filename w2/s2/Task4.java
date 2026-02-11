import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*

Given a list of persons, each with a name (String) and age (integer).
Sort the persons alphabetically by name using method references.
Filter the persons older than a given age limit using a static method reference.
Convert all names to uppercase using an instance method reference.

==Input Format==
The first line contains an integer n — the number of persons.
The next n lines each contain a string name and an integer age separated by a space.
The last line contains an integer ageLimit — the age threshold for filtering.

==Output Format==
First line: sorted names (alphabetically), space-separated.
Second line: names of persons older than ageLimit, space-separated, in the order they appear in the input.
Third line: all names in uppercase, space-separated, in the original order.
Name contains only uppercase and lowercase English letters
---
Sample Input-1:
3
Alice 23
Bob 30
Charlie 25
24
---
Sample Output-1:
Alice Bob Charlie
Bob Charlie
ALICE BOB CHARLIE

*/

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static boolean isOlderThan(Person p, int limit) {
        return p.getAge() > limit;
    }
}

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of people: ");
        int n = sc.nextInt();

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            people.add(new Person(sc.next(), sc.nextInt()));
        }

        int ageLimit = sc.nextInt();

        String sortedNames = people
            .stream()
            .sorted(Comparator.comparing(Person::getName))
            .map(Person::getName)
            .collect(Collectors.joining(" "));

        String filteredNames = people
            .stream()
            .filter(p -> Person.isOlderThan(p, ageLimit))
            .map(Person::getName)
            .collect(Collectors.joining(" "));

        String upperCaseNames = people
            .stream()
            .map(Person::getName)
            .map(String::toUpperCase)
            .collect(Collectors.joining(" "));

        System.out.println(sortedNames);
        System.out.println(filteredNames);
        System.out.println(upperCaseNames);

        sc.close();
    }
}
