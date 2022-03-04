import java.util.Scanner;

public class Test{
	public static void main(String [] args){
	Scanner input=new Scanner(System.in);
	System.out.print("貴姓大名:");
	String name=input.nextLine();
	System.out.print("票選最喜歡的台灣小吃：(1)臭豆腐(2)蚵ㄚ煎(3)滷味。請選擇:");
	int choice=input.nextInt();
	String reply="";
	if(choice==1){
		reply="臭豆腐";}
	else if(choice==2){
		reply="蚵ㄚ煎";}
	else if(choice==3){
		reply="滷味";}
	System.out.printf("%s選%s",name,reply);
	}
}