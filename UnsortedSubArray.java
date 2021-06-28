
public class UnsortedSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,0};
	    int s = 1;
	    int e = input.length-1;
	    while(s < input.length){
	      if(input[s] > input[s-1])
	        break;
	      s +=1;
	    }
	    while(e > s){
	      if(input[e] < input[e-1])
	        break;
	      e -=1;
	    }
	    System.out.println("s"+(s+1)+", e="+(e+1));
	}

}
