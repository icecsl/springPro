package base.aopParam;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: huangbingjing
 * @date: 18/7/31
 */
@Aspect
public class TrackCounter {

	private Map<Integer, Integer> trackCounts = new HashMap<>();

	@Pointcut("execution(* CompactDisc.playTrack(int)) && args(trackNum)")
	public void trackPlayed(int trackNum){}


	//计数
	@Before("trackPlayed(trackNum)")
	public void countTrack(int trackNum){
		int currentCount = getPlayCount(trackNum);
		trackCounts.put(trackNum, currentCount+1);
	}


	public int getPlayCount(int trackNum){
		return trackCounts.containsKey(trackNum)? trackCounts.get(trackNum):0;
	}
}
