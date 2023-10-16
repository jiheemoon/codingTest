package programmers.part1;

public class Solution6 {
	/**
	 * 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
	 * @param A
	 * @param B
	 * @return
	 */

    public int solution6(String A, String B) {
        int answer = 0;
        String copy = A;

        for(int i=0; i < A.length(); i++) {	//ArrayList와 Array는 For문, LinnkedList는 For-each문을 사용
    		
            if(copy.equals(B)) return answer;
            
            String sub = copy.substring(A.length()-1);
            copy = sub+copy.substring(0,A.length()-1);
            
            ++answer;
        }

        return -1;
    }

	public static void main(String[] args) {
		System.out.println(new Solution6().solution6("hello","ohell"));
	}

}
