A=str(input("Enter user name 1"))
B=str(input("Enter user name 2"))
	
uA1 = input(A + ", do you want to choose rock, paper or scissors? ").lower()
uA2 = input(B + ", do you want to choose rock, paper or scissors? ").lower()

if uA1==uA2 :
    print("game withdraw")
elif uA1=='rock' :
    if uA2=='scissors' :
        print("rock wins")
    else :
        print("paper wins")
elif uA1=='scissors' :
    if uA2=='paper' :
         print("scissors wins") 
    else :
         print("rock wins")
elif uA1== 'paper' :
    if uA2=='rock' :
        print("paper wins")
    else :
        print("scissors wins")


a=input("Enter yes or no if you want to continue gam").lower()
if(a=="yes"):
    pass
elif(a=="no") :
    raise SystemExit
else :
    print("entered value is wrong")
    raise SystemExit