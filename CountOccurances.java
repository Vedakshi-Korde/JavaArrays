import java.util.Scanner;
class CountOccurances{
		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int n=s.nextInt();

			int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}		
			System.out.println("Enter element ");
			int occur=s.nextInt();
			int c=0;
			for(int i=0;i<arr.length;i++){
				if(occur==arr[i]){
					c++;
					
				}
			}
			System.out.println(+occur+" "+"elemnt occurs"+" "+c+" "+"times");
		}

}