import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    matrix[i][j] = sc.nextInt();

                } else {
                    matrix[i][j] = Integer.parseInt(sc.next());
                }
            }
        }

        rotateMatrix(matrix, m, n, r);

        System.out.println("\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void rotateMatrix(int[][] matrix, int m, int n, int r) {
        int numLayers = Math.min(m, n) / 2;

        for (int layer = 0; layer < numLayers; layer++) {
            List<Integer> elements = new ArrayList<>();

            for (int j = layer; j < n - layer; j++) {
                elements.add(matrix[layer][j]);
            }

            for (int i = layer + 1; i < m - layer; i++) {
                elements.add(matrix[i][n - 1 - layer]);
            }

            for (int j = n - 2 - layer; j >= layer; j--) {
                elements.add(matrix[m - 1 - layer][j]);
            }

            for (int i = m - 2 - layer; i > layer; i--) {
                elements.add(matrix[i][layer]);
            }

            int size = elements.size();
            int shift = r % size;

            int count = 0;

            for (int j = layer; j < n - layer; j++) {
                matrix[layer][j] = elements.get((count++ + shift) % size);
            }

            for (int i = layer + 1; i < m - layer; i++) {
                matrix[i][n - 1 - layer] = elements.get((count++ + shift) % size);
            }

            for (int j = n - 2 - layer; j >= layer; j--) {
                matrix[m - 1 - layer][j] = elements.get((count++ + shift) % size);
            }

            for (int i = m - 2 - layer; i > layer; i--) {
                matrix[i][layer] = elements.get((count++ + shift) % size);
            }
        }
    }
}
