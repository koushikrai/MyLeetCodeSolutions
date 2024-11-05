public class Solution {
    public int minChanges(String s) {
        int c = 0; //c is used to count the changes required
        for (int i = 0; i < s.length() - 1; i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                c++;
            }
        }
        return c;
    }
}
