import java.util.Scanner;

public class Test{
	public static void main(String [] args){
	Scanner input=new Scanner(System.in);
	System.out.print("�Q�m�j�W:");
	String name=input.nextLine();
	System.out.print("����̳��w���x�W�p�Y�G(1)�䨧�G(2)�H����(3)�����C�п��:");
	int choice=input.nextInt();
	String reply="";
	if(choice==1){
		reply="�䨧�G";}
	else if(choice==2){
		reply="�H����";}
	else if(choice==3){
		reply="����";}
	System.out.printf("%s��%s",name,reply);
	}
}