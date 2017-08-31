package service.impl;

import service.HelloWorldService;

import java.math.BigDecimal;

/**
 * Created by huangbingjing on 17/8/24.
 */
public class HelloWorldServiceImpl implements HelloWorldService {
	@Override
	public void sayHello() {
		BigDecimal a = new BigDecimal(1000000000);
		a=a.add(new BigDecimal("6352050000"));
		System.out.println("hello spring!"+a);
	}
}
