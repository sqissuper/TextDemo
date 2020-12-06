import java.util.Random;
import java.util.Scanner;

public class TextDemo {

//           *   *
//            * *
//             *
//            * *
//           *   *
    //错误
//      public static void main(String[] args){
//          Scanner sc = new Scanner(System.in);{
//              while(true){
//                  int n = sc.nextInt();
//                  int i, j;
//                  for(i = 0; i < n; i++){
//                      for(j = 0; j < n; j++){
//                          if(i == j || i == n-1-i){
//                              System.out.print("*");
//                          }
//                          else{
//                              System.out.print(" ");
//                          }
//                      }
//                      System.out.println();
//                  }
//                  break;
//              }
//          }
//      }

    //猜数字
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        Random random = new Random();
//        int RdNum = random.nextInt(100) + 1;
//
//        while(true){
//            int num = sc.nextInt();
//            if(num < RdNum){
//                System.out.println("猜小了！");
//            }
//            else if(num > RdNum){
//                System.out.println("猜大了！");
//            }
//            else{
//                System.out.println("猜对了！");
//                break;
//            }
//        }
//    }

    //水仙花数 0~999
//    public static void main(String[] args){
//        int n = 100;
//        int t =  0;
//        int a,b,c;
//        while(n <= 999){
//            a  = n / 100;
//            b = (n%100)/10;
//            c = n % 10;
//            if((a*a*a + b*b*b + c*c*c) == n){
//                System.out.print(n + " ");
//            }
//            n++;
//        }
//    }
//        int i;
//        int a,b,c;
//        int sum = 0;
//        for(i = 101; i <= 999; i++) {
//            a = i / 100;
//            b = i / 10 % 10;
//            c = i % 10;
//            sum = a * a * a + b * b * b + c * c * c;
//            if (sum == i) {
//                System.out.print(i + " ");
//            }
//        }
//    }
    //分数求和
//    public static void main(String[] args){
//        double sum = 1;
//        double ret = 0;
//        int flag = 1;
//        int i = 0;
//        for(i = 1; i <= 100; i++){
//            ret += 1.0/i;
//            sum = sum*flag+ret;
//            flag = -flag;
//        }
//        System.out.println(sum);
//    }

//    //最大公约数
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = 0;
//        int m = 0;
//        int x = 0;
//        n = sc.nextInt();
//        m = sc.nextInt();
//        if(m > n){
//            x = m;
//            m = n;
//            n = x;
//        }
//        while(m != 0){
//            int tmp =n % m;
//            n = m;
//            m = tmp;
//        }
//        System.out.println("最大公约数是 "+ n);
//    }
    //二进制奇数位跟偶数位
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 0;
//        //偶数位
//        for(i = 32; i >=0; i-=2){
//            if(((n>>i)&1) == 1){
//                System.out.print(1);
//            }
//        }
//        System.out.println();
//        //奇数位
//        for(i = 31; i >=1; i-=2){
//            if(((n>>i)&1) == 1){
//                System.out.print(1);
//            }
//        }
//    }
    //二进制1的个数
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 0;
//        int count = 0;
//        while(n != 0){
//            if((n & 1) == 1){
//                count++;
//            }
//            n>>=1;
//        }
//        System.out.println(count);
//    }


    //模拟登陆
//    public static void main(String[] args){
//        String password = "123456";
//        Scanner sc = new Scanner(System.in);
//        int i = 3;
//        while(i >= 1){
//            String Password = sc.next();
//            if(Password.equals(password)){
//                System.out.println("登录成功！");
//                break;
//            }
//            else if(i - 1 >= 1){
//                System.out.println("密码错误，请重新输入！");
//            }
//            else{
//                System.out.println("您的次数已用完，请明天再来！");
//            }
//            --i;
//        }
//    }
    //输入整数123，打印1，2，3
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int num = 100;
//        while(n != 0){
//            int t = n / num;
//            n %= num;
//            num /= 10;
//            System.out.println(t + " ");
//
//        }
//    }

    //乘法口诀表
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 0,j = 0;
//        for(i = 1; i <= n; i++){
//            for(j = 1; j <= i; j++){
//                System.out.print(i+"*"+j+"="+(i*j) + " ");
//            }
//            System.out.println();
//        }
//    }

    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入年龄：");
//        int age = sc.nextInt();
//        if(age >= 19 && age <= 28){
//            System.out.println("是青年！");
//        }
//        else if(age >= 29 && age <= 55){
//            System.out.println("是中年！");
//        }
//        else if(age >= 56){
//            System.out.println("是老年！");
//        }
//        else{
//            System.out.println("是少年！");
//        }
//    }

    
    //给定一个数 判断是否为素数
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int n = sc.nextInt();
//        int i = 0;
//        int N = (int) Math.sqrt(n);//平方根 double类型强转int型
//        boolean isPrime = true;
//        if(n < 2){
//            isPrime = false;
//        }
//        else{
//            for(i = 2; i <= N; i++){
//                if(n % i == 0) {
//                    isPrime = false;//不是素数
//                    break;
//                }
//            }
//        }
//        if(isPrime){
//            System.out.println("是素数");
//        }
//        else{
//            System.out.println("不是素数");
//        }
//
//    }


    //打印素数
//    public static void main(String[] args){
//        int i = 0;
//        int j = 0;
//        for(i = 2; i <= 99; i++){
//            boolean flag = true;
//            for(j = 2; j < i; j++){
//                if(i % j == 0){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.print(i+" ");
//            }
//        }
//    }

    //输出 1000 - 2000 之间所有的闰年
//    public static void main(String[] args){
//        int year = 0;
//        for(year = 1000; year < 2000; year++){
//            if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0){
//                System.out.println(year);
//            }
//        }
//
//    }

    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
//    public static void main(String[] args){
//        int i = 0;
//        int count = 0;
//        for(i = 1; i < 100; i++){
//            if(i % 10 == 9 || i / 10 == 9){
//                System.out.print(i + " ");
//                count++;
//            }
//        }
//        System.out.println("count = " + count);
//    }
//    public static void main(String[] args) {
//        String str = "\\\"shiqiang\\\"";
//        char ch = '史';
//        int a = 12;
//        int b = 13;
//       System.out.println(str);
//    }
}
