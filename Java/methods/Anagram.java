package Getting.Started.With.Java.methods;

import java.util.Arrays;

public class Anagram
{
  public static int checkAnagram(String str1, String str2)
  {
    int num = 0;
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    // if(str1.length != str2.length){
    //   return num;
    // }
      char[] arr1 = str1.toCharArray();
      char[] arr2 = str2.toCharArray();
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      String sortedStr1 = new String(arr1); 
        String sortedStr2 = new String(arr2); 
      if(sortedStr1.equals(sortedStr2)){
        num = 1;
        return num;
      }
      else{
        num=-1;
    return num;
      }
  }
}