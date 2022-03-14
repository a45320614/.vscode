import java.util.Scanner;

public class LoveTest {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("哈囉 亮喵\n歡迎來到宇喵所製作的女友測試\n請先輸入通關密碼(提示:4位數字):");
        String ans="";
        ans=input.next();
        int n=0,i=1;
        while(!ans.equals("0211")){
            System.out.println("妳居然忘了?????");
            System.out.println("妳居然忘了?????");
            System.out.println("妳居然忘了?????");
            System.out.println("再給你一次機會^^");
            ans=input.next();
        }
        if(ans.equals("0211")){
            System.out.println("\n很棒，請繼續前進...");
        }
        System.out.println("妳有每天想我嗎?");
        ans=input.next();
        if(ans.equals("沒有")){
            System.out.println("\n恭喜達成結局<分手快樂>"); 
        }
        else if(ans.equals("有")){
            System.out.println("\n我也有每天想妳喔寶貝\n");
            System.out.println("按Enter繼續前進...");
            input.nextLine();
            input.nextLine();
            System.out.println("接下來是選擇題\n[第一題]\n請選出我最喜歡的寵物");
            System.out.println("(1)勞贖 (2)馬陸 (3)貓咪 (4)狗勾 (5)卯毛蟲 (輸入數字)");
            n=input.nextInt();
            switch(n){
                case 1:
                    System.out.println("\n告訴我小林\n你有甚麼興趣\n你喜歡動物嗎\n什麼 動物 哪一種?\n就一般的 貓 狗 馬 天竺鼠......\n勞贖\n\n恭喜解鎖成就<勞贖>");
                    break;
                case 2:
                    System.out.println("\n妳怎麼會覺得我喜歡這種東西?????");
                    break;
                case 3:
                    System.out.println("\n我喜歡亮喵");
                    break;
                case 4:
                    System.out.println("\n我喜歡狗勾");
                    break;
                case 5:
                    System.out.println("\n矮額妳是怪人吧");
                    break;  
            }
            System.out.println("按Enter繼續前進...");
            input.nextLine();
            input.nextLine();
            System.out.println("\n[第二題]\n宇喵:我喜歡妳，亮");
            System.out.println("對話選擇:\n(1)滾 (2)好喔 (3)使出技能[鬼轉] (4)我也喜歡你!!，宇");
            n=input.nextInt();
            switch(n){
                case 1:
                    System.out.println("\n我要哭給妳看");
                    break;
                case 2:
                    System.out.println("\n不好喔");
                    break;
                case 3:
                    System.out.println("\n恭喜解鎖成就<鬼轉之女-亮晶>");
                    break;
                case 4:
                    System.out.println("\n愛妳!!!!!!!");
                    break;
            }
            System.out.println("按Enter繼續前進...");
            input.nextLine();
            input.nextLine();
            System.out.println("\n[第三題]\n如果妳見到宇喵了，妳會...?]");
            System.out.println("選擇:\n(1)抱抱 (2)抱抱 (3)抱抱 (4)抱抱");
            while(i!=0){
                n=input.nextInt();
                switch(n){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("\n\n呵呵沒想到吧\n我就勉為其難地給妳抱一下好了...");
                        i=0;
                        break;
                    
                    default:
                        System.out.println("\n沒有其他選項了喔ㄎㄎ\n請重新選擇");
                        break;
                }
            }
            System.out.println("按Enter繼續前進...");
            input.nextLine();
            input.nextLine();
            System.out.println("\n[填充題]\n\n通話中...\n亮喵:我要睡了喔\n宇喵:好啦我也要睡了，阿要說什麼?");
            System.out.println("請輸入:");
            ans=input.next();
            System.out.printf("%s",ans);
            switch(ans){
                case "我愛你":
                case "愛你":
                    System.out.println("\n\n我也愛你，寶\n恭喜達成結局<這才是我要的!!>");
                    break;
                case "掰掰":
                    System.out.println("\n\n掰掰");
                    break;
                case "":
                    System.out.println("\n\n你居然什麼都沒講???\n恭喜解鎖成就<木頭女>");
                    break;
                case "想你":
                case "我想你":
                case "我想你了":
                    System.out.println("\n\n我也想妳，寶");
                    break;
                case "我不要":
                case "才不要":
                case "我不要咧":
                    System.out.println("\n\n好阿都不要阿");
                    break;
                case "晚安":
                case "晚安寶":
                case "晚安寶貝":
                case "晚安安":
                case "晚安 寶":
                    System.out.println("\n\n晚安~");
                    break; 
                default:
                    System.out.println("\n\n我沒想到是這個回答欸...");
                    break;
            }
            System.out.println("按Enter繼續前進...");
            input.nextLine();
            input.nextLine();
            System.out.println("\n亮喵，恭喜妳完成我餓著肚子不去吃晚餐所寫出來的女友測試了，希望妳玩得開心^^\n\n愛妳的宇喵");
        }  
    }
}
