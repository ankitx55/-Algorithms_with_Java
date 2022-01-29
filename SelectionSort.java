import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for(int length=array.length-1; length>0; length--)
        {
            int largest = 0;
            for(int i = 1; i<=length; i++)
            {
                if(array[i]>array[largest])
                {
                    largest = i;
                }
            }
            swap(array, largest, length);
        }

        System.out.println(Arrays.toString(array));

    }

    static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
