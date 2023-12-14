#include<bits/stdc++.h>
using namespace std;
int main ()
{
    string s1 = "a";
    string s2 = "aaa";

     int count = 0;
    for (int i=0; i<s1.length(); i++)
    {
        for (int j=0; j<s2.length(); j++)
        {
            if (s1[i] == s2[j])
              count++;
              break;
        }
    }

    cout << count << endl;
}