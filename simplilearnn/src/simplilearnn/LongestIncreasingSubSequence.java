package simplilearnn;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubSequence {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.out.println("Enter numbers in the array separated by comma");
			List<Integer> arrayvalues;
			Scanner s=new Scanner(System.in);
			do
			{
				arrayvalues=new ArrayList<Integer>();
				String strinput=s.nextLine();
				String[] tempvalues =strinput.split(",");
				for(int i=0;i<tempvalues.length;i++)
				{
					try
					{
						arrayvalues.add(Integer.parseInt(tempvalues[i].trim()));
					}
					catch(Exception e) {}
					
				}
				
				
			}
			while(arrayvalues.size()<=0);
				s.close();
				int length=arrayvalues.size();
				int[] arraysequence =new int[length];
				for(int i=0;i<length;i++)
				{
					arraysequence[i]=arrayvalues.get(i);
				}
				System.out.println("Longest Increasing subsequence is");
				longestIncreasingSubSequence(arraysequence,length);
						

	}

		private static void longestIncreasingSubSequence(int[] arraysequence, int length) {
			int[] lis=new int[length];
			int[] prev =new int[length];
			int maxlength=0,bestend=0;
			for(int i=0;i<length;i++)
			{
				prev[i]=-1;
				lis[i]=1;
				for(int j=i-1;j>=0;j--)
				{
					if(arraysequence[j]<arraysequence[i]&&lis[j]+1>lis[i])
					{
						lis[i]=lis[j]+1;
						prev[i]=j;
					}
				}
				if(lis[i]>maxlength)
				{
					maxlength=lis[i];
					bestend=i;
				}
				
			}
			int n=bestend;
			int[] lis_print=new int[maxlength];
			int pos=maxlength-1;
			while(n!=-1)
			{
				lis_print[pos]=arraysequence[n];
				pos--;
				n=prev[n];
				
				
			}
			System.out.printf((lis_print.length>1?"LIS " : "output: ")+ "%s with length(%d)", Arrays.toString(lis_print),lis_print.length);
			if(lis_print.length<=1)
			{
				System.out.println("LIS not found");
			}
			
			
			
			
			
			
			
			
			
			// TODO Auto-generated method stub
			
		}

}
