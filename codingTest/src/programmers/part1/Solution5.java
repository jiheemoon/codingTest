package programmers.part1;

class Solution5 {
	/**
	 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
	 * @param my_string
	 * @param num1
	 * @param num2
	 * @return
	 */
	
    public String solution5(String my_string, int num1, int num2) {
        String s1 = my_string.substring(num1, num1+1);
        String s2 = my_string.substring(num2, num2+1);
        
        my_string = my_string.substring(0,num1)+s2+my_string.substring(num1+1);
        my_string = my_string.substring(0,num2)+s1+my_string.substring(num2+1);
        return my_string;
    }

	public static void main(String[] args) {
		System.out.println(new Solution5().solution5("I love you", 3, 6));
	}
    
}