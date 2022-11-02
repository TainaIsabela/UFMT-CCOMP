#include <iostream>
#include <string>
using namespace std;
int main()
{
    int countpnt = 0, countdgt = 0, countlwr = 0, countupr = 0, countspc = 0;
    string s1("A 'soft' 2016 Brexit would allow the U.K.'s relationship with the EU to remain mostly unchanged: in other words, with the U.K.");
    for(auto c : s1)
    {
        if (ispunct(c))
            countpnt++;
        if (isdigit(c))
            countdgt++;
        if (islower(c))
            countlwr++;
        if (isupper(c))
            countupr++;
        if (isspace(c))
            countspc++;
    }

    cout << countpnt << " " << countdgt << " " << countlwr << " " << countupr << " " << countspc;
}
    