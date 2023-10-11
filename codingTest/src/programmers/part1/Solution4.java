package programmers.part1;

public class Solution4 {
	/*
	 * 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
	 */

	public int solution4(String my_string) {
        int answer = 0;
        String num = "";
        my_string = my_string + "a";
        
        for(char c : my_string.toCharArray()) { // 항상된 for문 사용시 메모리 별도 필요 // if.charAt(i) 사용 시 코드의 길이가 길어지고 불편
            int cNum = Character.getNumericValue(c);
            
			if (0 <= cNum && cNum <= 9) {
				num += c;
			} else {
				if(!num.equals("")) answer += Integer.parseInt(num);
				num = "";
			}
			
		}
        
        return answer;
	}

	public static void main(String[] args) {
		System.out.println(new Solution4().solution4("1a2b3c4d123Z17"));
	}

}
