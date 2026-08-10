🔹 1. Length & Basic Info
length()
String s = "Hello";
System.out.println(s.length());  // 5
isEmpty()
String s = "";
System.out.println(s.isEmpty());  // true
isBlank() (Java 11+)
String s = "   ";
System.out.println(s.isBlank());  // true
🔹 2. Character Access
charAt(int index)
String s = "Hello";
System.out.println(s.charAt(1));  // e
codePointAt(int index)
String s = "A";
System.out.println(s.codePointAt(0));  // 65
🔹 3. Comparison
equals()
String a = "hi";
String b = "hi";
System.out.println(a.equals(b));  // true
equalsIgnoreCase()
System.out.println("HELLO".equalsIgnoreCase("hello"));  // true
compareTo()
System.out.println("abc".compareTo("abd"));  // negative value
🔹 4. Searching
contains()
System.out.println("hello".contains("ell"));  // true
indexOf()
System.out.println("hello".indexOf("l"));  // 2
lastIndexOf()
System.out.println("hello".lastIndexOf("l"));  // 3
startsWith()
System.out.println("hello".startsWith("he"));  // true
endsWith()
System.out.println("hello".endsWith("lo"));  // true
🔹 5. Substrings
substring(int begin)
System.out.println("hello".substring(2));  // llo
substring(int begin, int end)
System.out.println("hello".substring(1, 4));  // ell
🔹 6. Modification (Returns New String)
toUpperCase()
System.out.println("hello".toUpperCase());  // HELLO
toLowerCase()
System.out.println("HELLO".toLowerCase());  // hello
trim()
System.out.println("  hi  ".trim());  // "hi"
strip() (Java 11+)
System.out.println("  hi  ".strip());
replace()
System.out.println("hello".replace('l', 'x'));  // hexxo
replaceAll() (regex)
System.out.println("a1b2".replaceAll("\\d", ""));  // ab
🔹 7. Splitting & Joining
split()
String s = "a,b,c";
String[] arr = s.split(",");
join()
String result = String.join("-", "a", "b", "c");
System.out.println(result);  // a-b-c
🔹 8. Conversion
toCharArray()
char[] arr = "hello".toCharArray();
getBytes()
byte[] b = "hello".getBytes();
🔹 9. Checking Content
matches()
System.out.println("123".matches("\\d+"));  // true
contentEquals()
System.out.println("abc".contentEquals("abc"));  // true
🔹 10. Concatenation
concat()
System.out.println("Hello".concat(" World"));  // Hello World
🔹 11. Value Conversion
valueOf()
int x = 10;
String s = String.valueOf(x);
🔹 12. Repeat (Java 11+)
repeat()
System.out.println("ha".repeat(3));  // hahaha
🔹 13. Interning
intern()
String s1 = new String("hello");
String s2 = s1.intern();
🔹 Important Note
Strings in Java are immutable → methods don’t change original string, they return new one.