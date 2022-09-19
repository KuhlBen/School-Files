namespace _3_24
{
    internal class Program
        //Ben Kuhlman
        //MWF @ 9am C# and .NET
    {
        static void Main(string[] args)
        {
        
            Console.WriteLine("Enter an integer: ");
            int num = int.Parse(Console.ReadLine());

            if (num % 2 == 1)
                Console.WriteLine($"{num} is odd!");
            else
                Console.WriteLine($"{num} is even!");


        }
    }
}