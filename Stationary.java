class Stationary{

static String name = "Ambika";
static String stationarys[] = {null,null,null,null,null,null,null,null,null,null};
static String ownername = "rayudu";
static String address = "kurnool";
static String phoneNo = "9876543210";
static int index;

public static boolean addStationarys(String stationary){
System.out.println("inside addStationarys():");
boolean isAdded = false;
if(stationary != null){
	stationarys[index++] = stationary;
	isAdded = true;
	System.out.println("stationary added successfully..");
	
}else{
	System.out.println("stationary Item cant be null");
}
System.out.println("end of stationarys():");
return isAdded;
}


public static void getStationary(){
	for(int index = 0; index < stationarys.length; index++){
		System.out.println(stationarys[index]);
	}
}
	
	public static boolean updateStationarys(String newStationary,String oldStationary){
		System.out.println("before updating Stationary:");
		boolean isUpdated = false;
		for(int index = 0; index < stationarys.length;index++){
			if(stationarys[index]== oldStationary){
				stationarys[index] = newStationary;
				isUpdated = true;
			}
		}
		System.out.println("After updating stationarys:");
		return isUpdated;
	}
}
