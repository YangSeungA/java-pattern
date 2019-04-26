package pattern.strategyPattern.programmer;

import pattern.strategyPattern.skil.AdvanceWebClientSide;
import pattern.strategyPattern.skil.ClientSide;
import pattern.strategyPattern.skil.ServerSide;
import pattern.strategyPattern.skil.WebServerSide;

public class AmatureProgrammer extends Programmer {

	// 아마추어프로그래머는 클라이언트는 잘알고있지만 서버는 평범
	public AmatureProgrammer(){
		ClientSide cs = new AdvanceWebClientSide();
		ServerSide ss = new WebServerSide();
		setClient(cs);
		setServer(ss);
	}

	@Override
	public String getAllSkill() {
		String display = getClientProgramming() +","+getServerProgramming();
		return display;
	}
}
