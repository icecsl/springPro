package base.aopAround;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Description:环绕通知切面
 * @author: huangbingjing
 * @date: 18/7/30
 */
//@Aspect
public class Audience {

	//方式二-通过@Pointcut声明切点表达式
	@Pointcut("execution(** base.aopAround.PerformanceA.perform(..))")
	public void performance(){

	}

	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try {
			System.out.println("silence Cell Phones");
			System.out.println("take Seats");
			jp.proceed();
			System.out.println("applause");
		} catch (Throwable throwable) {
			System.out.println("demand Refund");
		}
	}
}
