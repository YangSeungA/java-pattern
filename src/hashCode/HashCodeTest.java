package hashCode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeTest {
	public static void main(String[] args) {
		Member m1 = new Member("yang");
		Member m2 = new Member("yang");

		System.out.println(m1.equals(m2));

		Map<Member,Integer> map = new HashMap<Member,Integer>();
		map.put(m1,1);
		map.put(m2,1);
		System.out.println(map.size()); //2 hash 를 사용한 컬렉션등은 key 를 사용할때 hashcode 를 사용하기때문에 2 결과가 나옴 (즉 각각 다른 hashcode)

	}
}
