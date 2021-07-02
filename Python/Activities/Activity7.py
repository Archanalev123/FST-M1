numbers = list(input("Enter a sequence of comma separated values: "))
sum = 0
 
for number in numbers:
  sum += int(number)
 
print(sum)