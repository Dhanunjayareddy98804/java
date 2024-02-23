class Calculator{
public static void main(String calculate[]){
add(5,6);
add(56,66);
add(67,68);
add(34,44);
sub(66,36);
sub(30,15);
sub(40,20);
mul(23,3);
mul(6,5);
div(40,2);
div(28,4);
mod(100,3);
mod(300,7);
sqr(4);
sqr(6);
sqrt(9);
n(30);

}
//method
public static  void add(int num1,int num2) {
int total = num1+ num2;
System.out.println(total);
}
public static  void sub(int num1,int num2) {
int total = num1- num2;
System.out.println(total);
}
public static  void mul(int num1,int num2) {
int total = num1 * num2;
System.out.println(total);
}
public static  void div(int num1,int num2) {
int total = num1/ num2;
System.out.println(total);
}
public static  void mod(int num1,int num2) {
int total = num1 % num2;
System.out.println(total);
}
public static  void sqr(int num) {
int total = num * num;
System.out.println(total);
}
public static  void sqrt(double num1) {
double total =Math.sqrt(num1);
System.out.println(total);
}
public static  void n(double num1) {
double total = 1/num1;
System.out.println(total);
}
}