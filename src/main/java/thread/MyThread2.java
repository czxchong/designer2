package thread;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月17日 下午11:30:13
* 类说明
*/

public class MyThread2 extends Thread{
	private String name;
	
	
	public MyThread2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		long id = Thread.currentThread().getId();
		System.out.println("name:"+name+" 子线程ID:"+id);
		
	}

}
