
#gets input
i = input("Write a thing: ").lower()
#puts the input to a list 
L = list(i)
#reverses the input
yo = L[::-1]
def Palindrome():

    #if the L list and yo List match then its a palindrome. if not then no palindrome
    
    if L == yo:
        print("PALINDROMEEEE")
    else:
        print("NO PALINDROMEEEEEEEE")

Palindrome()
