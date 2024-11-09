class Solution{
    public long minEnd(int n, int x) {
	String str = Integer.toBinaryString(x);
	String strn = Integer.toBinaryString(n-1);

	int i=str.length()-1, j=strn.length()-1;
	long res = 0, curr=1;

	while(i >= 0 && j>=0) {
		char c1 = str.charAt(i--);
		char c2 = strn.charAt(j);
		if(c1 == '1') {
			res += curr;
		} else {
			if(c2 == '1') {
				res += curr;
			}
			j--;
		}
		curr += curr;
	}

	while(i >= 0) {
		char c = str.charAt(i--);
		if(c == '1') {
			res += curr;
		}
		curr += curr;
	}

	while(j >= 0) {
		char c = strn.charAt(j--);
		if(c == '1') {
			res += curr;
		}
		curr += curr;
	}

	return res;
}
}
