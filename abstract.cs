using System;
abstract class myabs
{
    public abstract  void msg();
}
class myabs1 : myabs
{
    public override void msg()
    {
        Console.WriteLine("hello");
    }
    public static void Main()
    {
        myabs1 obj = new myabs1();
        obj.msg();
    }
}

/* yaha kuch ni abstract class banayi usme ek asbtarct method banaya jiski body define
 * uski child class mai ho ri hai bs yahi main goal tha program ka.. */

// method abstract hoo toh class ka abstract hona manditory ni hai 
// but if class abstract hai toh ume method bhi abstract hoga..