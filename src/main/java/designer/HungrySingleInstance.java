package designer;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月6日 下午1:28:02
* 饿汉模式
*/

public class HungrySingleInstance {
	//类加载时就已经创建好实例
	private static HungrySingleInstance instance = new HungrySingleInstance();
	
	//私有化
	private HungrySingleInstance() {};
	
	/**
	 * 全局统一访问方法
	 */
	public static HungrySingleInstance getInstatnce() {
		return instance;
	}
	
}
