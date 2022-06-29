package io.zipcoder;
import javax.swing.text.StyledEditorKit;
import java.util.Arrays;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {              // added .split method to String input
        int count = 0;                                  // which returns a string of arrays,
        String wordArray[] = input.split(" ");   //make sure you put a space to actually split it!!!!
        for (String index : wordArray) { //iterates over wordArray and stores it into String index.
            if (index.endsWith("y") || index.endsWith("z")) {
                count += 1;
            }
        }
        return count;
    }

//wordArray[i].charAt(wordArray[i].length()-1)=="y") || wordArray[i].charAt(wordArray[i].length()-1) =="z");

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String store = new StringBuilder().append(remove).toString();  //making a string and adding String remove to string
        return base.replace(store, ""); //replacing store with "" (no space in between quotes)
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        Boolean resultCount;
        int countIs = (input.split("is", -1).length); //.split into array
        int countNot = (input.split("not",-1).length);//non-positive limit splits as many times as it can
        resultCount = countIs == countNot;
        return resultCount;
    }



//        int countIs = 0;
//        int countNot = 0;
//        for (int i = 0; i < input.length() -1; i++) {
//            if (input.charAt(i) = 'i'&& input.charAt(i + 1) = 's') {
//                countIs++;
//            }
//            if (input.charAt(i) == 'n' && input.charAt(i + 1) = 'o' && input.charAt(i + 2) = 't') {
//                countNot++;
//            }
//        }
//        return countIs == countNot;
//
    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */

    public Boolean gIsHappy(String input) {
        boolean ghappy = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'g') {
                if (input.charAt(i-1)== 'g' || input.charAt(i+1) == 'g') {
                    ghappy = true;
                }else { ghappy = false;
                }
            }
    }
        return ghappy;
}


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int triple=0;
        for(int i=0; i<input.length()-1; i++){ // had to add -1 to .length because you can't access a
                                                // nonexistent index at .length
            if(input.charAt(i) == input.charAt(i+1) && input.charAt(i) == input.charAt(i+2)){
                triple += 1;
            }
        }
        return triple;
    }

}
//    public Integer countTriple(String input){
//        int triple = 0;
//        for (int i = 0; i < input.length() - 1; i++){
//            if (input.charAt(i)==input.charAt((i+1)==input.charAt(i+2))){
//                triple ++;
//            }
//        }
//        return triple;
//    }
//}
