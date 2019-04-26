package pattern.strategyPattern.programmer;

import pattern.strategyPattern.skil.ClientSide;
import pattern.strategyPattern.skil.ServerSide;
import pattern.strategyPattern.skil.WebClientSide;
import pattern.strategyPattern.skil.WebServerSide;

public class WebProgrammer extends Programmer{

	public WebProgrammer(){
		ClientSide cs = new WebClientSide();
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
