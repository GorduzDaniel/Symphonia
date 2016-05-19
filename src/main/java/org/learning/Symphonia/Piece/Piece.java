package org.learning.Symphonia.Piece;

import org.simpleframework.xml.Element;

public class Piece {
	@Element
	private String name;
	
	@Element
	private String resource;
	
	public String getName() {
		return name;
	}
	public String getResource() {
		return resource;
	}
}
