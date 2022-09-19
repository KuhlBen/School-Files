namespace _3_28
{
    internal class Program
    //Ben Kuhlman
    //MWF @ 9am C# and .NET
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Input a number 5 digits long: ");
            int original = int.Parse(Console.ReadLine());

            int d1 = original % 10;
            original /= 10;

            int d2 = original % 10;
            original /= 10;

            int d3 = original % 10;
            original /= 10;

            int d4 = original % 10;
            original /= 10;

            int d5 = original % 10;
            original /= 10;

            Console.WriteLine($"{d5}   {d4}   {d3}   {d2}   {d1}");
        }
    }
}