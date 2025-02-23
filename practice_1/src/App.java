import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand=new Random();
        System.out.println("游戏规则：");
        System.out.println("0 ——石头 ， 1——剪刀 ，3——布");
        System.out.println("请输入你的选择：");
        int user=input.nextInt();
        int computer=rand.nextInt(3);
        System.out.println("计算机：" + formatChoice(computer));
        /*System.out.println("请输入体重(kg):");
        double weight=input.nextDouble();
        System.out.println("请输入身高(m)：");
        double height=input.nextDouble();

        double BMI=weight/(height*height);
        System.out.println("BMI="+BMI);
        if(BMI>32){
            System.out.println("严重肥胖");

        } else if(BMI>=28){
            System.out.println("肥胖");
        } else if(BMI>=25){
            System.out.println("过重");
        } else if(BMI>=18.5){
            System.out.println("正常");
        } else if(BMI>=25){
            System.out.println("过重");
        } else{
            System.out.println("过轻");
        }  
        switch(user){
            case 2;
            case 1;
            case 0; 
                switch(user-computer){
                    case 0;
                     System.out.println("平局！");
                        break;
                    case 1;
                    case -2;
                        System.out.println("你输了！");    
                        break;
                    case -1;
                 case 2;
                        System.out.println("你赢了！");
                        break;
                }
             break;
            default:
             System.out.println("输入错误！");
     }
    }
    
private static String formatChoice(int num) {
    return switch(num) {
        case 0 -> "石头";
        case 1 -> "剪刀";
        case 2 -> "布";
        default -> "未知";
    };
}
}*/
        switch(user) {
            case 0:
            case 1:
            case 2:
                switch(user - computer) {
                    case 0:
                        System.out.println("平局！");
                        break;
                    case 1:
                    case -2:
                        System.out.println("你输了！");
                        break;
                    case -1:
                    case 2:
                        System.out.println("你赢了！");
                        break;
                }
                break;
            default:
                System.out.println("无效输入！请输入0-2的数字");
        }
    }

    private static String formatChoice(int num) {
        return switch(num) {
            case 0 -> "石头";
            case 1 -> "剪刀";
            case 2 -> "布";
            default -> "未知";
        };
    }
}
