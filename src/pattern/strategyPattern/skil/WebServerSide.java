package pattern.strategyPattern.skil;

//웹 서버 사이드 스킬
public class WebServerSide implements ServerSide {
	@Override
	public String getServerProgramming() {
		return "Java";
	}
}
