package base.unique.impl;

import base.unique.Dessert;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by huangbingjing on 18/6/1.
 */
@Component
@Qualifier("cold")
public class IceCream implements Dessert{
	@Override
	public void show() {
		System.out.println("IceCream");
	}
}
