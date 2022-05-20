public class Member {
    private String name;
    private int fee;
    
    public Member(String n,int f){
        setName(n);
        setFee(f);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setFee(int fee){
        this.fee=fee;
    }
    public int getFee(){
        return fee;
    }
    public String toString(){
		return String.format("%s\tMembership fee:%d",getName(),getFee());
	}
}
