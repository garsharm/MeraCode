package LearningOCJP;

public class ToBinaryConverter {
	
	
	public static String binary(double number,int bits){
		
		String answer="";
		int maxIndex=0;
		double number2=number;
		
		while(number2>=2){
			maxIndex++;
			/*System.out.println(number2);*/
			number2=number2/2;
		}
		number2=number;
		
		System.out.println("maxIndex: "+(maxIndex+1));
		
		int[] bNumber=new int[maxIndex+1];
		
		int[] emptyBits=new int[bits-maxIndex-1];
		
		
		for(int i=maxIndex;i>=0;i--){
			
			if((number2-Math.pow(2,i))<0){
				bNumber[maxIndex-i]=0;
				
				/*System.out.println("run_<0 at:"+i);*/
			}
			
			if((number2-Math.pow(2,i))==0){
				bNumber[maxIndex-i]=1;
				/*System.out.println("run_0 at:"+ i);*/
				break;
			}
			
			
			if((number2-Math.pow(2,i))>=1){
				bNumber[maxIndex-i]=1;
				/*System.out.println("run_>=1 at:"+i);*/
				number2=(number2-Math.pow(2,i));
			}
		}
		
		StringBuffer a=new StringBuffer("");
		for(int e:emptyBits){
			a.append(e);
		}
		
		for(int b:bNumber){
			a.append(b);
		}
		
		answer=a.toString();
		return answer;
	}
	
	public static void main(String args[]){
		
		System.out.println(binary(1,8));
	}

}
