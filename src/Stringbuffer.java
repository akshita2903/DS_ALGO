/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Stringbuffer {
	public static void main (String[] args) {
// 		System.out.println("GfG!");n
StringBuffer sb=new StringBuffer();
sb.append("Properties :");
sb.append("1. Mutable");
sb.append(" 2. Thread Safe");
String res=sb.toString();
// System.out.println(res);
StringBuffer sb2=new StringBuffer("Parameterized");
sb2.insert(3,"are wah"); ///o/p-> Parare wahameterized
System.out.println(sb2.toString());
}
}
