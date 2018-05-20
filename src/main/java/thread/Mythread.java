package thread;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月17日 下午11:16:20
* 类说明
*/

public class Mythread extends Thread {
	
	private static int num = 0;
	
	public Mythread() {
		num++;
	}
	@Override
	public void run() {
		System.out.println("多线程" + num);
	}
	
}
