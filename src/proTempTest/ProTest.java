package proTempTest;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @author: huangbingjing
 * @date: 18/7/19
 */
public class ProTest {

	public static void main(String[] args) {
//		boolean result = checkAmount(new BigDecimal("1"), "");
//		boolean result = checkAmount(null, "");
//		boolean result = checkAmount(null, null);
//		boolean result = checkAmount(null, "1-10");
//		boolean result = checkAmount(new BigDecimal("4"), "1-10");
//		boolean result = checkAmount(new BigDecimal("32"), "3-10");
		boolean result = checkAmount(new BigDecimal("32"), null);
		System.out.println(result);
	}

	private static boolean checkAmount(BigDecimal amount, String valueLimit){

		/* 金额校验规则存在**/
		if (!StringUtils.isEmpty(valueLimit)) {

			/* 则待校验金额不能为空 */
			if (amount == null){
				return false;
			}

			/* 则待校验金额在规则范围内 */
			List<String> list = Arrays.asList(valueLimit.split("[-]"));
			if (list.size() == 2){
				String lowLimit = list.get(0);
				String upperLimit = list.get(1);

				/* 金额必须在范围内 */
				if (amount.compareTo(new BigDecimal(lowLimit)) < 0 || amount.compareTo(new BigDecimal(upperLimit)) > 0 ){
					return false;
				}

			}if (list.size() == 1){
				String value = list.get(0);
				return amount.compareTo(new BigDecimal(value)) == 0;
			}
		}

		return true;
	}


}
