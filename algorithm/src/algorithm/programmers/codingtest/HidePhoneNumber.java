package algorithm.programmers.codingtest;

public class HidePhoneNumber {

	public String solution(String phoneNumber) {

		int len = phoneNumber.length() - 4;

		return new StringBuilder(phoneNumber).replace(0, len, "*".repeat(len)).toString();
	}
}
