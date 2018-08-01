package proTempTest;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @Description:
 * @author: huangbingjing
 * @date: 18/7/23
 */
public class DateUtilTest {
	public static void main(String[] args) {

		LocalDateTime time = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
		LocalDateTime time2 = time.withHour(23)
				.withMinute(59)
				.withSecond(59);
		Date date = Date.from(time2.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(date);

	}


}
