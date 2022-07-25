import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : DisplayPattern
// Description    : Accept row and column and display pattern
// Output	  : Pattern
// Date	          : 24/07/2022
// Author	  : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class PatternX
{
	public int iRow;
	public int iCol;
	
	public PatternX(int a,int b)
	{
		this.iRow=a;
		this.iCol=b;
	}
	
	public void DisplayPattern()
	{
		if(iRow!=iCol)
		{
			System.out.println("Enter row and column same number");
			return;
		}
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol-i;j++)
			{
				System.out.print("\t");
			}
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print("*\t");
			}
			System.out.println(" ");
		}
	}	
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept string from user and 
// Dsplay pattern
/////////////////////////////////////////////////////////////////////////

class Assignment1
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of row");
		int iValue1=sobj.nextInt();
		System.out.println("Enter number of column");
		int iValue2=sobj.nextInt();
		
		PatternX pobj=new PatternX(iValue1,iValue2);

		pobj.DisplayPattern();
		
		
	}
}

//////////////////////////////////////////////////////////////////////
// Input  : iRow=5		iCol=5
// Output :		
//			1 
//			1 2
//			1 2 3
//			1 2 3 4 
//			1 2 3 4 5
//////////////////////////////////////////////////////////////////////
