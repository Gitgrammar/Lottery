
import java.util.*;
/**
 * LotApp
 */
public class LotApp {

    public static void main(String[] args) {
    
    System.out.print("宝くじを何枚買いますか？>>");   
    Scanner sc=new Scanner(System.in);
    int select=sc.nextInt(); 
    Random rand=new Random();
    int pickedNums[]=new int[select];
    int selectedNums[]=new int[4];
    List<String> list=new ArrayList<>();
    
      
   //1回のみの0000-9999のランダム処理
   for(int i=0;i<select;i++){
    int pickedNum=rand.nextInt(10000);
    
    pickedNums[i]=pickedNum;
    
   }  
   Arrays.sort(pickedNums);
   System.out.println(Arrays.toString(pickedNums));  
   System.out.println("抽選開始...");
   for(int i=0;i<4;i++){
    int selectedNum=rand.nextInt(9);
    System.out.println(selectedNum);
    String showNum=String.valueOf(selectedNum);
    list.add(showNum);
     
    try{Thread.sleep(2000);
    }catch(InterruptedException e){}
   }
   String hit=String.join("",list);
   System.out.println("1等賞"+hit);
   System.out.println("2等賞");
   System.out.println("3等賞");
   System.out.println("4等賞");
    }
}
