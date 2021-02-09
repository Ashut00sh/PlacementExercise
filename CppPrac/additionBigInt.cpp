#include<bits/stdc++.h>
#include<string>
using namespace std;

string getZero(int z){
	string zero = "";
	for(int i=0; i<z; i++){
		zero+="0";
	}
	return zero;
}

int main(){
	string str1;
	string str2;
	cin >> str1 >> str2;
	
	//cout << str1 <<" "<< str2 << endl;
	int n1 = str1.length();
	int n2 = str2.length();
	
	//cout << str1[n1-1] << " " << str2[n2-1] << endl;
	if(n1>n2){
		int z = n1-n2;
		string temp = getZero(z);
		str2 = temp+str2;
	}
	else{
		int z = n2-n1;
		string temp = getZero(z);
		str1 = temp+str1;
	}
	//cout << str1 <<" "<< str2 << endl;
	 int sum = 0;
	 int carry = 0;
	 string ch1 = "";
	 string ch2 = "";
	 vector<int> v;
	for(int i=str1.length()-1; i>=0; i--){
		ch1+=str1[i];
		ch2+=str2[i];
		
		int a = stoi(ch1);
		int b = stoi(ch2);
		
		//int a = atoi(ch1.c_str());
		//int b = atoi(ch2.c_str());
		// Both work fine //
		//cout << a << " ";
		sum = a + b + carry;
		if(sum>=10){
			carry = sum/10;
		}
		else{
			carry = 0;
		}
		v.push_back(sum%10);
		if(i==0 && carry!=0) v.push_back(carry);
		ch1="";
		ch2="";
	}
	for(int i=v.size()-1; i>=0; i--) cout << v[i];
return 0;
}
