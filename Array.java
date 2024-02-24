class Array{
public static void main(String num[]){
	sum();
	factorial();
	searchNumber();
	
}
public static void sum() {
    int numbers[] = {30, 40, 30, 20, 70, 60, 20};
    int sum = 0;
    for (int index = 0; index < numbers.length; index++) {
        sum += numbers[index];
    }
    System.out.println("Sum of the elements: " + sum);
}

public static void factorial() {
    int numbers[] = {3, 4, 5, 6, 7, 8, 9};
    for (int index = 0; index < numbers.length; index++) {
        int factorial = 1;
        for (int i = 1; i <= numbers[index]; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + numbers[index] + ": " + factorial);
    }
}

public static void searchNumber(){
	int numbers[] = {1,2,3,4,5,6};
	int valueToBeSearched= 5;
	int result=0;
	for(int index=0; index < numbers.length; index++){
		if(numbers[index] == valueToBeSearched){
			result=index;
			break;
		}
	}
	System.out.println("elements found at:"+ result);
}
	
	
	
}



