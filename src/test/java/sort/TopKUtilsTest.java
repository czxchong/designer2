package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class TopKUtilsTest {
    @Test
    public void test(){
        int[] maxMaxHeap = {};
        boolean cycle = true;
        int i0=0;

        while(cycle){

            int[] sort = mockData(i0);

            if( sort == null || sort.length == 0) break;

            if(0 == maxMaxHeap.length && sort.length !=0){
                maxMaxHeap = TopKUtils.findTopK(sort,6);
            }

            if(i0 != 0){
                maxMaxHeap = TopKUtils.topK(sort,maxMaxHeap);
            }
            //循环判断队列
            for (int i = 0; i < maxMaxHeap.length; i++) {
                System.out.println(maxMaxHeap[i]);
            }
            i0++;
        }
    }

    /*模拟取出数据*/
    public int[] mockData(int i){
        if(0==i){
            int[] sort ={1,100,2,10,22,35,33,34,66,100};
            return  sort;
        }
        return null;
    }
}