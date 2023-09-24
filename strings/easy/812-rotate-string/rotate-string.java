class Solution {
    public boolean rotateString(String s, String goal) {
        boolean flag = s.length() == goal.length() ? (s+s).contains(goal) : false;
        return flag;
    }
}