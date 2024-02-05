namespace Kattis;

using System;

class ARealChallenge
{
    static void Main()
    {
        long Area = long.Parse(System.Console.ReadLine());
        double Longitud = Math.Sqrt(Area);
        double Perimetro = 4 * Longitud;
        System.Console.WriteLine(Perimetro);
    }
}
