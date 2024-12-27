import java.util.Comparator;

public class MyArrays {
    // 1-ый метод static int binarySearch(byte[] a, byte key)
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 2-ой метод static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key)
    private static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            byte midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    // 3-ий метод static int binarySearch(char[] a, char key)
    public static int binarySearch(char[] a, char key) {
        return binarySearch( a, 0, a.length, key);
    }

    // 4-ый метод static int binarySearch(char[] a, int fromIndex, int toIndex, char key)
    private static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            char midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    // 5-ый метод static int binarySearch(double[] a, double key)
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 6-ой метод static int binarySearch(double[] a, int fromIndex, int toIndex, double key)
    private static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = a[mid];

            if (midVal < key)
                low = mid + 1;  // Neither val is NaN, thisVal is smaller
            else if (midVal > key)
                high = mid - 1; // Neither val is NaN, thisVal is larger
            else {
                long midBits = Double.doubleToLongBits(midVal);
                long keyBits = Double.doubleToLongBits(key);
                if (midBits == keyBits)     // Values are equal
                    return mid;             // Key found
                else if (midBits < keyBits) // (-0.0, 0.0) or (!NaN, NaN)
                    low = mid + 1;
                else                        // (0.0, -0.0) or (NaN, !NaN)
                    high = mid - 1;
            }
        }
        return -(low + 1);  // key not found.
    }

    // 7-ой метод static int binarySearch(float[] a, float key)
    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 8-ой метод static int binarySearch(float[] a, int fromIndex, int toIndex, float key)
    private static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            float midVal = a[mid];

            if (midVal < key)
                low = mid + 1;  // Neither val is NaN, thisVal is smaller
            else if (midVal > key)
                high = mid - 1; // Neither val is NaN, thisVal is larger
            else {
                int midBits = Float.floatToIntBits(midVal);
                int keyBits = Float.floatToIntBits(key);
                if (midBits == keyBits)     // Values are equal
                    return mid;             // Key found
                else if (midBits < keyBits) // (-0.0, 0.0) or (!NaN, NaN)
                    low = mid + 1;
                else                        // (0.0, -0.0) or (NaN, !NaN)
                    high = mid - 1;
            }
        }
        return -(low + 1);  // key not found.
    }

    // 9-ый метод static int binarySearch(int[] a, int key)
    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 10-ый метод static int binarySearch(int[] a, int fromIndex, int toIndex, int key)
    private static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    // 11-ый метод static int binarySearch(long[] a, long key)
    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 12-ый метод static int binarySearch(long[] a, int fromIndex, int toIndex, long key)
    private static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    // 13-ый метод static int binarySearch(short[] a, short key)
    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    // 14 -ый метод static int binarySearch(short[] a, int fromIndex, int toIndex, short key)
    private static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            short midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    // 15-ый метод static int binarySearch(T[] a, T key, Comparator c)
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch (a, 0, a.length, key, c);
    }

    // 16 -ый метод static int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c)
    private static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (c == null) {
            return binarySearch(a, fromIndex, toIndex, key);
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);
            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    private static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key) {
        return fromIndex;
    }
}
