#include<iostream>
using namespace std;
void quickSort(int arr[], int left, int right) {
	if (left > right)
		return;
	int pivot = arr[left];
	int i = left;
	int j = right;
	while (i <= j) {
		while (arr[i] <= pivot)
			++i;
		while (arr[j] > pivot)
			--j;
		if (i < j)
			swap(arr[i], arr[j]);
	}
	swap(arr[left], arr[j]);
	quickSort(arr, left, j - 1);
	quickSort(arr, j + 1, right);
}
void printArray(int arr[], int n) {
	for (int i = 0; i < n; i++)
		cout << "Arr[" << i << "] : " << arr[i] << endl;

	cout << endl;
}
int main(){
    	int n;
	cout << "Enter Number of elements : ";
	cin >> n;
	int arr[n];
	for (int i = 0; i < n; i++) {
		cout << "Enter value of arr[" << i << "] : ";
		cin >> arr[i];
	}
	cout << endl;
	cout << "Before sort" << endl;
	printArray(arr, n);
    int l,r;
    r=arr[0],l=arr[n-1];
    quickSort(arr,l,r);
    cout<<"after sort "<<endl;
    printArray(arr,n);
    return 0;
}