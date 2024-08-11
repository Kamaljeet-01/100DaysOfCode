//This file have multiple pattern problems.
// Added all the pattern problems in a single file .
/*
/*
Star Pattern :

*
*  *
*  *  *
*  *  *  *
*  *  *  *  *


Code :
*/
#include <iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i>=j) cout<<" * ";
        }
        cout<<endl;
    }
    return 0;
}
/////////////////////////////////////////////////////////////////////////////////////

/*
Equilateral triangle :

    *
  *   *
*   *   *


Code :
*/

#include <iostream>
using namespace std;

void simpleTriangle(int n)
{
    // Number of spaces
    int i, j, k = n;
 
    // Outer loop to handle number of rows
    // n in this case
    for (i = 1; i <= n; i++) {
 
        // Inner loop for columns
        for (j = 1; j <= n; j++) {
 
            // Condition to print star pattern
            if (j >= k)
                cout << "* ";
            else
                cout << " ";
        }
        k--;
        cout << "\n";
    }
}
 
// Driver Code
int main()
{
    int n = 3;
    // Function Call
    simpleTriangle(n);
    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////
/*

//**Hollow Rectangle** 

 *  *  *  *  *  *  *  *  *  * 
 *                          * 
 *                          * 
 *                          * 
 *                          * 
 *                          * 
 *                          * 
 *                          * 
 *                          * 
 *  *  *  *  *  *  *  *  *  * 
Code :
*/

#include <iostream>
using namespace std;

void hollowRectangle(int n)
{
    // Number of spaces
    int i, j;
 
    // Outer loop to handle number of rows
    // n in this case
    for (i = 1; i <= n; i++) {
 
        // Inner loop for columns
        for (j = 1; j <= n; j++) {
 
            // Condition to print hollow Rectangle pattern
            if ( i==1 || i == n || j ==1 || j==n)
                cout << " * ";
            else
                cout << "   ";
        }
        
        cout << "\n";
    }
}
 
// Driver Code
int main()
{
    int n = 10;
    // Function Call
    hollowRectangle(n);
    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////
/*
**Solid Rectangle**

* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * * 
* * * * * * * * * *



Code :
*/

#include <iostream>
using namespace std;

void solidRectangle(int l,int b)
{
    // Number of spaces
    int i, j;
 
    // Outer loop to handle number of rows
    // n in this case
    for (i = 1; i <= b; i++) {
        // Inner loop for columns
        for (j = 1; j <= l; j++) {
            // Condition to print solid Rectangle pattern
                cout << " * ";
        }
        //for changing the line 
        cout << "\n";
    }
}
 
// Driver Code
int main()
{
    // Function Call
    solidRectangle(10,5);
    return 0;
}


//////////////////////////////////////////////////////////////////////////////////////////////////
/*
**Triangle Pyramid**

    *     
   ***    
  *****   
 *******  
********* 


Code :
*/

#include <iostream>
using namespace std;

void trianglePyramid(int n)
{
    //n is no. of rows (Height of pyramid)
   int i, j,start=n,temp=1;;
    for (i = 1; i <= n; i++) {
        int count=0;
        for (j = 1; j <= n*2; j++) {
            if(start<=j && count<temp ){ cout<<"*";
            count++;
            }
            else cout<<" ";
        }
        //for changing the line 
        temp+=2;
        start--;
        cout << "\n";
    }
}
 
// Driver Code
int main()
{
    // Function Call
    trianglePyramid(5);
    return 0;
}
*/
//////////////////////////////////////////////////////////////////////////////////////////////


Number triangle :

1 
2 5 
3 6 8 
4 7 9 10 

//CODE : 
//In this code I fixed the number of rows but we can take input from user. :)
#include <iostream>
using namespace std;
int main() {
    int num=1;
    for(int i=1;i<=4;i++){
        int num =i;
        for(int j=1;j<=i;j++){
            int gap=j-1;
            int sum=(4-i)+(i-gap);
            if(i>=j) {
                if(j==1) {
                    cout<<i<<" ";
                }else{
                    num+=sum;
                    cout<<num<<" ";
                }
            }
        }
        cout<<endl;
    }
    return 0;
}
