public class QuadraticEquation
{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public double getC()
    {
        return c;
    }

    public double getDiscriminant()
    {
        return b * b - 4 * a * c;
    }

    public double getRoot1()
    {
        if (this.getDiscriminant() >= 0)
        {
            double r1 = (-b + Math.sqrt(this.getDiscriminant())) / 2 * a;
            return r1;
        }
        else
            return 0;
    }

    public double getRoot2()
    {
        if (this.getDiscriminant() >= 0)
        {
            double r2 = (-b - Math.sqrt(this.getDiscriminant())) / 2 * a;
            return r2;
        }
        else
            return 0;
    }
}