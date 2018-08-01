package base.aopAround.impl;

import base.aopAround.PerformanceA;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: huangbingjing
 * @date: 18/7/31
 */
@Component
public class PerformanceAImpl implements PerformanceA {
	@Override
	public void perform() {
		System.out.println("aopAround.PerformanceAImpl.perform()");
	}
}
