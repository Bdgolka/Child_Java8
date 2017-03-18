package com.bdgolka.lambda;

public class LambdaArgumentDemo {

	static String changeStr(StringFanc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		
		String inStr = "Lambda expressions extend java";
		String outStr;
		
		System.out.println("Income string: " + inStr);
		
		//Lambda determined strings in reverse direction
		StringFanc reverce = (str)->{
			String result = "";
			for(int i = str.length()-1; i >=0; i--)
				result += str.charAt(i);
			
			return result;
		};
		
		outStr = changeStr(reverce, inStr);
		System.out.println("Reverce string : " + outStr);
		
		//This lambda expression replace white spaces with dashes
		outStr = changeStr((str)-> str.replace(" ","-"), inStr);
		System.out.println("String with replace white spaces: " + outStr);

		//Replaces the case of letters
		outStr = changeStr((str)->{
			String result = "";
			char ch;
			
			for (int i=0; i<str.length(); i++){
				ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				result += Character.toLowerCase(ch);
			else
				result += Character.toUpperCase(ch);
			}
			
			return result;
		}, inStr);
		
		
		System.out.println("String with replaced leter case : " + outStr);

		
	}

}

