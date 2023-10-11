package programmers.part1;

public class Solution3 {
	/*
	 * 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
	 */

	public String[] solution3(String[] quiz) {
		String[] answer = new String[quiz.length];
		int i = 0;
		
		for (String q : quiz) {
			String[] qAarray = q.split(" ");
			String math = "";
			int bAns = 0;
			String result = "";
			for (String num : qAarray) {
				if (num.equals("+")) {
					math = "+";
				} else if (num.equals("-")) {
					math = "-";
				} else if (num.equals("=")) { // "="
					math = "=";
				} else { // "number"
					if (math.equals("=")) {
						result = (bAns == Integer.parseInt(num) ? "O" : "X");
					} else if (math.equals("-")) {
						bAns -= Integer.parseInt(num);
					} else { // "+" or "num"
						bAns += Integer.parseInt(num);
					}

				}
			}
			answer[i] = result;
			i++;
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(new Solution3().solution3(new String[] { "3 - 4 = -3", "5 + 6 = 11"}));
	}

}
