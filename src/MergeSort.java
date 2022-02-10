

public class MergeSort {

    /**
     * stores the array before and after sorting
     * unsorted until startSort() is called
     */
    private int[] array;

    /**
     * constructor for MergeSort
     * @param array the array to be sorted
     */
    public MergeSort(int[] array){
        this.array = array;
    }

    /**
     * getter for the array
     * @return the array, unsorted before startSort call, sorted after
     */
    public int[] getArray() {
        return array;
    }

    /**
     * setter for the array
     * @param array the new array to be sorted
     */
    public void setArray(int[] array) {
        this.array = array;
    }

    /**
     * does an initial call to sort with the correct parameters
     */
    public void startSort(){
        sort(0,array.length-1);
    }

    /**
     * sorts the array using merge sort sorting algorithm
     * @param beginning the first index of the current part of the array
     * @param end the last index of the current part of the array
     */
    private void sort(int beginning, int end){
        if (beginning != end) {
            int middle = (end + beginning)/2;
            sort(beginning, middle);
            sort(middle+1,end);

            int[] temp = new int[end - beginning + 1];
            int i = beginning;
            int j = middle + 1;
            int k = 0;
            while (i <= middle && j <= end){
                if(array[i] > array[j]){
                    temp[k] = array[j];
                    j++;
                }else {
                    temp[k] = array[i];
                    i++;
                }
                k++;
            }

            if(i <= middle) {
                while (i <= middle) {
                    temp[k] = array[i];
                    i++;
                    k++;
                }
            }
            if(j <= end){
                while (j <= end) {
                    temp[k] = array[j];
                    j++;
                    k++;
                }
            }

            for (int l = beginning; l <= end; l++){
                array[l] = temp[l - beginning];
            }
        }

    }


    /**
     * to string method for the array
     * @return a string representation of the array
     */
    @Override
    public String toString(){
        String ret = "[";
        for(int num:array){
            ret = ret + num + ", ";
        }
        ret = ret.substring(0,ret.length()-2) + "]";
        return ret;
    }


}
