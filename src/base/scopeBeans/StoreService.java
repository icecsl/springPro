package base.scopeBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by huangbingjing on 18/6/4.
 */
@Component
public class StoreService {

	private ShoppingCart shoppingCart;

	@Autowired
	public void setShoppingCart(ShoppingCart shoppingCart){
		this.shoppingCart=shoppingCart;
	}
}
