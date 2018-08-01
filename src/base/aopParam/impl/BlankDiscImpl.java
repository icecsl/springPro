package base.aopParam.impl;

import base.aopParam.CompactDisc;

import java.util.List;

/**
 * @Description:
 * @author: huangbingjing
 * @date: 18/7/31
 */
public class BlankDiscImpl implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public void playTrack(int num) {
		if (num > tracks.size()) {
			System.out.println("-Track: " + null);
			return;
		}
		System.out.println("-Track: " + tracks.get(num));

	}
}
