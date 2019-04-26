package pattern.singletonPattern;

/**
 *
 * 가장 기본적인 singleton pattern
 * new EagerInitialization () 될때 어떠한 예외처리도 할 수 없다는것이 단점
 */
public class EagerInitialzation {

	//private 으로 선언하여 외부에서 접근 불가
	//static 으로 인스턴스화 없이 사용 가능함
	private static EagerInitialzation instance = new EagerInitialzation();

	// private 으로 생성자 선언하여 new 키워드로 인스턴스 생성 불가능
	private EagerInitialzation(){
		System.out.println("call EagerInitialzation constructor");
	}

	//instance의 직접 접근도 불가능하고 생성자도 불가능하기 때문에 getInstance() 로 만 인스턴스 가질수있음
	public static EagerInitialzation getInstance(){
		return instance;
	}
}
