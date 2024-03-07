class Grinder{
static boolean isConnected;
static int maxSpeed=10;
static int minSpeed;
static int presentSpeed;

 
public static boolean powerOnOrOff(){
System.out.println("inside powerOnOrOff");
if(isConnected==false){
isConnected=true;
System.out.println("is Grinder powerOn:" + isConnected);
}
else if(isConnected==true){
isConnected=false;
System.out.println("is Grinder powerOff:" + isConnected);
}
return  isConnected;

}


public static void increaseSpeed(){
	System.out.println("inside increaseSpeed");
	if(isConnected == true){
		if(presentSpeed < maxSpeed){
			presentSpeed = presentSpeed + 1;
			System.out.println("The presentSpeed is:" + presentSpeed);
}
else{
	System.out.println("Max Speed reached");
}		
	}
else{
	
	System.out.println("koti..kan kansalva..Grinder on madu..");
}	
System.out.println("end of increaseSpeed()");
	return;	
}		

public static void decreaseSpeed(){
	System.out.println("inside decreaseSpeed");
	if(isConnected == true){
		if(presentSpeed > minSpeed){
			presentSpeed = presentSpeed - 1;
			System.out.println("The presentSpeed is:" + presentSpeed);
		}	
         else{
			System.out.println("Min Speed reached"); 
		 }		
		}else{
	System.out.println("koti..kan kansalva..Grinder on madu..");
	}		
	System.out.println("end of decreaseSpeed()");
	return;
	}
}