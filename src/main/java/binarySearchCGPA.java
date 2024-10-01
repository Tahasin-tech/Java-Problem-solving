import java.util.Arrays;
import java.util.Scanner;

public class binarySearchCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpa);
        for (double i : cgpa) {
            System.out.println(i+" ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the CGPA to be searched: ");
        double targetCGPA = scanner.nextDouble();
        int low =0, high = cgpa.length;
        int mid;
        boolean flag = false;
        int index =0;
        while (low <= high) {

            mid = low+(high-low) / 2;
            if (cgpa[mid] == targetCGPA) {
                flag = true;
                index=mid;
                break;
            }
            else if (cgpa[mid] < targetCGPA) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        if (flag) {
            System.out.println("Target CGPA found at index "+index);
        }
        else {
            System.out.println("Target CGPA not found");
        }
    }
}
