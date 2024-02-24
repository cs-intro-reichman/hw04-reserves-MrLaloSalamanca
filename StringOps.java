public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
       String newOne ="";
		for (int i = 0; i< string.length(); i++) {
			
			char ch = string.charAt(i);
			if (ch > 64 && ch < 123) {
				
				if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					ch = (char) (ch - 32);
					newOne = newOne + ch;
					
				} else {
					
					if ( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
						newOne = newOne + ch;
						
					} else {
						
						if ( ch > 64 && ch < 91) {
							ch = (char) (ch + 32);
							newOne = newOne + ch;
						
						} else {
							
							newOne = newOne + ch;
						}
					}
				}
				
			} else {
				
				newOne = newOne + ch;
			}
		}
		return newOne;
											
		
    }

    public static String camelCase (String string) {
       
		String camelCase ="";
		int i = 0;
		
		while (string.charAt(i) == ' ') {
			i ++; 
			}
		
			
		if (string.charAt(i) < 91) {
			char ch = (char) (string.charAt(i) + 32);
			camelCase += ch;
			i++;
			
		} else {
				char ch = string.charAt(i); 
				camelCase += ch;
				i++;
			}
			
		
		while ( i < string.length() ) {
			
			if (string.charAt(i) == ' ') {
				i++;
				
			} else {
				
				if(string.charAt(i-1) == ' ') {
				
					if (string.charAt(i) > 96) {
						char ch = (char) (string.charAt(i) - 32);
						camelCase += ch;
						i++;
						
					} else {
						char ch = string.charAt(i);
						camelCase += ch;
						i++;
					}
							
				} else {
					
					if (string.charAt(i) < 91) {
						char ch = (char) (string.charAt(i) + 32);
						camelCase += ch;
						i++;
						
					} else {
						
						char ch = string.charAt(i);
						camelCase += ch;
						i++;
					}
				}
			}
		}
		return camelCase;
	}
					


    public static int[] allIndexOf (String string, char chr) {
        
		int [] lng = new int [string.length()];
		int count = 0;
		int loc = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == chr) {
				lng [count] = i;
				count ++;
			}
		}
		
		int [] result = new int [count];
	
		for ( int j = 0; j < result.length; j++) {
			result[j] = lng[j];
		}
		
		return result;
		
    }
	
}
