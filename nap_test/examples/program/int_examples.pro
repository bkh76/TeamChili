func add(int a, int b) -> int
{
  -> a + b
}

func main()
{
  var int a = 2
  var int b = 3
  var int c = 4
  // Should always return T
  print(bool, a * b + c == 10)
  print(bool, a * (b + c) ==  14)
  print(bool, a ** b ** c == a ** (b ** c))
  print(bool, a - b - c == (a - b) - c)
  print(bool, a + b < a + c)
  print(bool, c mod a == 0)
  print(bool, a / c == b / c)
  print(bool, a mod c != b mod c)
  print(bool, a + b == add(a, b))	
}
