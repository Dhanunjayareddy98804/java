class Solution{
public static void main(String sol[]){

Sum();

}
public static void Sum(){
int sum1[]= {1,2,3,4,5};
int target= 8;
for(int i=0; i<=sum1.length;i++){
	for(int j=i+1; j<sum1.length; j++){
if(sum1[i] + sum1[j] == target){
	
	System.out.println("solution is:" + sum1[i] + " and " + sum1[j]);
}
} 
}
}
}