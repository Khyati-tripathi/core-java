public class MultiplicationMatrix {
    public static void main(String[] args) {
        int[][] m1 = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 11, 12, 13, 14 } };
        int[][] m2 = { { 1, 5, 0, 6 }, { 12, 7, 6, 1 }, { 0, 23, 7, 4 } };
        int[][] multi = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    multi[i][j] += (m1[i][k] * m2[k][j]);
                }
            }
        }
        for (int[] arr : multi) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}
