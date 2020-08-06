package katachallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateChar {

	private static final String IllegalArgumentException = "";

	public static void main(String[] args) throws Exception {
		System.out.println(removeDuplicatesV3("hello world!"));

	}
	
	 public static String removeDuplicatesV1(String str) throws Exception {
	        if (str == null || str.isEmpty()) {
	            return "";
	        }

	        char[] chArray = str.toCharArray();
	        StringBuilder sb = new StringBuilder();

	        for (char ch : chArray) {
	            if (sb.indexOf(String.valueOf(ch)) == -1) {
	                sb.append(ch);
	            }
	        }

	        return sb.toString();
	    }
	 
	 public static String removeDuplicatesV2(String str) {

	        if (str == null || str.isEmpty()) {
	            // or throw IllegalArgumentException
	            return "";
	        }

	        char[] chArray = str.toCharArray();
	        StringBuilder sb = new StringBuilder();
	        Set<Character> chHashSet = new HashSet<>();
	        
	        for (char c : chArray) {
	            if (chHashSet.add(c)) {
	            	System.out.println(chHashSet.toString());
	                sb.append(c);
	                //System.out.println(sb);
	            }

	        }
	        return sb.toString();
	    }
	 
	    public static String removeDuplicatesV3(String str) {

//	        if (str == null || str.isEmpty()) {
//	            // or throw IllegalArgumentException
//	            return "";
//	        }
	        
	        return Arrays.asList(str.split("")).stream().distinct().collect(Collectors.joining());
//	                .distinct()
//	                .collect(Collectors.joining());
	    }
	}




//    
//
//   
//
    
//

