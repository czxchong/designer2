package designer;

/**
 * @author xchong E-mail: 1305257719@qq.com
 * @version 创建时间：2018年10月6日 下午11:46:02
 * 双重检查单例模式
 */
public class DoubleCheckSingleInstance {
    private static volatile DoubleCheckSingleInstance instance;

    private DoubleCheckSingleInstance() { super();}

    public  static  DoubleCheckSingleInstance getInstance(){
        if(null == instance){
            synchronized (DoubleCheckSingleInstance.class){
                if(instance == null){
                    instance = new DoubleCheckSingleInstance();
                }
            }
        }
        return instance;
    }

}
