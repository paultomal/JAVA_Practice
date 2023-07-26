public class StringUtils{
   public static int countVowels(String str) {
       int count = 0;
       char[] r = str.toCharArray();//eikhne all charcter array akarre already store ache
       for(char c : r ){
           if(c == 'a' || c == 'e'||  c ==  'i'||  c== 'o' || c== 'u'){
               count++;
           }

       }

       return count;
    }
}
