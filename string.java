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


//taking input of string array with undefined size.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of the array separated by spaces:");
        String inputLine = scanner.nextLine();

        // Split the input line into individual strings
        String[] array = inputLine.split("\\s+");

        // Print the array
        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }

        scanner.close();
    }


String methods :
1. charAt(); 

String str = "Hello";
char ch = str.charAt(1); // ch will be 'e'


2. compareTo();

String str1 = "apple";
String str2 = "banana";
int comparison = str1.compareTo(str2); // comparison will be a negative integer


3. concat();

String str1 = "Hello";
String str2 = "World";
String concatenatedStr = str1.concat(" ").concat(str2); // concatenatedStr will be "Hello World"


4. contains();

String str = "Hello, World!";
boolean containsComma = str.contains(","); // containsComma will be true
+


5. endsWith();

String str = "Hello, World!";
boolean endsWithWorld = str.endsWith("World!"); // endsWithWorld will be true


6. equals();

String str1 = "hello";
String str2 = "hello";
boolean isEqual = str1.equals(str2); // isEqual will be true

7. equalsIgnoreCase();

String str1 = "hello";
String str2 = "Hello";
boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // isEqualIgnoreCase will be true


8. format();

String formattedStr = String.format("The value of pi is %.2f", Math.PI); // formattedStr will be "The value of pi is 3.14"


9. getBytes();

String str = "Hello";
byte[] byteArray = str.getBytes(); // byteArray will contain the byte representation of "Hello"


10. getChars();

String str = "Hello";
char[] charArray = new char[5];
str.getChars(0, 5, charArray, 0); // Copies "Hello" into charArray



11. indexOf();

String str = "Hello";
int index = str.indexOf('e'); // index will be 1


12. intern();

String str1 = new String("Hello");
String str2 = str1.intern(); // str2 will refer to the interned string "Hello"


13. isEmpty();

String str = "";
boolean isEmpty = str.isEmpty(); // isEmpty will be true


14. join();

String result = String.join("-", "apple", "orange", "banana"); // result will be "apple-orange-banana"


15. lastIndexOf();
 
String str = "Hello, World!";
int lastIndex = str.lastIndexOf('l'); // lastIndex will be 10

16. length();

String str = "Hello";
int length = str.length(); // length will be 5


17. replace();

String str = "Hello, World!";
String replacedStr = str.replace('o', 'x'); // replacedStr will be "Hellx, Wxrld!"


18. replaceAll();

String str = "Hello, World!";
String replacedStr = str.replaceAll("[aeiou]", "*"); // replacedStr will be "H*ll*, W*rld!"


19.  split();

String str = "apple,orange,banana";
String[] parts = str.split(","); // parts will be {"apple", "orange", "banana"}


20. startsWith();

String str = "Hello, World!";
boolean startsWithHello = str.startsWith("Hello"); // startsWithHello will be true


21. substring();

String str = "Hello, World!";
String substr = str.substring(7); // substr will be "World!"

//another way: 

String str = "Hello, World!";
String substr = str.substring(0, 5); // substr will be "Hello"

22. toCharArray();

String str = "Hello";
char[] charArray = str.toCharArray(); // charArray will be {'H', 'e', 'l', 'l', 'o'}


23. trim();

String str = "   Hello   ";
String trimmedStr = str.trim(); // trimmedStr will be "Hello"


24. valueOf();

int num = 123;
String str = String.valueOf(num); // str will be "123"




