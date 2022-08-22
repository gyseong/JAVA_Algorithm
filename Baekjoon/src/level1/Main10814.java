package level1;

import java.util.*;
import java.io.*;

public class Main10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		Student[] s = new Student[a];
		
		for(int i=0;i<a;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			s[i] = new Student(age, name);
		}
		Arrays.sort(s, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.age- o2.age;
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<a;i++) {
			sb.append(s[i]);
		}
		System.out.println(sb);
	}
	public static class Student{
		int age;
		String name;
		
		public Student(int age, String name){
			this.age = age;
			this.name = name;
		}
		
		public String toString() {
			return age +" "+name+"\n";
		}
	}
}
