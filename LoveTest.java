import java.util.Scanner;

public class LoveTest {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("���o �G�p\n�w��Ө�t�p�һs�@���k�ʹ���\n�Х���J�q���K�X(����:4��Ʀr):");
        String ans="";
        ans=input.next();
        int n=0,i=1;
        while(!ans.equals("0211")){
            System.out.println("�p�~�M�ѤF?????");
            System.out.println("�p�~�M�ѤF?????");
            System.out.println("�p�~�M�ѤF?????");
            System.out.println("�A���A�@�����|^^");
            ans=input.next();
        }
        if(ans.equals("0211")){
            System.out.println("\n�ܴΡA���~��e�i...");
        }
        System.out.println("�p���C�ѷQ�ڶ�?");
        ans=input.next();
        if(ans.equals("�S��")){
            System.out.println("\n���߹F������<����ּ�>"); 
        }
        else if(ans.equals("��")){
            System.out.println("\n�ڤ]���C�ѷQ�p���_��\n");
            System.out.println("��Enter�~��e�i...");
            input.nextLine();
            input.nextLine();
            System.out.println("���U�ӬO����D\n[�Ĥ@�D]\n�п�X�ڳ̳��w���d��");
            System.out.println("(1)��ū (2)���� (3)�߫} (4)���� (5)�f���� (��J�Ʀr)");
            n=input.nextInt();
            switch(n){
                case 1:
                    System.out.println("\n�i�D�ڤp�L\n�A���ƻ򿳽�\n�A���w�ʪ���\n���� �ʪ� ���@��?\n�N�@�몺 �� �� �� �Ѫǹ�......\n��ū\n\n���߸��ꦨ�N<��ū>");
                    break;
                case 2:
                    System.out.println("\n�p���|ı�o�ڳ��w�o�تF��?????");
                    break;
                case 3:
                    System.out.println("\n�ڳ��w�G�p");
                    break;
                case 4:
                    System.out.println("\n�ڳ��w����");
                    break;
                case 5:
                    System.out.println("\n�G�B�p�O�ǤH�a");
                    break;  
            }
            System.out.println("��Enter�~��e�i...");
            input.nextLine();
            input.nextLine();
            System.out.println("\n[�ĤG�D]\n�t�p:�ڳ��w�p�A�G");
            System.out.println("��ܿ��:\n(1)�u (2)�n�� (3)�ϥX�ޯ�[����] (4)�ڤ]���w�A!!�A�t");
            n=input.nextInt();
            switch(n){
                case 1:
                    System.out.println("\n�ڭn�����p��");
                    break;
                case 2:
                    System.out.println("\n���n��");
                    break;
                case 3:
                    System.out.println("\n���߸��ꦨ�N<���ध�k-�G��>");
                    break;
                case 4:
                    System.out.println("\n�R�p!!!!!!!");
                    break;
            }
            System.out.println("��Enter�~��e�i...");
            input.nextLine();
            input.nextLine();
            System.out.println("\n[�ĤT�D]\n�p�G�p����t�p�F�A�p�|...?]");
            System.out.println("���:\n(1)��� (2)��� (3)��� (4)���");
            while(i!=0){
                n=input.nextInt();
                switch(n){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("\n\n�����S�Q��a\n�ڴN�j�������a���p��@�U�n�F...");
                        i=0;
                        break;
                    
                    default:
                        System.out.println("\n�S����L�ﶵ�F��}�}\n�Э��s���");
                        break;
                }
            }
            System.out.println("��Enter�~��e�i...");
            input.nextLine();
            input.nextLine();
            System.out.println("\n[��R�D]\n\n�q�ܤ�...\n�G�p:�ڭn�ΤF��\n�t�p:�n�էڤ]�n�ΤF�A���n������?");
            System.out.println("�п�J:");
            ans=input.next();
            System.out.printf("%s",ans);
            switch(ans){
                case "�ڷR�A":
                case "�R�A":
                    System.out.println("\n\n�ڤ]�R�A�A�_\n���߹F������<�o�~�O�ڭn��!!>");
                    break;
                case "�T�T":
                    System.out.println("\n\n�T�T");
                    break;
                case "":
                    System.out.println("\n\n�A�~�M���򳣨S��???\n���߸��ꦨ�N<���Y�k>");
                    break;
                case "�Q�A":
                case "�ڷQ�A":
                case "�ڷQ�A�F":
                    System.out.println("\n\n�ڤ]�Q�p�A�_");
                    break;
                case "�ڤ��n":
                case "�~���n":
                case "�ڤ��n��":
                    System.out.println("\n\n�n�������n��");
                    break;
                case "�ߦw":
                case "�ߦw�_":
                case "�ߦw�_��":
                case "�ߦw�w":
                case "�ߦw �_":
                    System.out.println("\n\n�ߦw~");
                    break; 
                default:
                    System.out.println("\n\n�ڨS�Q��O�o�Ӧ^����...");
                    break;
            }
            System.out.println("��Enter�~��e�i...");
            input.nextLine();
            input.nextLine();
            System.out.println("\n�G�p�A���ߩp�����ھj�ۨ{�l���h�Y���\�Ҽg�X�Ӫ��k�ʹ��դF�A�Ʊ�p���o�}��^^\n\n�R�p���t�p");
        }  
    }
}
