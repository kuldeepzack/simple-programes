// C++ Program to Illustrate How to Find the Size of an 
// Array 
#include <iostream> 
using namespace std; 

int main() 
{ 
	int arr[] = { 1, 2, 3, 4, 5 }; 

	// Size of one element of an array 
	cout << "Size of arr[0]: " << sizeof(arr[0]) << endl; 

	// Size of array 'arr' 
	cout << "Size of arr: " << sizeof(arr) << endl; 

	// Length of an array 
	int n = sizeof(arr) / sizeof(arr[0]); 

	cout << "Length of an array: " << n << endl; 

	return 0; 
}
