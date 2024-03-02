class MicroWave{
static boolean isConnected;
static int maxTimer=10;
static int minTimer;
static int presentTimer;

 
public static boolean powerOnOrOff(){
System.out.println("inside powerOnOrOff");
if(isConnected==false){
isConnected=true;
System.out.println("is MicroWave powerOn:" + isConnected);
}
else if(isConnected==true){
isConnected=false;
System.out.println("is MicroWave powerOff:" + isConnected);
}
return  isConnected;

}

public static void increaseTimer(){
	System.out.println("inside increaseTimer");
	if(isConnected == true){
		if(presentTimer < maTimer){
			presentTimer = presentTimer + 1;
			System.out.println("The presentTimer is:" + presentTimer);
}
else{
	System.out.println("Max Time reached");
}		
	}
else{
	
	System.out.println("koti..kan kansalva..MicroWave on madu..");
}	
System.out.println("end of increaseTimer()");
	return;	
}		

public static void decreaseTimer(){
	System.out.println("inside decreaseTimer");
	if(isConnected == true){
		if(presentTimer > minTimer){
			presentTimer = presentTimer - 1;
			System.out.println("The presentTimer is:" + presentTimer);
		}	
         else{
			System.out.println("Min Time reached"); 
		 }		
		}else{
	System.out.println("koti..kan kansalva..MicroWave on madu..");
	}		
	System.out.println("end of decreaseTimer()");
	return;
	}

}