package by.dbarkova_htp.bean;

public class State {
	
	private District[] stateDistricts;
	private City[] stateCities;

	public State(District[] stateDistricts, City[] stateCities) {
		this.stateDistricts = stateDistricts;
		this.stateCities = stateCities;
	}
	
//	public double getStateSquare() {
//		double stateSquare = 0;
//		for (int i = 0; i < stateDistricts.length; i++) {
//			stateSquare = stateSquare + stateDistricts[i].getDistrictSquare();
//		}
//		return stateSquare;
//	}
	
	public double getStateSquare() {
		double stateSquare = 0;
		for (int i = 0; i < stateCities.length; i++) {
			stateSquare = stateSquare + stateCities[i].getCitySquare();
		}
		return stateSquare;
	}
}
