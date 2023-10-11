package programmers;

public class Solution1 {

	public int solution1(String[] babbling) {
		int answer = 0;
		String[] string = new String[] { "aya", "ye", "woo", "ma" };

		for (String b : babbling) {
			String babb = "";
			for (char  c : b.toCharArray()) {
				babb += c;
				System.out.println(babb);
				for (String s : string) {
					if (babb.equals(s)) {
						babb = "";
					}
				}
			}
			if (babb.isEmpty()) ++answer;
		}

		return answer;

	}

	public static void main(String[] args) {
		System.out.println(new Solution1().solution1(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
	}

}
