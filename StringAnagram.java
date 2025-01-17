package Practice11;
import java.util.Scanner;
import java.util.Arrays;
class Operations{
	char[] convertToarrray(String s) {
		char arr[] = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i] = s.charAt(i);
		}
		return arr;
	}
	public boolean checkequality(char[] arr1,char[] arr2) {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
}

public class StringAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String s1=sc.next();
		System.out.println("Enter the first string : ");
		String s2=sc.next();
		if(s1.length()==s2.length()) {
			Operations op= new Operations();
			char[] arr1 = op.convertToarrray(s1);
			char[] arr2 = op.convertToarrray(s1);
			Arrays.sort(arr1);
			Arrays.sort(arr2); 
			boolean res = op.checkequality(arr1, arr2);
			if(res==true) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}
		}
		else {
			System.out.println("not anagram");
		}
		

	}

}