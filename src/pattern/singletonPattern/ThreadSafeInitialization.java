package pattern.singletonPattern;

/**
 * sychronized 블록으로 인해, 수 많은 쓰레드 들이 인스턴스 호출하게 되면 높은 cost 비용으로 인해 프로그램 전반에 성능저하가 일어난다.
 *
 */
public class ThreadSafeInitialization {
	private static ThreadSafeInitialization instance;
	private ThreadSafeInitialization(){}

	//여러 thread 들이 동시에 접근해서 인스턴스를 생성시키는 위험은 없어짐!
	public static synchronized ThreadSafeInitialization getInstance(){
		if (instance==null)
			instance = new ThreadSafeInitialization();
		return instance;
	}
}
