func main()
{
  var bool b1 = T
  print(bool, b1)
  var bool b2 = F
  print(bool, b2)
  var bool b = b1 && b2
  print(bool, b)	
  b = b1 || b2
  print(bool, b)	
  b = !b
  print(bool, b)	  
  b1 = 1 == 2
  print(bool, b1)	  
  b2 = 1 >= 2
  print(bool, b2)	  
  b = b && (b1 || b2)
  print(bool, b)	
  b1 = 1 <= 2
  print(bool, b1)	  
  b2 = 1 < 2
  print(bool, b2)	  
  b = 2 > 1
  print(bool, b)
  b = 1 & 2
  print(bool, b)
  b = 1 | 2
  print(bool, b)  
}
