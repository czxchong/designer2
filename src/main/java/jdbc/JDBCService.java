package jdbc;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年5月20日 上午9:23:52
* 类说明
*/

public class JDBCService implements JDBCServiceDao{
	private static volatile JDBCService jdbcService ;
	
	private JDBCService() {
		
	}
	
	public static JDBCService getInstance() {
		System.out.println("jdbcService1:"+Thread.currentThread().getName());
		if(jdbcService == null) {
			//System.out.println("jdbcService2:"+Thread.currentThread().getName());
			synchronized (JDBCService.class) {
				System.out.println("jdbcService2:"+Thread.currentThread().getName());
				if(jdbcService == null) {
					System.out.println("jdbcService3:"+Thread.currentThread().getName());
					jdbcService = new JDBCService();
					System.out.println("jdbcService4:"+Thread.currentThread().getName());
				}
			}
		}
		return jdbcService;
	}

}
