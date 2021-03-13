import java.util.*;
public class Main {
    public static void main(String args[]) {
    //   An array of characters works same as Java string.
        char []arr={'p','a','n','k','a','j'};
        String str=new String(arr);
        String s="pankaj kumar";
        String s2="pankaj";
        System.out.println(str); // pankaj
    //1. toCharArray() converts the string into character array
        char []arr1=s2.toCharArray(); // arr1={'p','a','n','k','a','j'}
    //2. char charAt(int index)
        System.out.println(s.charAt(3));  // k
    //3. int length()
        System.out.println(s.length());  // 12
    //4. String substring(int beginIndex)
        System.out.println(s.substring(7));  // kumar 
    //   String substring(int beginIndex, int endIndex)
        System.out.println(s.substring(0,4));  // pank
    //5. String concat(String str)
        System.out.println(s.concat(" yadav"));  // pankaj kumar yadav
        System.out.println(s);//Strings are immutable it prints pankaj kumar
    //6. int indexOf(String substring)
        System.out.println(s.indexOf("kaj"));  // 3
        System.out.println(s.indexOf("KAJ"));  // -1
    //   int indexOf(String substring, int fromIndex)
        System.out.println(s.indexOf("kaj",1)); // 3
    //7. boolean equals(Object another)
        System.out.println(s.equals(s2));  // false
    //8. boolean isEmpty()
        System.out.println(s.isEmpty());  // false
    //9. String replace(char old, char new)
        System.out.println(s.replace("pankaj","PANKAJ"));  // PANKAJ kumar
        System.out.println(s);  // pankaj kumar again due to immutable
    //10. boolean startsWith(String str)
        System.out.println(s.startsWith("pan"));  // true
    //11. String toUpperCase(),String toLowerCase()
        System.out.println(s.toUpperCase()); // PANKAJ KUMAR only returns a string in uppercase not changes strings value 
    // 12. 	String[] split(String regex)
        String s3="abc def ghi, jkl";
        String []split=s3.split(" ");
        for(String val:split){
            System.out.println(val);
        }
    //13. String trim() removes beginning and ending spaces of this string.
       String s4="    pankaj    ";
       s4=s4.trim();
       System.out.println(s4);//pankaj

    }
}