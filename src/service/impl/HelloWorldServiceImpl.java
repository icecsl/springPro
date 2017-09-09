package service.impl;

import service.HelloWorldService;

/**
 * Created by huangbingjing on 17/8/24.
 */
public class HelloWorldServiceImpl implements HelloWorldService {

	private String info;

	@Override
	public void sayHello() {
		System.out.println("hello spring!"+info);
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
