/**

Once upon a time, in a kingdom far, far away, there 
lived a king Byteasar I. As a kind and wise ruler,
he did everything in his (unlimited) power to make 
life of his subjects comfortable and pleasant. One cold
evening a messenger arrived to the king's castle with 
the latest news: all kings in the Kingdoms Union started to 
enforce traffic laws! In order not to lose his membership in 
the Union, king Byteasar had to do the same in his kingdom.
But what would the citizens think of it?

The king decided to start introducing the changes with something
more or less simple: change all the roads in the kingdom from two-directional
to one-directional. He personally prepared the roadRegister of the new roads, 
and now he needs to make sure that the road system is convenient and there will 
be no traffic jams, i.e. each city has the same number of incoming and outgoing roads.
As the Hand of the King, you're the one who should check it.


**/
#include <iostream>
#include <vector>
using namespace std;
bool  checkCityINandOut(vector<vector<bool>> roadRegister , int city);
bool newRoadSystem(vector<vector<bool>> roadRegister);

bool newRoadSystem(vector<vector<bool>> roadRegister) {
    int badCity=0;
    for(int i=0; i<roadRegister.size(); i++){
        bool city_inout=checkCityINandOut(roadRegister , i);
        if(!city_inout)    badCity++;
                    
    }
    
    if(badCity>0) return false;
    else return true;
}

bool  checkCityINandOut(vector<vector<bool>> roadRegister , int city) {
    bool inout=false;
    int cityIn=0;
    int cityOut=0;
    for(int i=0; i<roadRegister.size(); i++){
       for(int j=0; j<roadRegister[i].size(); j++){
             if(city==i && roadRegister[i][j]) cityIn++;
            if(city==j && roadRegister[i][j]) cityOut++;
        
    } 
        
        
    }
    
    if(cityIn==cityOut) inout=true; 
    else inout=false;
    return inout;
}


int main() {
    vector<vector<bool> > array2D= {
        {false,true,false,true,true}, 
        {false,false,false,false,true}, 
        {true,false,false,true,true}, 
        {true,true,true,false,false}, 
        {true,true,true,false,false}
    };
    cout<<newRoadSystem(array2D);
    return 0;
}