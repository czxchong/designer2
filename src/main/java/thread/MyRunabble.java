package thread;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月18日 上午12:00:26
* 类说明
*/

public class MyRunabble implements Runnable {
	public static int a = 0;
	@Override
	public void run() {
		for (int k = 0; k < 100; k++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a++;
		}
		System.out.println("测试runabble");
	}

}
