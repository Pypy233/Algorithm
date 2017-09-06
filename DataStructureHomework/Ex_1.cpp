#include <stdio.h>
#include <iostream>
using std::cout;
using std::cin;
using std::endl;
int sum = 0;
bool isOdd(int N){
	if(N % 2==0)
		return false;
	else
		return true;
}
void countOne(int N){
	if(N == 0)
		cout<< "The number of 1's in number " <<  " is " << sum << endl;
	else if(isOdd(N)){
		++sum;
		countOne(N/2);
	}
	else
		countOne(N/2);
}
int main(){
	cout << "Enter the number N: " << endl;
	int N;
	cin >> N;
	countOne(N);
	return 0;
}