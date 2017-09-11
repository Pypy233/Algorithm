#include <iostream>
#include <string>
using std::cin;
using std::cout;
using std::endl;
using std::string;
bool IsPalindrome(char arr[], int start, int end, int length){
	if(length == 0 || length == 1)  return true;
	else{
		if(arr[start] != arr[end]) return false;
		return IsPalindrome(arr, start + 1, end - 1, length - 2);
	}
}
int main(){
	cout << "Enter a string: " << endl;
	string str;
	
	cin >> str;
	int length = strlen(*p);
	cout << IsPalindrome(*p, 0, length - 1, length) << endl;
}