func sieve(array<bool> candidates)
{
  candidates[0] = F
  candidates[1] = F
  var int counter = 2;
  while (counter < length(candidates)){
    if (candidates[counter]){
       set(candidates, 2 * counter, counter, F)
    }
    counter += 1
  }
}