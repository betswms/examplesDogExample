public class Dog  implements Pet{
    private int age;
    private String name;

    public Dog(String myname)
    {
        this.name=myname;
    }

    public void setAge(int myAge)
    {
        if (myAge>-1)
        {
            this.age=myAge;
        }
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void Speak()
    {
        System.out.println(name+" is barking!");
    }

    public String toString()
    {
        return "This dog's name is "+name;
    }

}
