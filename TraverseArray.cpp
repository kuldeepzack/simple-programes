// C++ Program to Illustrate How to Traverse an Array 
#include <iostream> 
using namespace std; 

int main() 
{ 

	// Initialize the array 
	int table_of_two[10] 
		= { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 }; 

	// Traverse the array using for loop 
	for (int i = 0; i < 10; i++) { 
		// Print the array elements using indexing 
		cout << table_of_two[i] << " "; 
	} 

	return 0; 
}
