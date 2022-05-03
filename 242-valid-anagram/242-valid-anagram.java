class Solution {
    public boolean isAnagram(String s, String t) {
        String ss[] = s.split("");
		String tt[] = t.split("");
		Arrays.sort(ss);
		Arrays.sort(tt);
		String sss = "",ttt = "";
		for(String e:ss) sss+=e;
		for(String e:tt) ttt+=e;
		return sss.equals(ttt);
    }
}