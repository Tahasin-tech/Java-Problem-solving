public class sortScore {
    public static void main(String[] args) {
        double[] arr = new double[]{3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {

                    double tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println("CGPA Order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
