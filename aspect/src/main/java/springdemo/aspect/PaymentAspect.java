package springdemo.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class PaymentAspect {
	@Pointcut("execution(* springdemo.aspect.payment.doPayment(..))")
	private void all() {}
	@Before("all()")
	public void beforePay() {
	//System.out.println("Before payment......" +joinPoint.getSignature().getName());	
	System.out.println("Before payment......");
	}
	@After("all()")
	public void afterPay() {
	System.out.println("After payment....." );	
	
	}
	@AfterReturning(pointcut="all()",returning="result")
	public void show(int result) {
		System.out.println("Payment of " +result + " successful");
	}

}
