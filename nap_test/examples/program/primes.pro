func set(array<bool> a, int start, int incr, bool value)
{
  var int counter = start
  while (i < length(a)){
    a[counter] = value 
    counter += incr 
  }
}

func positive(array<char> message) -> int
{
  var int value
  do {
    print(array<char>, message)
    read(int, value)
  } while (value < 0)
  -> value
}

func sieve(array<bool> candidates)
{
  candidates[0] = F
  candidates[1] = F
  var int counter = 2
  while (counter < length(candidates)){
    if (candidates[counter]){
       set(candidates, 2 * counter, counter, F)
    }
    counter += 1
  }
}

func print_newline()
{
  print(array<char>, "\n")
}

func print_primes(array<bool> candidates)
{
  var int counter = 0
  while (counter < length(candidates)) {
    if (candidates[counter]){
       print(int, counter)
       print_newline()
    }
  }  
}

func main()
{
  var int size = positive("Enter a positive integer: ")
  var array<bool> candidates = new(bool, size)
  set(candidates, 0, 1, T)
  sieve(candidates)
  print_primes(candidates)
}
