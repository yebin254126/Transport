package trans;

import java.util.Scanner;

public class High_speedrail extends Transport{
    String  orign;  //起始地
    String destination;//目的地
    double distance;   //距离

    High_speedrail() {
        price=0.45; //每公里0.45元
        trans_name="高铁";
        speed=200;  //每小时200公里
        Scanner sc=new Scanner(System.in);
        orign=sc.next();
        destination=sc.next();
        distance=sc.nextDouble();
    }

    @Override
    void  calculate()
    {
        arrive_time=(float)(distance/speed);
        double total_price = price * distance;
        System.out.println("你乘坐的是"+trans_name );
        System.out.println("花费了"+arrive_time+"小时");
        System.out.println("需要支付"+total_price);

    }
}
