func input(ref int a, ref int b, ref int c)
{
  print(array<char>, "Number of solutions of a^2 + bx +c = 0\n")
  print("a = ")
  read(int, a);
  print("b =")
  read(int, b);
  print("c = ")
  read(int, c);	
}

func num_solutions(int a, int b, int c) -> int
{
   var int d = b * b - 4 * a * c
   if (d < 0) { -> 0 }
   if (d ==0) { -> 1 }
   -> 2
}

func main()
{
  var int a
  var int b
  var int c
  input(a, b, c)
  print(array<char>, "Number of solutions: ")
  print(int, num_solutions(a, b, c))
}
