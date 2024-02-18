class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // if(letters[letters.length-1]<target || target< letters[0]){
        //     return letters[0];
        // }
        for(char c:letters){
            if(target<c){
                return c;  
            }
        }
        return letters[0];
    }
}