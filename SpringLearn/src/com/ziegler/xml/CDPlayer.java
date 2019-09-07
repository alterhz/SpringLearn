package com.ziegler.xml;

import org.springframework.beans.factory.annotation.Autowired;

import com.ziegler.soundsystem.CompactDisc;
import com.ziegler.soundsystem.MediaPlayer;

public class CDPlayer implements MediaPlayer {
	private CompactDisc compactDisc;
	
	@Autowired
	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
	public void play() {
		compactDisc.play();
	}
}
