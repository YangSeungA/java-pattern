package pattern.strategyPattern.programmer;

import pattern.strategyPattern.skil.AdvanceWebClientSide;
import pattern.strategyPattern.skil.AdvanceWebServerSide;
import pattern.strategyPattern.skil.ClientSide;
import pattern.strategyPattern.skil.ServerSide;

public class AdvanceWebProgrammer extends Programmer {

	public AdvanceWebProgrammer(){
		ClientSide cs = new AdvanceWebClientSide();
		ServerSide ss = new AdvanceWebServerSide();
		setClient(cs);
		setServer(ss);
	}

	@Override
	public String getAllSkill() {
		String display = getClientProgramming() +","+getServerProgramming();
		return display;
	}
}
