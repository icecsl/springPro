package proTempTest;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @Description:
 * @author: huangbingjing
 * @date: 18/7/23
 */
public class RedPktTest {
	public static void main(String[] args) {

		BigDecimal total = new BigDecimal("99");
		int totalNum = 6;

		for (int i =1; i<100;i++){
			BigDecimal amount = randomRedPacket(total, totalNum, i, new BigDecimal("1"), new BigDecimal("15"));
			System.out.println(amount);
			total = total.subtract(amount);
			totalNum=totalNum-1;
		}

//		BigDecimal a = randomRedPacket("15", "15");
//		System.out.println(a);




	}

	/**
	 * 随机红包金额
	 * @param residueAmountParam 剩余金额，包括当次
	 * @param count	剩余次数，包括当次
	 * @param seq   当前次序
	 * @return
	 */
	public static BigDecimal randomRedPacket(BigDecimal residueAmountParam,int count,int seq,BigDecimal lowLimit,BigDecimal upperLimit){
		int residueAmount = residueAmountParam.intValue();
		int minValue = lowLimit.intValue();
		if(Integer.valueOf(10)==seq
				&&residueAmount-upperLimit.intValue()>(count-1)*minValue){
			return upperLimit;
		}
		if(count==1){
			return residueAmountParam;
		}
		int avg = residueAmount/count;
		int max = avg*2>upperLimit.intValue()?upperLimit.intValue():avg*2;
		//保证剩下每个人能领到最低
		int max2 =  residueAmount-(count-1)*minValue;
		max = max>max2?max2:max;
		int minValue2 = residueAmount-(count-1)*max;
		minValue = minValue2<minValue?minValue:minValue2;
		Random random = new Random();
		int one;
		if(minValue==max){
			one = minValue;
		}else{
			one  = random.nextInt(max-minValue)+minValue;
		}
		return new BigDecimal(one);
	}


	public static BigDecimal randomRedPacket(String lowLimit, String upperLimit){
		double lowLimitD = Double.valueOf(lowLimit);
		double upperLimitD = Double.valueOf(upperLimit);

		Random random = new Random();
		double value = random.nextDouble()*(upperLimitD-lowLimitD) + lowLimitD;
		value = value>upperLimitD? upperLimitD : value;
		value = value<lowLimitD? lowLimitD : value;

		return new BigDecimal(String.valueOf(value)).setScale(2,BigDecimal.ROUND_HALF_UP);
	}

}
