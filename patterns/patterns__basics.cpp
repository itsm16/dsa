/*
1234
1234
1234
1234

2nd
4321
4321
4321
4321
this pattern can be printed easily by a small change in the code below
instead of cout<<j;
we do 
cout<<n-j+1;
*/


#include <iostream>
using namespace std;
int main()
{   
    int n;
    cin>>n;
    
    for(int i =1; i<=n; i++){
        
        for(int j=1; j<=n; j++){
            cout<<j;  // cout<<n-j+1; to print 2nd pattern above
        }

        cout<<endl;
        
    }

    return 0;
}



