#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main(void)
{
    fstream file("trnslt.txt");
    string text;
    getline(file,text);
    cout<<text;
    string temp="";
    for(int i=0;i<text.length();i++)
    {
        if(text[i]==" ")
        {
            break;
        }
        temp+=text[i];
    }
    file.close();
    return 0;
}
