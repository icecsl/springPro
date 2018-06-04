package base.externals;

/**
 * Created by huangbingjing on 18/6/4.
 */
public class BlankDisc {

	private String title;
	private String artist;
	private Integer age;

	public BlankDisc(String title, String artist, Integer age) {
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
