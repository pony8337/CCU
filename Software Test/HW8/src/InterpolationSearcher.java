
public class InterpolationSearcher {
  
  public void interpolationSearcher(){
	  
  }
  
  public int search(int[] sortedArray, int toFind) {
	  int low = 0;
	  int high = sortedArray.length - 1;
	  int mid;
	  while(sortedArray[high]!=sortedArray[low] && sortedArray[low]<=toFind && sortedArray[high]>=toFind) {
		 mid = low +((toFind-sortedArray[low])*(high-low))/(sortedArray[high]-sortedArray[low]); 
		 if(sortedArray[mid]<toFind)
			 low = mid+1;
		 else if(sortedArray[mid]>toFind)
			 high = mid-1;
		 else
			 return mid;
	  }
	  if(sortedArray[low] == toFind)
		  return low;
	  else
		  return -1;
  }
}
