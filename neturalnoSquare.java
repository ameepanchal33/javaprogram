package basic;

public class neturalnoSquare 
{
public static int summation(int n)
{
    int sum = 0;
    for (int i = 1; i <=10; i++)
        sum += (i * i);

    return sum;
}

public static void main(String args[])
{
    int n = 2;
    System.out.println(summation(n));
}
}
