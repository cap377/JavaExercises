package com.siriuscom.training.phones;

public interface Phone {
	public void setColor(String color);
	public void setCameraResolution(int resolution);
	public void setResolution(int width, int height);
	public String getColor();
	public int getCameraResolution();
	public String getResolution();
	public void qualityCheck();
}
