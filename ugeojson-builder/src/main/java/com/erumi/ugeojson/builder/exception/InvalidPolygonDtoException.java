package com.erumi.ugeojson.builder.exception;

import com.erumi.ugeojson.model.geometry.PolygonDto;

public class InvalidPolygonDtoException extends RuntimeException {
 
	private static final long serialVersionUID = 1L;
	private PolygonDto polygon;

	public InvalidPolygonDtoException(PolygonDto polygon) {
		super("Invalid polygon dto: " + polygon);
		this.polygon = polygon;
	}
	
	public PolygonDto getPolygon() {
		return polygon;
	}

}