public class Member{
	private String name;
	private int fee;

	public Member(String name, int fee){
		setName(name);
		setFee(fee);
	}

	public void setName(String name){
		this.name = name;
	}

	public void setFee(int fee){
		this.fee = fee;
	}

	public String getName(){
		return name;
	}

	public int getFee(){
		return fee;
	}

	public String toString(){
		return String.format("%s\tMembership fee:%d",getName(),getFee());
	}
}