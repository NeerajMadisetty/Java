import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
			
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(1);
		list.add(3);
		
		Integer[] array = new Integer[1];
	    array = list.toArray(array);
	    
	    int[] p_array = list.stream().mapToInt(i->i).toArray();
	    
	    System.out.println(Arrays.toString(p_array));

	}

}
