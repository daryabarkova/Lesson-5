package by.dbarkova_htp.bean;

public class District {
	
	private Region[] districtRegions;
	
	int counter = 0;
	
	public District (Region[] districtRegions) {
		this.districtRegions = districtRegions;
		
		counter++;
	}

	public double getDistrictSquare() {
		double districtSquare = 0;
		for (int i = 0; i < districtRegions.length; i++) {
			districtSquare = districtSquare + districtRegions[i].getRegionSquare();
		}
		return districtSquare;
	}
	
	public int getDistrictsAmount() {
		return counter;
	}
	
}
