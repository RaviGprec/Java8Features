
public class MaxOnesWithKZerosFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{0,1,1,0,1,1,0,1,1};
		int maxOnes = 0;
		int start = 0;
		int zeros = 0;
		int k = 4;//no.of zeros that we can flip
		for(int end = 0; end < arr.length; end++) {
			if(arr[end] == 0)
				zeros +=1;
			while(zeros>k) {
				if(arr[start] == 0) {
					zeros -=1;
				}
				start +=1;
			}
			maxOnes = Math.max(maxOnes, end-start+1);
		}
		System.out.println("Max is :"+maxOnes);
	
	}

}
