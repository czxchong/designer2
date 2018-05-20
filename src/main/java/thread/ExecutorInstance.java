package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import demo.Car;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月19日 上午9:05:29
* 类说明
*/

public class ExecutorInstance {
	private static final int MAX_THREAD_NUM = 10; 
    private static ExecutorService executorService = Executors.newFixedThreadPool(MAX_THREAD_NUM);
    
    public static <V> void task(Callable<V> call) {
    	//executorService.execute(command);
    	//System.out.println(car.color());
    	executorService.submit(call);
	}
}
