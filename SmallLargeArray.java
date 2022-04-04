public class SmallLargeArray {

    public static void main(String[] args) {
        int[] array = { 10, 67, 101, 1, 54, 22 };
        int small = array[0];
        int large = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small)
                small = array[i];
            if (array[i] > large)
                large = array[i];

        }
        System.out.println("Largest element:" + large);
        System.out.println("Smallest element:" + small);

    }
}
