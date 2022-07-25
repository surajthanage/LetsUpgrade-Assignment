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
void get(int N)
{
	if(N<1)
	{
		return;
	}
	else
	{
		get(N-1);
		get(N-3);
		cout<<" "<<N;
	}
}

int main()
{
	int iNo=0;
	cout<<"Enter number"<<endl;
	cin>>iNo;
	
	get(iNo);
}

//////////////////////////////////////////////////////////////////////
// Input  : 5
// Output :	1	2	3	4	5	
//			
//////////////////////////////////////////////////////////////////////