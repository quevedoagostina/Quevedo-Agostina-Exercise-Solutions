// The following exercises were done with the help of ChatGPT 
// due to limited knowledge of Java

public class JAVA3 {

    public static int moveNonZeroElementsToLeft(int[] arr) {
        int nonZeroElementsCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroElementsCount];
                arr[nonZeroElementsCount] = temp;
                nonZeroElementsCount++;
            }
        }

        return nonZeroElementsCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4};

        int nonZeroElementsCount = moveNonZeroElementsToLeft(arr);

        System.out.println("The number of non-zero elements is: " + nonZeroElementsCount);
        System.out.println("The array after moving non-zero elements to the left is: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
