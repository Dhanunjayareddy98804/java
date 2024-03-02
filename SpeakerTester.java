class SpeakerTester{
public static void main(String jbl[]){
 boolean isComnnected = Speaker.onOrOff();
System.out.println("finally Speaker is connected:" + isComnnected);

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
boolean isComnnected1= Speaker.onOrOff();
System.out.println("finally Speaker is connected:" + isComnnected1);


Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();




}


}