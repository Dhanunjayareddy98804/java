class FactorialNpr {
public static void main(String factorial[]){
int npr = fact(9)/fact(9-7);
System.out.println("NPR of 9 and 7 is:" + npr);


}
//methods
public static int fact(int factNumber){
int fact=1;
for(int f=1; f<=factNumber;f++){
fact=fact*f;
}
return fact;
}
}
