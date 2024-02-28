class Ac{
static boolean isConnected;
 
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



}