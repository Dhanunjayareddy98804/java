class Factorial {
public static void main(String factorial[]){
int factNumber = 5;
int fact =1;
for(int f=1; f <= factNumber; f++){
fact= fact*f;
System.out.println(fact);
}
System.out.println("Factorial of"+ factNumber + "is" + fact);


}
}