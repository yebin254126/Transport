package trans;

import java.util.Scanner;

public class Airplane extends Transport{
    String  orign;  //起始地
    String destination;//目的地
    double distance;   //距离
    Airplane()
    {
        trans_name="飞机";
        speed=300;
        price=0.75;
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
