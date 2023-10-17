import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        int n, i, j, temp;
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();
        arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("...Bubble Sort...");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
