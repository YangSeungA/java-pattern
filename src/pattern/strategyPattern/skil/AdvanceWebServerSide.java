package pattern.strategyPattern.skil;

//고급 웹 서버 사이드 스킬
public class AdvanceWebServerSide implements ServerSide {
	@Override
	public String getServerProgramming() {
		return "java,C,python";
	}
}
