import java.util.Arrays;

public class MyArrayList<T>{
    private T[] arr = (T[]) new Object[5];

    private int i = 0;
    public void add(T t) {

            if (i < arr.length - 1) {
                arr[i++] = t;

            } else {
                T[] arr1 = (T[]) new Object[arr.length + 1];
                for (int j = 0; j < arr.length; j++) {
                    arr1[j] = arr[j];
                }
            arr1[arr1.length - 1] = t;

                arr = arr1;

            }
        }


    public String toString() {
        return Arrays.toString(arr);
    }
}
