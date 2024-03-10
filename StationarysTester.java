class StationarysTester{

public static void main(String[] stationary)
{
	Stationary.addStationarys("pencil kit");
	Stationary.addStationarys("sharpner");
	Stationary.addStationarys("note pad");
	Stationary.addStationarys("pencil box");
	Stationary.addStationarys("white papers");
	Stationary.addStationarys("markers");
	Stationary.addStationarys("envelopes");
	Stationary.addStationarys("staplers");
	Stationary.addStationarys("paper clips");
	Stationary.addStationarys("punching machine");

	
	Stationary.getStationary();
	boolean isStationarysAdded = Stationary.updateStationarys("a4 sheet","pencil kit");
	Stationary.getStationary();
	Stationary.deleteStationarys("note pad");
	Stationary.getStationary();

}
}