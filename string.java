public class String {
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("world");
		String message = sb.toString();
		System.out.println(message);
	}
}

//Naive Pattern Searching algorithm: 

       public class HelloWorld{
 
    static void search(String pat, String txt)
    {
        int l1 = pat.length();
        int l2 = txt.length();
        int i = 0, j = l2 - 1;
 
        for (i = 0, j = l2 - 1; j < l1;) {
 
            if (txt.equals(pat.substring(i, j + 1))) {
                System.out.println("Pattern found at index "
                                   + i);
            }
            i++;
            j++;
        }
    }
     
      // Driver's code
    public static void main(String args[])
    {
        String pat = "AABAACAADAABAAABAA";
        String txt = "AABA";
     
          // Function call
        search(pat, txt);
    }
}


//String split
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sArr = s.split("");
        for(int i=0;i<sArr.length;i++){
            System.out.print(sArr[i]+" ");
        }
    }
}


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EliminateRepeatedLetters {
    
    public static String eliminateRepeatedLetters(String word) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (char ch : word.toCharArray()) {
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        String result = eliminateRepeatedLetters(word);
        System.out.println("Word after eliminating repeated letters: " + result);
        
        scanner.close();
    }
}


//Error is there ,will debug it later
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        for(int i=0;i<n;i++){
            arr[i]=str.charAt(i);
        }
        char[] arr2 = new char[n];
         for(int i=0;i<n;i++){
            arr2[i]=str2.charAt(i);
        }
        
        //matching characters:
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr2[j]){
                    System.out.println(arr[i]);
                }else continue;
            }
        }
    }
}



public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString() to provide a custom string representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println(person.toString()); // Output: Person{name='John', age=30}
    }
}




* * StringTokenizer * *

import java.util.StringTokenizer;  
public class Simple{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is khan"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  
Output:

my
name
is
khan

import java.util.*;  
  
public class Test {  
   public static void main(String[] args) {  
       StringTokenizer st = new StringTokenizer("my,name,is,khan");  
        
      // printing next token  
      System.out.println("Next token is : " + st.nextToken(","));  
   }      
}  

