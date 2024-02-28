class MicroWave{
static boolean isConnected;
 
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



}