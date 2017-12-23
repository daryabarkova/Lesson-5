package by.dbarkova_htp.bean;

public class Region {
	
	private City[] regionCities;
	
	public Region (City[] regionCities) {
		this.regionCities = regionCities;
	}

	public double getRegionSquare() {
		double regionSquare = 0;
		for (int i = 0; i < regionCities.length; i++) {
			regionSquare = regionSquare + regionCities[i].getCitySquare();
		}
		
		return regionSquare;
	}
	
}
