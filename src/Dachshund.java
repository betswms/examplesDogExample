public class Dachshund extends Dog
{
    private int speed;
    public Dachshund(String myname)
    {
        super(myname);  //call super class constructor
        speed=5;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void Speak()
    {
        System.out.println(this.getName()+" is yipping");
    }




}
