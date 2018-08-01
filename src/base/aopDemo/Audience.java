package base.aopDemo;

import org.aspectj.lang.annotation.*;

/**
 * @Description:切面
 * @author: huangbingjing
 * @date: 18/7/30
 */
@Aspect
public class Audience {

	//方式一
	/*@Before("execution(** base.aopDemo.Performance.perform(..))")
	public void silenceCellPhones(){
		System.out.println("silence Cell Phones");
	}

	@Before("execution(** base.aopDemo.Performance.perform(..))")
	public void takeSeats(){
		System.out.println("take Seats");
	}

	@AfterReturning("execution(** base.aopDemo.Performance.perform(..))")
	public void applause(){
		System.out.println("applause");
	}

	@AfterThrowing("execution(** base.aopDemo.Performance.perform(..))")
	public void demandRefund(){
		System.out.println("demand Refund");
	}*/

	//方式二-通过@Pointcut声明切点表达式
	@Pointcut("execution(** base.aopDemo.Performance.perform(..))")
	public void performance(){

	}

	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("silence Cell Phones");
	}

	@Before("performance()")
	public void takeSeats(){
		System.out.println("take Seats");
	}

	@AfterReturning("performance()")
	public void applause(){
		System.out.println("applause");
	}

	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("demand Refund");
	}
}
