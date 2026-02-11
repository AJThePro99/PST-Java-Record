import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Player {

    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of players: ");
        int n = sc.nextInt();

        List<Player> players = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            players.add(new Player(name, score));
        }
        sc.close();

        List<Player> sortedPlayers = players
            .stream()
            .sorted(
                Comparator.comparing(Player::getScore)
                    .reversed()
                    .thenComparing(Player::getName)
            )
            .collect(Collectors.toList());

        String result = sortedPlayers
            .stream()
            .map(s -> s.getName() + " " + s.getScore())
            .collect(Collectors.joining("\n"));

        System.out.println("\n" + result);
    }
}

// 5
// amy 100
// david 100
// heraldo 50
// aakansha 75
// aleksa 150
