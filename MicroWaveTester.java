class MicroWaveTester{
public static void main(String bajaj[]){
 boolean isComnnected = MicroWave.onOrOff();
System.out.println("finally MicroWave is connected:" + isComnnected);

MicroWave.increaseSpeed();
MicroWave.increaseSpeed();
MicroWave.increaseSpeed();
MicroWave.increaseSpeed();
MicroWave.increaseSpeed();
MicroWave.increaseSpeed();
MicroWave.increaseSpeed();
MicroWave.increaseSpeed();
MicroWave.increaseSpeed();
MicroWave.increaseSpeed();

MicroWave.decreaseSpeed();
MicroWave.decreaseSpeed();
MicroWave.decreaseSpeed();
MicroWave.decreaseSpeed();

boolean isComnnected1= MicroWave.onOrOff();
System.out.println("finally MicroWave is connected:" + isComnnected1);


MicroWave.decreaseSpeed();
MicroWave.decreaseSpeed();
MicroWave.decreaseSpeed();
MicroWave.decreaseSpeed();
MicroWave.decreaseSpeed();
MicroWave.decreaseSpeed();

}




}