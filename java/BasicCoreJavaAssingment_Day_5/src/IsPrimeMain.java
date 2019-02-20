import com.anr.util.MathUtil;


public class IsPrimeMain {

	public static void getPrime(int uparBound){
		int count =0;
		for(int i=2;i<uparBound;i++){
			if(MathUtil.isPrime(i)){
				System.out.println(i+" ");
				count++;
			}
		}
		System.out.println("Total prime no "+count);
		System.out.println("Prime no Percentage is  "+((double)count/uparBound)*100);
	}
	
	//  ************** PerfectPrimeFactorList *******************
	
	public static void PerfectPrimeFactorList (int num ){
			int count =0;
		for(int j=2;j<num;j++){
			
			if(MathUtil.isPrimeFactor(j)){
				count++;
				System.out.print(j+" ");	
			}
			}
		System.out.println("The Percantage if Perfect PrimeFactorList is "+(double)count/(double)num*100);
			}
	public static void main(String[] args) {
		IsPrimeMain.PerfectPrimeFactorList(100);
		IsPrimeMain.getPrime(10000);
	}
}
