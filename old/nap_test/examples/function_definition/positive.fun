func positive(array<char> message) -> int
{
  var int value
  do {
    print(array<char>, message)
    read(int, value)
  } while (value < 0)
  -> value
}