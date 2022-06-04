public class MinimumValue {
    public static void main(String[] args) {

        int[] data = new int[] {3, 4, 9, 1, 6};
        System.out.println("Najmniejsza liczba w tablic: " + minimum(data));
        System.out.println("Najmniejsza liczba w tablic: " + minimum2(data));
    }

    public static int minimum(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public static int minimum2(int[] data) {
        int min = data[0];
        for (int number : data) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
