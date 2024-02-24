public class ArrayOps {
    public static void main(String[] args) {
    	
        
    }
    
    public static int findMissingInt (int [] array) {
		int [] temp = new int [array.length + 1];
		
		int missingItem = 0;
		
		for (int i = 0; i < temp.length; i++) {
			temp [i] = 0;
		}
		
		for (int j = 0; j < array.length; j++) {
			temp[array[j]] = 1;
		}
		
		for (int k = 0; k < temp.length; k++) {
			if (temp[k] == 0) {
				missingItem = k;
			}
		}
			return missingItem;
		
	}
				
			
        

    public static int secondMaxValue(int [] array) {
		int [] maxArr = new int [array.length-1];
      
		int max = 0;
		int max2 = 0;
		int countMax = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		for (int j = 0; j < array.length; j++) {
			if (max2 < array[j]) {
				
				if (array[j] == max) {
				
					if (countMax > 0) {
						max2 = array[j];
					}
					
					countMax++; 
					
				} else {
				 
				max2 = array[j];
				}
			}
		}
		
        return max2;
 
	}

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        
		boolean equal = true;
		
		if (array1.length >= array2.length) {
			boolean arrB [] = new boolean [array1.length];
			
			for (int j = 0; j < arrB.length; j++) {
				arrB[j] = false;
			}
			
			for (int i = 0; i < array1.length; i++) {
				for ( int k = 0; k < array2.length; k++) {
					if (array1[i] == array2[k]) {
						arrB[i] = true;
					}
				}
			}
			
			for ( int x = 0; x < arrB.length; x++) {
				if (arrB[x] == false) {
					equal = false; 
			}
		}
			
		} else {
			
			boolean arrB [] = new boolean [array2.length];
			
			for (int j = 0; j < arrB.length; j++) {
				arrB[j] = false;
			}
			
			for (int i = 0; i < array2.length; i++) {
				for ( int k = 0; k < array1.length; k++) {
					if (array2[i] == array1[k]) {
						arrB[i] = true;
					}
				}
			}
			
			for ( int x = 0; x < arrB.length; x++) {
				if (arrB[x] == false) {
					equal = false; 
			}
		}
		
		}
		
		return equal;
	}
		
	

    public static boolean isSorted(int [] array) {
		
		boolean isSorted = true;
		
		if (array.length == 1) {
			return isSorted;
		
		} else { 
			int i=0;
			
			if (array[i] == array[i+1]) {	
				while (array[i] == array[i+1] && i < array.length-2) {
					i++;
				}
			}
			
			if (array[i] < array[i+1])
				while (i < array.length-1){
					if (array[i] > array[i+1]) {
						isSorted = false;
						i = array.length;
						
					} else {
						i++;
					}
					
						} else {
							while (i < array.length-1){
								if (array[i] < array[i+1]) {
								isSorted = false;
								i = array.length;
								
									} else {
										i++;
						}
					}
				}
				return isSorted;
		}
	}
}
					
		
			
			
					
				 
				
			
		
			
			
		
		
		
