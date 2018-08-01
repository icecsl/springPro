package base.aopDemo;

import org.aspectj.lang.annotation.*;

/**
 * @Description:切面
 * @author: huangbingjing
 * @date: 18/7/30
 */
@Aspect
public class Audience1 {

	//方式一
	public void silenceCellPhones(){
		System.out.println("silence Cell Phones");
	}

	public void takeSeats(){
		System.out.println("take Seats");
	}

	public void applause(){
		System.out.println("applause");
	}

	public void demandRefund(){
		System.out.println("demand Refund");
	}


}
