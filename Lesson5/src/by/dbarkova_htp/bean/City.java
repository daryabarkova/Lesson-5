package by.dbarkova_htp.bean;

public class City {
	
	private String name;
	private double square;
	private boolean isCapital;
	private boolean isDistrictCenter;
	
	public City (String name, double square, boolean isCapital, boolean isDistrictCenter) {
		this.name = name;
		this.square = square;
		this.isCapital = isCapital;
		this.isDistrictCenter = isDistrictCenter;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCitySquare() {
		return square;
	}
	
	public boolean getIsCapital() {
		return isCapital;
	}
	
	public boolean getIsDistrictCenter() {
		return isDistrictCenter;
	}

	
}
