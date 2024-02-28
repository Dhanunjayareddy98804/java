class Mixer{
static boolean isConnected;
 
public static boolean powerOnOrOff(){
System.out.println("inside powerOnOrOff");
if(isConnected==false){
isConnected=true;
System.out.println("is Mixer powerOn:" + isConnected);
}
else if(isConnected==true){
isConnected=false;
System.out.println("is Mixer powerOff:" + isConnected);
}
return  isConnected;

}



}