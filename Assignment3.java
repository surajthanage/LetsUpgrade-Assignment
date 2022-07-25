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
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if((i==1)||(j==1)||(i==iRow)||(j==iCol))
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println(" ");
		}
	}	
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept string from user and 
// Dsplay pattern
/////////////////////////////////////////////////////////////////////////

class Assignment3
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
// Input  :     irow=5		iCol=5
// Output :		
//			*	*	*	*
//			*			*
//			*			*
//			*	*	*	*
//////////////////////////////////////////////////////////////////////
