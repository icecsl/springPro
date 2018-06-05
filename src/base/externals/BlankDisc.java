package base.externals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by huangbingjing on 18/6/4.
 */
@Component
public class BlankDisc {

	private String title;
	private String artist;
	private Integer age;

	public BlankDisc(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist, @Value("${disc.age}") Integer age) {
		this.title = title;
		this.artist = artist;
		this.age=age;
	}

	public void show(){
		System.out.println(this.title);
		System.out.println(this.artist);
		System.out.println(this.age);
	}

}
