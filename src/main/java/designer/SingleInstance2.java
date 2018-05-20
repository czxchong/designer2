package designer;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月6日 下午1:28:02
* 类说明
*/

public class SingleInstance2 {
	//类加载时就已经创建好实例
	private static SingleInstance2 instance = new SingleInstance2();
	
	//私有化
	private SingleInstance2() {};
	
	/**
	 * 全局统一访问方法
	 */
	public static SingleInstance2 getInstatnce() {
		return instance;
	}
	
}
