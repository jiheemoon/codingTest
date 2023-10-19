package programmers.part1;

public class Solution7 {
	/**
	 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
	 * @param n
	 * @return
	 */

    public int solution7(int n) {
        int answer = 0;
        
        //정수 나눗셈
		while (n > 0) {
			answer += n % 10; // 10으로 나누어 나머지 더하기
			n /= 10;
		}
        
        //문자열로 변환하여 계산
//        String ans = Integer.toString(n);
//        for(char c : ans.toCharArray()){
//        	answer+=Character.getNumericValue(c);
//        }
        
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(new Solution7().solution7(12345));
	}

}
