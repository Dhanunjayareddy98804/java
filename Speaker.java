class Speaker{
static boolean isConnected;
static int maxVolume=10;
static int minVolume;
static int presentVolume;

public static boolean onOrOff(){
System.out.println("inside onOrOff()");
if(isConnected == false){
isConnected=true;
System.out.println("Is Speaker connected:" + isConnected);
}
else if(isConnected == true){
isConnected=false;
System.out.println("Is Speaker connected:" + isConnected);

}
return isConnected;
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
	
	System.out.println("koti..kan kansalva..speaker on madu..");
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
	System.out.println("koti..kan kansalva..speaker on madu..");
	}		
	System.out.println("end of decreaseVolume()");
	return;
	}
	
} 

