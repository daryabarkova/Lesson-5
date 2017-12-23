package by.dbarkova_htp.runner;

import java.util.Arrays;

import by.dbarkova_htp.bean.City;
import by.dbarkova_htp.bean.District;
import by.dbarkova_htp.bean.Region;
import by.dbarkova_htp.bean.State;

public class mainApp {
	
	public static void main(String[] args) {
	
	City city1 = new City("FirstCity", 348.8, true, true);
	City city2 = new City("SecondCity", 255.3, false, false);
	City city3 = new City("ThirdCity", 287.5, false, true);
	City city4 = new City("ForthCity", 321.9, false, false);
	City city5 = new City("FifthCity", 301.9, false, true);
	City city6 = new City("SixthCity", 333.9, false, false);
	City city7 = new City("SeventhCity", 301.9, false, true);
	City city8 = new City("EighthCity", 287.2, false, false);
	
	City[] regionCities1 = {city1, city2};
	
	Region region1 = new Region(regionCities1);
	
	City[] regionCities2 = {city3, city4};
	
	Region region2 = new Region(regionCities2);
	
    City[] regionCities3 = {city5, city6};
	
	Region region3 = new Region(regionCities3);
	
    City[] regionCities4 = {city7, city8};
	
	Region region4 = new Region(regionCities4);
	
	Region[] districtRegions1 = {region1, region2};
	
	District district1 = new District(districtRegions1);
	
	Region[] districtRegions2 = {region3, region4};
	
	District district2 = new District(districtRegions2);
	
	District[] stateDistricts = {district1, district2};
	
	City[] stateCities = {city1, city2, city3, city4, city5, city6, city7, city8};
	
	State state = new State(stateDistricts, stateCities);
	
	String stateCapital = "";
	
	for (int i = 0; i < stateCities.length; i++) {
		boolean isStateCapital = stateCities[i].getIsCapital();
		if (isStateCapital == true) {
			stateCapital = stateCities[i].getName();
		}
	}
	
	System.out.println("State Capital is " + stateCapital);
		
	System.out.println("Amount of districts is " + District.counter);
	
	double stateSquare = state.getStateSquare();
	
	System.out.println("State square is " + stateSquare);
	
	String[] districtCenterNames = new String[10];
	int b = 0;
	
	for (int a = 0; a < stateCities.length; a++) {
		boolean isDistrictCenter = stateCities[a].getIsDistrictCenter();
		if (isDistrictCenter == true) {
		districtCenterNames[b] = stateCities[a].getName();
		b = b + 1;
	}

}
	
	System.out.println("District Centers are: " + Arrays.deepToString(districtCenterNames));
	
	}
	
}
	



