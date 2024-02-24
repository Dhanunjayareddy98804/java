class Pattern{
public static void main(String pat[]){
pattern();
number();
numbers();
line();
less();

}

public static void pattern(){
for(int i=0;i<=5;i++){
for(int j=1;j<=5;j++){
System.out.print("*");
}
System.out.println();
}
}
public static void number(){
for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
System.out.print(i);
}
System.out.println();
}
}
public static void numbers(){
	int n=5;
	int k =1;
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.printf("%2d",k);
k++;
}
System.out.println();
}
}
public static void line(){
	int n=5;
for(int i=1;i<=n;i++){
for(int j=0;j<n;j++){
System.out.print(((i*j)%2)+"");
}
System.out.println();
}
}
public static void less(){
for(int i=5;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print(i);
}
System.out.println();
}
}
}