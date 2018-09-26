package math;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
* @author xchong E-mail: 1305257719@qq.com
* @version 创建时间：2018年8月28日 下午5:02:51
* 类说明
*/

public class MathTest {
	
	@Test
	public void test() {
		//random 随机数：返回一个带正符号的双值，大于或等于0.0，小于1.0。
		// Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		System.out.println(Math.random());
		System.out.println(Math.round(-11.5));
		System.out.println(Math.round(11.5));
		System.out.println(Math.ceil(1.1));
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.ceil(3.5));
		System.out.println(Math.floor(3.5));
		System.out.println(Math.floor(3.1));


		System.out.println(Math.abs(-3.1));
		System.out.println(Math.abs(3.1));
		System.out.println(Math.abs(1.1));
		System.out.println(Math.abs(-1.1));

		System.out.println(Math.max(-1.1,1.1));
		System.out.println(Math.min(-1.1,1.1));

		List<String> list = new ArrayList<>();
		
	}

}
