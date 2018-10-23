package trans;

public abstract class Transport {
   public String  trans_name;  //交通方式
     float    arrive_time;    //到达时间
    int     return_time;      //返回时间
    int     check_time;       //检票时间
    int     wait_time;        //等待事件
    double  speed;            //速度
    double  price;           //票价
    abstract void calculate();  //计算总价和时间
    public void  input()        //打印信息
    {
        calculate();
    }
}
