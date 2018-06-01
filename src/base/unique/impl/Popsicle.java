package base.unique.impl;

import base.unique.Dessert;
import org.springframework.stereotype.Component;

/**
 * Created by huangbingjing on 18/6/1.
 */
@Component
public class Popsicle implements Dessert {
	@Override
	public void show() {
		System.out.println("Popsicle");
	}
}
