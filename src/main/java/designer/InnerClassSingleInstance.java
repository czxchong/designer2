package designer;

/**
 * @author xchong E-mail: 1305257719@qq.com
 * @version 创建时间：2018年10月6日 下午11:46:02
 * 内部类单例模式
 */
public class InnerClassSingleInstance {
    private  InnerClassSingleInstance() { super();}

    private static class  InnerSingleInstance {
        private  final static InnerClassSingleInstance instance = new InnerClassSingleInstance();
    }

    public static InnerClassSingleInstance getSingleInstance(){
        return InnerSingleInstance.instance;
    }
}
