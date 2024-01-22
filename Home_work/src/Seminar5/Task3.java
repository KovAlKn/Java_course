package Seminar5;
import java.util.Arrays;
import java.util.TreeMap;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength,int i) {
        // Введите свое решение ниже
    int largest=i;
    int l=2*i+1;
    int r=2*i+2;

    if(l<sortLength && tree[l]>tree[largest]) {
        largest = l;
    }
    if(r<sortLength && tree[r]>tree[largest]) {
        largest = r;
    }
    if(largest!=i){
        int swap=tree[i];
        tree[i]=tree[largest];
        tree[largest]=swap;

        buildTree(tree,sortLength,largest);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
    for(int i=sortLength/2-1;i>=0;i--) {
        buildTree(sortArray,sortLength,i);
        }
    for(int i=sortLength-1;i>=0;i--) {
        int temp = sortArray[0];
        sortArray[0] = sortArray[i];
        sortArray[i] = temp;

        buildTree(sortArray, i, 0);
    }
}


//        int temp;
//        int size=sortLength-1;
//        for(int i=(sortLength/2);i>=0;i--) {
//            buildTree(sortArray,size,i);
//        };
//        for(int i=size;i>=0;i--) {
//            temp=sortArray[0];
//            sortArray[0]=sortArray[size];
//            sortArray[size]=temp;
//            size--;
//            buildTree(sortArray,size,i);
//        }

    }



public class Task3 {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
