import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20,35, -15, 7, 55, 1, -22};

        for(int length = 1; length <array.length; length++)
        {
            int newElement = array[length];
            int i;
            for(i=length; i>0 && array[i-1]>newElement; i--)
            {
                array[i] = array[i-1];
            }
            array[i] = newElement;
        }

        System.out.println(Arrays.toString(array));

    }

}
