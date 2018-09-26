package jdbc;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
import org.junit.internal.runners.statements.RunAfters;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月20日 下午1:48:30
* 类说明
*/

public class JDBCServiceTest {
	
	@Test
	public void  sysTest() throws InterruptedException {
		//JDBCService jdbc = 
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		final CountDownLatch latch=new CountDownLatch(10); 
		for(int i = 0 ;i<10; i++) {
			service.submit(new Runnable() {
				
				@Override
				public void run() {
					JDBCService jdbcService = JDBCService.getInstance();
					jdbcService.sysout();
				}
			});
			/*Thread th = new Thread(new Runnable() {
				
				@Override
				public void run() {
					JDBCService jdbcService = JDBCService.getInstance();
					jdbcService.sysout();
					 latch.countDown(); 
				}
			});
			th.start();*/
			
		}
		latch.await();  
		service.shutdown();
	}
	
	@Test
	public void ExecuorTest() {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.submit(new Callable<List>() {

			@Override
			public List call() throws Exception {
				List list = new List();
				return list ;
			}
		});
	}

}
