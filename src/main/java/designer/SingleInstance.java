package designer;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月6日 下午12:28:18
* 单例模式
*/
public class SingleInstance {
	
	//提供全局实例
	private static SingleInstance instance;
	
	// 私有化
	private SingleInstance() {
		super();
	}
	
	//统一访问入口
	public static SingleInstance getInstance() {
		if(null == instance) {
			instance = new SingleInstance();
		}
		return instance;
	}
	

}
