
public class Runner {

    /**
     * main method to create 100 integers between 0 and 1000 in an array and sort them using merge sort
     * @param args the arguments for the program
     */
    public static void main(String[] args){
        int[] array = new int[100];
        for (int i = 0; i < 100; i++){
            array[i] = (int)(Math.random()*1000);
        }
        MergeSort sort = new MergeSort(array);
        System.out.println("The array to begin with:\n" + sort);
        sort.startSort();
        System.out.print("The array after sorting:\n" + sort);

    }
}
