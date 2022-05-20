public class Club {
    private int n=0;
    private Member[]m=new Member[20];
    
    public void addMember(Member member){
        for(int i=0;i<=20;i++){
            if(m[i]==null){
                m[i] = member;
                break;
            }
        }
        n++;
    }
    public String s(){
		String string = "";
		for(int i=0;i<n;i++){
			string += m[i];
			string += "\n";
		}
		return string;
	}
    public int totalFees(){
        int total=0;
        for(int i=0;i<n;i++){
            total+=m[i].getFee();
        }
        return total;
    }
    public String toString() {
        return s();
    }
}
