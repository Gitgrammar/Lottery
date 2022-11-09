
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
   String first=String.join("",list);
   list.subList(0, 3);
   System.out.println(list);
   for(int i=0;i<list.size();i++){
   System.out.println(i+1+"等賞"+String.join("",list)+list.subList(i,list.size()));}

    }
}
