package pattern.singletonPattern;

/**
 * Eager initialization,static block 방법은 클래스가 로딩될때 인스턴스 생성하기 때문에 프로그램이 커지만 부담이 될수 있다.
 * Lazy 초기화는 인스턴스를 사용하는 시점에 사용한다.
 * 만약 멀티 쓰레드 방식이라서 getinstance()를 두번 호출하게 되면 두번 생성 될수 있다.
 */
public class LazyInitialization {

	private static LazyInitialization instance;
	private LazyInitialization(){};

	public static LazyInitialization getInstance(){
		if (instance == null)
			instance = new LazyInitialization();
		return instance;
	}
}
