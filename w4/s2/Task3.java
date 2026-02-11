import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

class Task3 {
    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            alice.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < 3; i++) {
            bob.add(Integer.parseInt(sc.next()));
        }
        sc.close();
        // System.out.println(alice);
        // System.out.println(bob);
        System.out.println(streamCompareTriplets(alice, bob));

    }

    public static List<Integer> compareTripelets(List<Integer> a, List<Integer> b) {
        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aScore++;
            } else if (a.get(i) == b.get(i)) {
                continue;
            } else {
                bScore++;
            }
        }
        List<Integer> result = new ArrayList<>();
        
        result.add(aScore);
        result.add(bScore);

        return result;
    }

    public static List<Integer> streamCompareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = (int) IntStream.range(0, a.size())
                                .filter(i -> a.get(i) > b.get(i))
                                .count();

        int bobScore = (int) IntStream.range(0, b.size())
                                    .filter(i -> b.get(i) > a.get(i))
                                    .count();

        return Arrays.asList(aliceScore, bobScore);
    }
}