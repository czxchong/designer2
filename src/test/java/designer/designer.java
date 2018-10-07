package designer;

import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class designer {

	ExecutorService executorService = Executors.newFixedThreadPool(10);

	@Test
	public void test() {
		System.out.println("单元测试");
	}

	@Test
	public void testSingleInstance() throws  Exception{
		for (int i = 0; i < 10; i++) {
			InstanceExcetors inatsnces = new InstanceExcetors();
			executorService.submit(inatsnces);
		}
		executorService.shutdown();

		System.out.println(DoubleCheckSingleInstance.getInstance() == InstanceExcetors.doubleInstace);
		System.out.println(HungrySingleInstance.getInstatnce() == InstanceExcetors.hugryInstabce);
		System.out.println(InnerClassSingleInstance.getSingleInstance() == InstanceExcetors.innerInstance);
		System.out.println(LazySingleInstance.getInstance() == InstanceExcetors.lazyInstance);

	}

	private static class InstanceExcetors implements  Runnable{
		private static  DoubleCheckSingleInstance doubleInstace;
		private static  HungrySingleInstance hugryInstabce;
		private static  InnerClassSingleInstance innerInstance;
		private static  LazySingleInstance lazyInstance;

		@Override
		public void run() {
			doubleInstace = DoubleCheckSingleInstance.getInstance();
			hugryInstabce = HungrySingleInstance.getInstatnce();
			innerInstance = InnerClassSingleInstance.getSingleInstance();
			lazyInstance = LazySingleInstance.getInstance();
		}
	}

}
