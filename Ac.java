class Ac{
static boolean isConnected;
static int maxTemp=10;
static int minTemp;
static int presentTemp;

 
public static boolean powerOnOrOff(){
System.out.println("inside powerOnOrOff");
if(isConnected==false){
isConnected=true;
System.out.println("is Ac powerOn:" + isConnected);
}
else if(isConnected==true){
isConnected=false;
System.out.println("is Ac powerOff:" + isConnected);
}
return  isConnected;

}

public static void increaseTemp(){
	System.out.println("inside increaseTemp");
	if(isConnected == true){
		if(presentTemp < maxTemp){
			presentTemp = presentTemp + 1;
			System.out.println("The presentTemp is:" + presentTemp);
}
else{
	System.out.println("Max Temperature reached");
}		
	}
else{
	
	System.out.println("koti..kan kansalva..Ac on madu..");
}	
System.out.println("end of increaseTemp()");
	return;	
}		

public static void decreaseTemp(){
	System.out.println("inside decreaseTemp");
	if(isConnected == true){
		if(presentTemp > minTemp){
			presentVolume = presentVolume - 1;
			System.out.println("The presentTemp is:" + presentTemp);
		}	
         else{
			System.out.println("Min Temperature reached"); 
		 }		
		}else{
	System.out.println("koti..kan kansalva..Ac on madu..");
	}		
	System.out.println("end of decreaseTemp()");
	return;
	}

}