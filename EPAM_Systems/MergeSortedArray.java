package EPAM_Systems;

public class MergeSortedArray {

    public static void main(String[] args) {
    int[] arr1 = {1, 3, 5, 7};
    int[] arr2 = {2, 4, 6, 8};

    int[] merged = merge(arr1, arr2);

    for (int num : merged) {
        System.out.print(num + " ");
    }
}
 
    public static int[] merge(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];

    int i = 0; // arr1 pointer
    int j = 0; // arr2 pointer
    int k = 0; // result pointer

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] <= arr2[j]) {
            result[k++] = arr1[i++];
        } else {
            result[k++] = arr2[j++];
        }
    }

    // Copy remaining elements from arr1
    while (i < arr1.length) {
        result[k++] = arr1[i++];
    }

    // Copy remaining elements from arr2
    while (j < arr2.length) {
        result[k++] = arr2[j++];
    }

    return result;
}
}
