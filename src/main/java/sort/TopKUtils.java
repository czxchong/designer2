package sort;

import sun.applet.Main;

/**
 * @author xchong
 * @version 创建时间：2018/10/12 下午 11:39
 * （类说明）
 */
public class TopKUtils {

    public static int[] topK(int[] sort, int[] heapArray){
        for (int i = 0; i < sort.length; i++) {
            if (sort[i] < heapArray[0]) {
                heapArray[0] = sort[i];//更新堆顶
                adjustHeap(heapArray, 0, heapArray.length);
            }
        }
        return heapArray;
    }

    /**取出top k 的K堆 */
    public static int[] findTopK(int[] array, int k) {
        int heapArray[] = new int[k];
        for (int i = 0; i < k; i++) {
            heapArray[i] = array[i];
        }
        buildMaxHeap(heapArray);
        return heapArray;
    }

    /**
     * 组建大根堆
     */
    private static void buildMaxHeap(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }
    }
    /**
     * 调整堆结构
     */
    private static void adjustHeap(int[] array, int root, int length) {
        int left = root * 2 + 1; //左节点下标，数组下标从0开始，所以加1
        int right = left + 1; //右节点下标
        int largest = root;// 存放三个节点中最大节点的下标
        if (left < length && array[left] > array[root]) { //左节点大于根节点，更新最大节点的下标
            largest = left;
        }
        if (right < length && array[right] > array[largest]) {//右节点大于根节点，最大节点的下标
            largest = right;
        }
        if (root != largest) {
            swap(array, largest, root);
            adjustHeap(array, largest, length);
        }
    }
    /**
     * 交换
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
