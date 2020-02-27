func print_primes(array<bool> candidates)
{
  var int counter = 0;
  while (counter < length(candidates)) {
    if (candidates[counter]){
       print(int, counter)
       print_newline()
    }
  }  
}