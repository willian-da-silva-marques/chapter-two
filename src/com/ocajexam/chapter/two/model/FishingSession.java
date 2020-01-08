package com.ocajexam.chapter.two.model;

import java.io.Serializable;

public class FishingSession implements Serializable {

	private static final long serialVersionUID = 474421779639536657L;

	private String session;
	private boolean baitAvailable;

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public boolean isBaitAvailable() {
		return baitAvailable;
	}

	public void setBaitAvailable(boolean baitAvailable) {
		this.baitAvailable = baitAvailable;
	}
}