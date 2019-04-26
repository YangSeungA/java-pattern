package pattern.strategyPattern.programmer;

import pattern.strategyPattern.skil.ClientSide;
import pattern.strategyPattern.skil.ServerSide;

/**
 * 프로그래머의 추상클래스
 * 프로그래머가 되고 싶은 클래스는 이 클래스를 상속받아 구현해야한다.
 */

//프로그래머라면 이 클래스를 상속 또는 추가 구현해야함
public abstract class Programmer {

	private ClientSide client;
	private ServerSide server;

	public Programmer(){}


	// 스킬 셋팅할 수 있도록 getter/setter
	public ClientSide getClient(){
		return client;
	}

	public ServerSide getServer() {
		return server;
	}

	public void setClient(ClientSide client) {
		this.client = client;
	}

	public void setServer(ServerSide server) {
		this.server = server;
	}

	//client프로그래밍 스킬을 나열
	public String getClientProgramming(){
		return client.getClientProgramming();
	}

	// server 프로그래밍 스킬 나열
	public String getServerProgramming(){
		return server.getServerProgramming();
	}

	//해당 메소드는 프로그래머가 가진 모든 스킬을 출력
	public abstract String getAllSkill();
}
