package Coding_QA;

public class duplicate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] array = {1,2,3,4,6,2,7,8,9,0,0,10,11,12,12,14};
		int count=0;
		
		for (int i=0;i<array.length;i++) {
			for(int  j=i+1;j<array.length;j++) {
				if (array[i]==array[j]) {
				 System.out.println("duplicate of the array:" +array[i]);
				break;//	count++;
				}
				
				//System.out.println(count);
			}
			
		}
		
		//int a[] = new int[4];
		
		
		
	}

}
