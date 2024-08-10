//FUNCTIONS :

// functions are set of code which perform something for you
// functions are used to modularize the code
// functions are used to increase readability 
//functions are beneficial when we have to use same code multiple times.


//Swap two number without using temporary variable:

//CODE :

#include <iostream>
using namespace std;
void swap(int &x,int &y){
    x=x+y;
    y=x-y;
    x=x-y;
}
int main() {
    int a,b;
    cin>>a>>b;
    swap(a,b);
    cout<<"A : "<<a<<" "<<"B : "<<b<<endl;
    return 0;
}

// Reverse a number :

//CODE :

#include <iostream>
using namespace std;
void reverseNumber(int &x){
    int temp,num=0;
    while(x>0){
        temp=x%10;
        num= num*10 + temp;
        x=x/10;
    }
    x=num;
}
int main() {
    int a;
    cin>>a;
    reverseNumber(a);
    cout<<"A : "<<a<<endl;
    return 0;
}

//Printing fabonacci Series upto nth term;

//CODE:

#include <iostream>
using namespace std;
void fabonacciSeries(int x){
    int a=1,b=1,sum=a+b;
    cout<<a <<" "<<b<<" ";
    //loop started from 3 because we already printed 2 elements of fabonacci series
    for(int i=3;i<=x;i++){
        cout<<sum<<" ";
        a=b;
        b=sum;
        sum=a+b;
    }
}
int main() {
    int a;
    cin>>a;
    fabonacciSeries(a);
    return 0;
}


//Checking for prime number:

//CODE :

#include <iostream>
using namespace std;
string isPrime(int x){
    if(x==1 || x==0) return "NO";
    for(int i=2;i<=x/2;i++){
        if(x%i==0){
            return "NO";
        }
    }
    return "YES";
}
int main() {
    int a;
    cin>>a;
    string result = isPrime(a);
    cout <<a<< " is Prime ? "<<result<<endl;
    return 0;
}

//Prime Numbers between two numbers :

//CODE:
#include <iostream>
using namespace std;
bool isPrime(int x){
    if(x==1 || x==0) return false;
    for(int i=2;i<=x/2;i++){
        if(x%i==0){
            return false;
        }
    }
    return true;
}
int main() {
    int a;
    cin>>a;
    for(int i=1;i<=a;i++){
    (isPrime(i))?cout<<i<<" ":cout<<"";
    }
    return 0;
}

//Factorial of  a number:
//CODE:

#include <iostream>
using namespace std;
int factorial(int x){
    if(x==1 || x==0) return 1;
    int fac=1;
    for(int i=1;i<=x;i++){
        fac*=i;
    }
    return fac;;
}
int main() {
    int a;
    cin>>a;
    cout<<"Factorial of "<<a<<" is "<<factorial(a)<<endl;
    return 0;
}
