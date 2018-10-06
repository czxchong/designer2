package designer;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月6日 下午12:28:18
*懒汉模式
*/
public class LazySingleInstance {
	
	//提供全局实例
	private static LazySingleInstance instance;
	
	// 私有化
	private LazySingleInstance() {
		super();
	}
	
	//统一访问入口
	synchronized public static LazySingleInstance getInstance() {
		if(null == instance) {
			instance = new LazySingleInstance();
		}
		return instance;
	}
	

}
