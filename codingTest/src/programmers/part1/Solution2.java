package programmers.part1;

public class Solution2 {
	/**
	 * my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
	 * @param my_string
	 * @return
	 */

	public int solution2(String my_string) {
		int answer = 0;
		String math = "";
		String[] sArray = my_string.split(" ");
		
		for (String s : sArray) {
			if (s.equals("+")) {
				math = "+";
			} else if (s.equals("-")) {
				math = "-";
			} else {
				if (math.equals("+"))
					answer += Integer.parseInt(s);
				else if (math.equals("-"))
					answer -= Integer.parseInt(s);
				else
					answer += Integer.parseInt(s);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(new Solution2().solution2("3 + 5 - 10"));
	}

}
