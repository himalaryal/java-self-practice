package self;

public class creatingarraytable {
	public static void main(String[] args) {
		System.out.println("Index\tvalue");
		int arr[]= {4,45,456,56,7,4};
		for(int i=0;i<arr.length;i++) {
			System.out.println(i + "\t" + arr[i]);
		}
	System.out.println("===========");
	int array[]= {5,6,75,4,35,6};
	int sum=0;
	for(int i=0;i<array.length;i++) {
		sum+=array[i];
		
	}
	System.out.println("the sum is:" +sum);
	}

}
