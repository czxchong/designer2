package thread;

import java.util.concurrent.Callable;

import org.junit.Test;

import demo.Car;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月17日 下午11:22:36
* 类说明
*/

public class ThreadTest {

	@Test
	public void test() {
		Mythread thread = new Mythread();
		thread.start();
	}
	
	@Test
	public void test2(){
		System.out.println("主线程ID:"+Thread.currentThread().getId());
       
		MyThread2 thread1 = new MyThread2("线程1");
		thread1.start();
		thread1.run();
		MyThread2 thread2 = new MyThread2("线程2");
		thread2.run();
		thread2.start();
	}
	@Test
	public void runableTest() throws InterruptedException {
		Runnable r = new MyRunabble(); 
		Thread thread = new Thread(r);
		thread.start();
		//thread.interrupted()
		//thread.join();//等待线程执行完成
		//thread.getState();
		while (MyRunabble.a != 100) {
			
			System.out.println("thread.getState();"+ thread.getState());
			System.out.println(MyRunabble.a);
		}
		System.out.println(MyRunabble.a);
		System.out.println("thread.getState();"+ thread.getState());
	}
	
	@Test
	public void demo() {
	//	ExecutorService service = Executors.newFixedThreadPool(12);
		/*Future<List<String>> future = service.submit(new Callable<List<String>>() {
		    @Override
		    public List<String> call() throws Exception {
		        // 模拟查询耗时3秒
		        Thread.sleep(3000);
		        return Arrays.asList("tom", "cat", "apache", "Spark", "Scala");
		    }
		});

		try {
		    List<String> list = future.get();
		    list.forEach(System.out::println);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		} catch (ExecutionException e) {
		    e.printStackTrace();
		} finally {
		    service.shutdown();
		}*/
		
		Car cc = new Car() {
			@Override
			public String color() {
				return "color test";
			}
		};
		
		ExecutorInstance.task(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "ttf";
			}
		});
		
	}

}
