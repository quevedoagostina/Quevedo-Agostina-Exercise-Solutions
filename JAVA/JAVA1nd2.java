// 01. Hibernate helps us connect Java stuff to database stuff.
// This is handy when we want to make programs that use databases. 
// Hibernate is used in different types of programs, like:
// Websites, computer programs you use on your PC and apps on your phone.

// The following exercises were done with the help of ChatGPT 
// due to limited knowledge of Java

// 02. 

public class JAVA1nd2 {

    public static int[][] generateMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        // Start at the center of the square
        int row = n / 2;
        int col = n / 2;

        // Place the number 1 in the center
        magicSquare[row][col] = 1;

        for (int i = 2; i <= n * n; i++) {
            // Move one position to the right
            col++;

            // If we reach the right edge of the square, wrap around to the left edge
            if (col >= n) {
                col = 0;
            }

            // If the next position is already occupied, move one position down
            if (magicSquare[row][col] != 0) {
                row--;

                // If we reach the top edge of the square, wrap around to the bottom edge
                if (row < 0) {
                    row = n - 1;
                }
            }

            // Place the next number in the current position
            magicSquare[row][col] = i;
        }

        return magicSquare;
    }

    public static void main(String[] args) {
        int n = 3;

        int[][] magicSquare = generateMagicSquare(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}