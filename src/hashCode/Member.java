package hashCode;

public class Member {

	private String name;

	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		if (this == obj) {
			System.out.println("Object Same");
			return true;
		}

		Member that = (Member) obj;

		if (this.name ==null && that.name != null){
			return false;
		}

		if(this.name == that.name){
			System.out.println("Object Value Same");
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;	//소수이면서 홀수값
		int hashCode = 1;

		hashCode = prime * hashCode + ((name == null) ? 0 : name.hashCode());

		return hashCode;

	}
}
