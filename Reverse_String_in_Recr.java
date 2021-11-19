package geekster;

public class Reverse_String_in_Recr {
	
	public static void main(String []args) {
		String str="chirag";
		int len=str.length()-1;
		reverse(str, len);
	}
	
	static void reverse(String str, int len) {
		if(str==null || str.length()<=1) {
			System.out.println(str);
		}
		else {
			if(len<0) {
				return;
			}System.out.print(str.charAt(len));
			len--;
			reverse(str, len--);
		}
	}

}
