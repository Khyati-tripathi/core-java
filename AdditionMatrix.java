public class AdditionMatrix {
    public static void main(String[] args) {
        int[][] m1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
        int[][] m2 = { { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 } };
        int[][] add = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                add[i][j] = m1[i][j] + m2[i][j];
            }
        }
        for (int[] arr : add) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
