package com.ziegler.xml;

import java.util.List;

import com.ziegler.soundsystem.CompactDisc;

public class BlankDisc implements CompactDisc {

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
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
	}

}
