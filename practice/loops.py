for i in range(1, 3*5*7*11+1): # from 1, while less than 16
  to_print = ""
  # check for divisors
  if i % 3 == 0:
    to_print += "fizz"
  if i % 5 == 0:
    to_print += "buzz"
  if i % 7 == 0:
    to_print += "bang"
  if i % 11 == 0:
    to_print += "bong"

  # found nothing
  if to_print == "":
    to_print = i

  print(to_print)

