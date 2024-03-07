class TelevisionTester{
public static void main(String mi[]){
 boolean isComnnected = Television.onOrOff();
System.out.println("finally Television is connected:" + isComnnected);

Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();

Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
boolean isComnnected1= Television.onOrOff();
System.out.println("finally Television is connected:" + isComnnected1);


Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
}




}