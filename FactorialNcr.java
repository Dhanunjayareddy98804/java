class FactorialNcr{
public static void main(String factorial[]){
int ncr = fact(8)/(fact(8-3)*fact(3));
System.out.println("NCR of 8 and 3 is:" + ncr);

}
public static int fact(int factNumber){
int fact=1;
for(int f=1; f<=factNumber; f++){

fact = fact * f;
}
return fact;
}





}

//sum  of an array
//find the factorial of each element of ana array
//search element in an array