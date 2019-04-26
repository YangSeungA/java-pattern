package pattern.singletonPattern;

/**
 *
 * Static block initialization
 * logic을 담을수 있기 때문에 복잡한 초기변수 셋팅이나 위와 같이 에러처리를 위한 구문을 담을수 있다.
 */
public class StaticBlockInitialization {

	private static StaticBlockInitialization instance;

	private StaticBlockInitialization (){ }
	// static 으로 정의하여 초기화 블럭을 이용하여 클래스가 로딩될때 최초 한번 실행하게 됨.
	static {
		try {
			System.out.println("instance create...");
			instance = new StaticBlockInitialization();
		}catch (Exception e){
			throw new RuntimeException("Exception creating StaticBlockinitalation instace.....");
		}
	}

	public static StaticBlockInitialization getInstance(){
		return instance;
	}
}
