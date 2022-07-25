#include<iostream>
using namespace std;
/////////////////////////////////////////////////////////////////////////
//
// Function name  : fun
// Description    : accept number using recursive .
// Input	      	 : Integer
// Output	      	 : Integer
// Date	        : 25/07/2022
// Author	        : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////
void fun(int N)
{
	if(N==0)
	{
		return;
	}
	else
	{
		fun(N-1);
		cout<<" "<<N;
	}
}

int main()
{
	int iNo=0;
	cout<<"Enter number"<<endl;
	cin>>iNo;
	
	fun(iNo);
}

//////////////////////////////////////////////////////////////////////
// Input  : 5
// Output :	1	2	3	4	5	
//			
//////////////////////////////////////////////////////////////////////