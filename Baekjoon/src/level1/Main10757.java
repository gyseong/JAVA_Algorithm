package level1;

import java.util.*;
import java.io.*;
import java.math.*;

public class Main10757 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		BigInteger big = new BigInteger(st.nextToken());
		BigInteger big1 = new BigInteger(st.nextToken());
		System.out.println(big.add(big1));
	}

}
