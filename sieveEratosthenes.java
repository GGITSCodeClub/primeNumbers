import java.io.*;
import java.util.*;
class sieveEratosthenes
{
	static boolean isPrime[] = new boolean[1000000];
	static int stepCounter = 0;
	
	public static void pP()
	{
		System.out.println("\nPrime.");
	}
	public static void nP()
	{
		System.out.println("\nNot a Prime.");
	}

	public static void main(String args[]) throws IOException	
	{
		Arrays.fill(isPrime,true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i=2; i<Math.sqrt(1000000);i++)
		{
			if(isPrime[i])
			{
				for(int j = i*i; j<100000;j+=i)
				{
					isPrime[j] = false;
					stepCounter++;
				}
			}
		}

		Scanner sc1 = new Scanner(new FileReader("C:\\java\\prime.txt"));

		double sTime = System.currentTimeMillis();
		
			while(sc1.hasNext())
			{
				int t = sc1.nextInt();
				//if(isPrime[t])
				//	pP();
				//else
				//	nP();
			}	
		
		System.out.println("\nNo. of steps: "+stepCounter+"\nExecution Time: "
		+((System.currentTimeMillis()-sTime)));
	}
}