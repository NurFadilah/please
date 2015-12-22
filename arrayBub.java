class arrayBub{
	public int[]bil;
	private int n;
	
public arrayBub(int max)
	{
	bil=new int[max];
	n=0;
	}
public void insert (int nilai)
	{
	bil[n] = nilai;
	n++;
	}
public void display()	
	{
	for (int j=0; j<n; j++)
	System.out.print(bil[j] + " ");
	System.out.println ("");
	}
public void bubbleSort(){
	int i,j;
	for (i=0; i<n; i++)
		for (j=0; j<n-1; j++)
			if(bil[j+1] < bil [j])
			swap (j,j+1);
			}
			
private void swap(int a, int b){
	int temp;
	temp  =bil[a];
	bil[a] = bil[b];
	bil[b] = temp;
}

public void selectionSort(){
int i,j, min;
	for(i=0; i<10-1; i++){
	min =i;
		for (j=i+1; j<bil.length; j++)
			if (bil [j] < bil [min])
				min = j;
			swap (i, min);
		}
	}
	
	public void insertionSort(){
	for (int i=1; i<0; i++){
	int t=bil[i];
		for (int j=i; j>=0; j--){
			if (t < bil [j]){
				bil [j+1] = bil[j];
				bil [j] = t;
			}
			else {
				bil [j+1] = t;
				break;
			}
		}
	}
	}
public int binarySearch(int key) {


	int low = 0;
	int high = bil.length;
	int Not_found = -1;
	
	while (low< high) {
		int mid = (low + high) / 2;
		if (bil[mid] == key)
			return mid;
		else if (bil[mid] < key)
			low = mid+1;
		else
			high = mid;
		}
	return Not_found;
	}

	}