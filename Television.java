class Television{
static boolean isConnected;
 
public static boolean powerOnOrOff(){
System.out.println("inside powerOnOrOff");
if(isConnected==false){
isConnected=true;
System.out.println("is Television powerOn:" + isConnected);
}
else if(isConnected==true){
isConnected=false;
System.out.println("is Television powerOff:" + isConnected);
}
return  isConnected;
static int maxVolume=10;
static int minVolume;
static int presentVolume;


}

public static void increaseVolume(){
	System.out.println("inside increaseVolume");
	if(isConnected == true){
		if(presentVolume < maxVolume){
			presentVolume = presentVolume + 1;
			System.out.println("The presentVolume is:" + presentVolume);
}
else{
	System.out.println("Max volume reached");
}		
	}
else{
	
	System.out.println("koti..kan kansalva..Tv on madu..");
}	
System.out.println("end of increaseVolume()");
	return;	
}		

public static void decreaseVolume(){
	System.out.println("inside decreaseVolume");
	if(isConnected == true){
		if(presentVolume > minVolume){
			presentVolume = presentVolume - 1;
			System.out.println("The presentVolume is:" + presentVolume);
		}	
         else{
			System.out.println("Min volume reached"); 
		 }		
		}else{
	System.out.println("koti..kan kansalva..Tv on madu..");
	}		
	System.out.println("end of decreaseVolume()");
	return;
	}

}