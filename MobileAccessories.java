class MobileAccessories{

static String name = "SRK";
static String mobileAccessories[] = {null,null,null,null,null,null,null,null,null,null};
static String ownername = "sharukhan";
static String address = "btm layout";
static String phoneNo = "987654321";
static int index;

public static boolean addMobileAcessories(String mobileAccessorie){
System.out.println("inside addmobileAcessories():");
boolean isAdded = false;
if(mobileAccessorie != null){
	mobileAccessories[index++] = mobileAccessorie;
	isAdded = true;
	System.out.println("Accessorie added successfully..");
	
}else{
	System.out.println("Accessorie Item cant be null");
}
System.out.println("end of addmobileAcessories():");
return isAdded;
}


public static void getMobileAccessories(){
	for(int index = 0; index < mobileAccessories.length; index++){
		System.out.println(mobileAccessories[index]);
	}
	
}
}