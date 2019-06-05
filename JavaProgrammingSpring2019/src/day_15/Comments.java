package day_15;

public class Comments {
public static void main(String[] args) {
	
//	
//	03/23/2019
//	----------
//
//	Java Day 15.
//	-----------
//
//	String manipulation.
//	repl.it assignments ==> practice
//	================================
//	package day15_string_manipulation
//	Warm up task:
//	Emoji shortcuts:
//
//	:) ==> smile
//	:( ==> sad
//	:/ ==> upset
//	:p ==> playful
//
//	;) ==> wink
//	;0 ==> surprised
//
//	(: ==> smile
//	): ==> sad
//	======================
//	:#
//	PsuedoCode:
//	- check first char:
//	:
//	check second character:
//	) ==> smile
//	( ==> sad
//	/ ==> upset
//	p ==> playful
//
//	;
//
//	(
//
//	)
//	=======================
//
//	Negative:
//	if not 2 characters:
//	"Invalid emoji"
//	stop the code ==> return
//
//	==============================================
//
//	STRING MANIPULATION
//	===================
//
//	STARTSWITH - ENDSWITH
//
//	String word = "java";
//
//	word.startsWith("j") ==> true
//	word.endsWith("a") ==> true
//
//	word.startsWith("ja") ==> true
//	word.endsWith("va") ==> true
//
//	word.startsWith("dj") ==> false
//	word.startsWith("jv") ==> false
//
//	When 100% match for whole word, it will be true.
//	======================
//
//	CONTAINS ==> checks if some string is in the string value.
//	We use this method when it is not important the position of a character. as long as it contains, returns true.
//
//	String word = "Bananas";
//
//	word.contains("a") => true
//	word.startsWith("a") => false
//
//	word.contains("B") => true
//	==========================
//
//	String log = "15.02.2019 16:56:15 WARNING SignInPage:51 - Loging with email jalaxzczxf@drupal.org and password wewrfsd
//	15.02.2019 16:56:15 ERROR SignInPage:51 - Loging with email jalaxzczxf@drupal.org and password wewrfsd
//	15.02.2019 16:56:15 PASS SignInPage:51 - Loging with email jalaxzczxf@drupal.org and password wewrfsd
//	15.02.2019 16:56:15 FATAL SignInPage:51 - Loging with email jalaxzczxf@drupal.org and password wewrfsd"
//
//	if(log.contains("ERROR")) {
//	//AUTOMATICALLY INFORM DEVELOPERS
//	}else{
//	// :)
//	}
//	========================
//
//	INDEX OF
//	========
//	Looks for a character or string within the string and returns the first position if found.
//	returns -1 it is not found.
//	0123
//	String str ="java";
//
//	str.indexOf("j") ==> 0
//	str.indexOf("v") ==> 2
//	str.indexOf("a") ==> 1
//
//	str.charAt(0) ==> 'j' (43)
//
//	println(str.charAt(0) +""+ str.charAt(1) )
//
//	WHEN STRING/CHAR FOUND: returns 0 or larger number
//	WHEN NOT FOUND: returns -1 
//	===========================================
//
//	String methods:
//	- equals
//	- equalsIgnoreCase
//	- toUpperCase
//	- toLowerCase
//	- charAt
//	- length
//	- startsWith
//	- endsWith
//	- contains
//	- indexOf
//	- lastIndexOf
//	- indexOf from certain position
//	- subString
//	- replace
//
//	===================
//
//	indexOf("value")
//	indexOf("value", fromPosition)
//
//	String word = "java";
//
//	word.indexOf("a") ==> 1
//	word.indexOf("a", 2) ==> 3 (start search at index 2)
//
//	lastIndexOf ==> can be used when we search for last position of the character/string.
//	=====================================
//
//	String word = "java";
//
//	find second 'a'
//
//	- first the first a
//	- use that index to find the second one
//
//	String word = "java";
//	int first = word.indexOf("a");
//	int second = word.indexOf("a",first+1);
//
//	int second = word.indexOf("a",word.indexOf("a")+1)
//	====================================
//
//	SUBSTRING ==> Returns part of the string.
//
//	String sentence = "Java String manipulation is fun!";
//
//	sentence.subString(0,4) ==> Java
}
}
