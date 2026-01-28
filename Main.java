// A group of n children is playing a game in which they are standing in a straight line. Each child has a hoop on the floor to stand in. There are exactly as many hoops as children, hence n in total. On their shirts, each child has a number.

// The game starts when the captain calls out a random number k. Each child then moves to the next hoop on their right, wrapping around to the leftmost hoop when they reach the rightmost hoop. This process is repeated k times.

// Your task is to simulate this game by writing the function rotateArray. As input, you are given the number of childrenn, the value of k, and an array arr containing the numbers written on the children's shirts in their original order from left to right. The function must return an array containing the new arrangement of the children after they have completed the moves.
// Example 1

// Input:

// n = 5

// k=2

// arr = 12345

// Output:

// -45123

// Explanation:

// The value of k is 2, so each child moves 2 positions to the right in the line. The first child with number 1 moves to the position of number 3, the second child with number 2 moves to the position of number 4, and so on. The last two children with numbers 4 and 5 "go off" at the right end of the line and reappear at the left end in positions 1 and 2, respectively








import java.util.*;

public class Main {

    // Function to rotate array to the right by k positions
    public static int[] rotateArray(int n, int k, int[] arr) {

        // Effective rotations (avoids unnecessary full cycles)
        k = k % n;

        int[] result = new int[n];

        // Step 1: Move last k elements to the front
        for (int i = 0; i < k; i++) {
            result[i] = arr[n - k + i];
        }

        // Step 2: Move remaining elements
        for (int i = k; i < n; i++) {
            result[i] = arr[i - k];
        }

        return result;
    }

    public static void main(String[] args) {

        // Sample Input
        int n = 5;
        int k = 2;
        int[] arr = {1, 2, 3, 4, 5};

        // Rotate array
        int[] rotated = rotateArray(n, k, arr);

        // Print Output
        System.out.print("Output: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}







