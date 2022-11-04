package algorithm.programmers.codingtest;

public class RecommendANewID {

	public static String solution1(String newId) {

		// 1단계
		newId = newId.toLowerCase();

		// 2단계
		StringBuilder sb = new StringBuilder();

		for(char c : newId.toCharArray()) {

			if(String.valueOf(c).matches("[a-z0-9-_.]")) {
				sb.append(c);
			}
		}
		newId = sb.toString();


		// 3단계
		newId = newId.replaceAll("[.]+", ".");


		// 4단계

		if(newId.length() > 0 && newId.charAt(0) == '.') {
			newId = newId.substring(1);
		}

		if(newId.length() > 0 && newId.charAt(newId.length()-1) == '.') {
			newId = newId.substring(0, newId.length()-1);
		}



		// 5단계
		if(newId.equals("")) {
			newId = "a";
		}


		// 6단계

		System.out.println(newId);
		if(newId.length() >= 16) {
			newId = newId.substring(0, 15);
			newId = newId.charAt(14) == '.' ? newId.substring(0, 14) : newId; 
		}

		System.out.println(newId);

		// 7단계
		if(newId.length() <= 2) {
			int len = newId.length();
			sb = new StringBuilder(newId);
			for(int i=len; i<3; i++) {
				sb.append(sb.charAt(len-1));
			}

			newId = sb.toString();
		}

		return newId;
	}

	public String solution(String new_id) {

        String s = new KAKAOID(new_id)
                .replaceToLowerCase()
                .filter()
                .toSingleDot()
                .noStartEndDot()
                .noBlank()
                .noGreaterThan16()
                .noLessThan2()
                .getResult();

        return s;
    }
	
	private static class KAKAOID {
		private String s;

		KAKAOID(String s) {
			this.s = s;
		}

		private KAKAOID replaceToLowerCase() {
			s = s.toLowerCase();
			return this;
		}

		private KAKAOID filter() {
			s = s.replaceAll("[^a-z0-9._-]", "");
			return this;
		}

		private KAKAOID toSingleDot() {
			s = s.replaceAll("[.]{2,}", ".");
			return this;
		}
		
		private KAKAOID noStartEndDot() {
			s = s.replaceAll("^[.]|[.]$", "");
			return this;
		}

		private KAKAOID noBlank() {
			s = s.isEmpty() ? "a" : s;
			return this;
		}

		private KAKAOID noGreaterThan16() {
			if (s.length() >= 16) {
				s = s.substring(0, 15);
			}
			s = s.replaceAll("[.]$", "");
			return this;
		}

		private KAKAOID noLessThan2() {
			StringBuilder sBuilder = new StringBuilder(s);
			while (sBuilder.length() <= 2) {
				sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
			}
			s = sBuilder.toString();
			return this;
		}

		private String getResult() {
			return s;
		}
	}
}
