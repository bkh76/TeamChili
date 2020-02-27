func main()
{
  var int size = positive("Enter a positive integer: ")
  var array<bool> candidates = new(bool, size)
  set(candidates, 0, 1, T)
  sieve(candidates)
  print_primes(candidates)
}