package base.externals;

/**
 * Created by huangbingjing on 18/6/4.
 */
public class BlankDisc {

	private  String title;
	private  String artist;

	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public void show(){
		System.out.println(this.title);
		System.out.println(this.artist);
	}

}
