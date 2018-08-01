package base.aopDemo.impl;

import base.aopDemo.Performance;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: huangbingjing
 * @date: 18/7/31
 */
@Component
public class PerformanceImpl implements Performance {
	@Override
	public void perform() {
		System.out.println("aopDemo.PerformanceImpl.perform()");
	}
}
