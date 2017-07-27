package com.siriuscom.training.phones;

public class Sony implements Phone {
	
	private int cameraRes;
	private int[] screenRes = new int[2];
	private String color;
	
	public Sony(String color, int cameraRes, int screenWidth, int screenHeight) {
		setColor(color);
		setCameraResolution(cameraRes);
		setResolution(screenWidth, screenHeight);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setCameraResolution(int resolution) {
		this.cameraRes = resolution;
	}
	public void setResolution(int width, int height) {
		this.screenRes[0] = width;
		this.screenRes[1] = height;
	}
	public String getColor() {
		return this.color;
	}
	public int getCameraResolution() {
		return this.cameraRes;
	}
	public String getResolution() {
		return this.screenRes[0] + "x" + this.screenRes[1];
	}
	public void qualityCheck() {
		if (screenRes[0] < 400 || screenRes[1] > 2000 || cameraRes < 8) {
			System.out.println("Type: Sony" +
					"\tColor: " + color + 
					"\tScreen Resolution: " + screenRes[0] + "x" + screenRes[1] + 
					"\tCamera Resolution: " + cameraRes + 
					"\tQuality Status: FAILED");
		}
		else {
			System.out.println("Type: Sony" + 
					"\tColor: " + color + 
					"\tScreen Resolution: " + screenRes[0] + "x" + screenRes[1] + 
					"\tCamera Resolution: " + cameraRes + 
					"\tQuality Status: PASSED");
		}
	}
	
}
