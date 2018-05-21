package jdbc;

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
	public void  sysTest() {
		//JDBCService jdbc = 
		//ExecutorService service = Executors.newFixedThreadPool(10);
		
		for(int i = 0 ;i<10; i++) {
			/*service.submit(new Runnable() {
				
				@Override
				public void run() {
					JDBCService.getInstance();
					
				}
			});
			service.shutdown();*/
			
			Thread th = new Thread(new Runnable() {
				
				@Override
				public void run() {
					JDBCService.getInstance();
				}
			});
			th.start();
		}
	}

}
