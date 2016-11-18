
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
import java.math.BigInteger;

class prime5
{
	static int primes[] = new int[20000];
	
	static int size = 1;
	
	static BigInteger stepCounter=new BigInteger(String.valueOf(0));
	public static void pP()
	{
		System.out.println("\nPrime.");
	}
	public static void nP()
	{
		System.out.println("\nNot a Prime.");
	}

	public static void prime1(int p1)
	{
		//stepCounter = BigInteger.valueOf(0);
		int i=2;
		for(i=2;i<p1;i++)
		{
			if(p1%i==0)
			{
				break;
			}
		stepCounter = stepCounter.add(BigInteger.valueOf(1));
		}
		if(i==p1)
		{
			//System.out.println("\nNot a Prime.");
			pP();
		}
		else
		{
			nP();
		}
	}
	public static void prime2(int p1)
	{
		boolean prime123 = true;
		//stepCounter = BigInteger.valueOf(0);
		int i=2;
		int pby2 = p1/2+1;
		for(i=2;i<pby2;i++)
		{
			if(p1%i==0)
			{
				prime123 = false;
				break;
				
			}
		stepCounter = stepCounter.add(BigInteger.valueOf(1));
		}
		if(prime123)
		{
			
			pP();
		}
		else
		{
			nP();
		}
	}
	public static void prime3(int p1)
	{
		boolean prime123 = true;
		//stepCounter = BigInteger.valueOf(0);
		int i=2;
		int proot2 = (int)Math.sqrt(p1)+1;
		for(i=2;i<proot2;i++)
		{
			if(p1%i==0)
			{
				prime123 = false;
				break;
				
			}
		stepCounter = stepCounter.add(BigInteger.valueOf(1));
		}
		if(prime123)
		{
			
			pP();
		}
		else
		{
			nP();
		}
	}

	public static void prime4(int p1)
	{
		boolean prime123 = true;
		//stepCounter = BigInteger.valueOf(0);
		int i=2;
		int proot2 = (int)Math.sqrt(p1)+1;
		if(p1%2==0)
		{
			prime123 = false;		
		}
		else
		for(i=3;i<proot2;i+=2)
		{
			if(p1%i==0)
			{
				prime123 = false;
				break;
				
			}
		stepCounter = stepCounter.add(BigInteger.valueOf(1));
		}


		if(prime123)
		{
			
			pP();
		}
		else
		{
			nP();
		}
	}
	
	public static void primeStore(int t1)
	{
		boolean isPr = true;
		for(int i = 1;i<Math.floor(Math.sqrt(t1));i++)
		{
			if(t1%(primes[i])==0)
			{
				isPr = false;
			}	
			stepCounter = stepCounter.add(BigInteger.valueOf(1));
		}
		if(isPr)
		{
			primes[size++] = t1;
			pP();
		}
		else
		{
			nP();
		}
	}
	public static void main(String args[]) throws IOException
	{
		primes[0] = 2;
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int abc = Integer.parseInt(br.readLine());
		
		/* double sTime = System.currentTimeMillis();
		
			prime1(abc);	
		
		System.out.println("\nNo. of steps: "+stepCounter+"\nExecution Time: "
		+((System.currentTimeMillis()-sTime)));

		sTime = System.currentTimeMillis();
		
			prime2(abc);	
		
		System.out.println("\nNo. of steps: "+stepCounter+"\nExecution Time: "
		+((System.currentTimeMillis()-sTime)));

		sTime = System.currentTimeMillis();
		
			prime3(abc);	
		
		System.out.println("\nNo. of steps: "+stepCounter+"\nExecution Time: "
		+((System.currentTimeMillis()-sTime)));

		sTime = System.currentTimeMillis();
		
			prime4(abc);	
		
		System.out.println("\nNo. of steps: "+stepCounter+"\nExecution Time: "
		+((System.currentTimeMillis()-sTime)));
		*/

		Scanner sc1 = new Scanner(new FileReader("C:\\java\\prime.txt"));

		double sTime = System.currentTimeMillis();
		
			while(sc1.hasNext())
			{
				int t = sc1.nextInt();
				primeStore(t);
			}	
		
		System.out.println("\nNo. of steps: "+stepCounter+"\nExecution Time: "
		+((System.currentTimeMillis()-sTime)));

	}
}



















