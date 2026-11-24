import random
import string
def pass_gen(plen):
    password =""
    charset = string.ascii_letters + string.digits + string.punctuation
    for i in range(1,plen+1):
        password += random.choice(charset)
    return password
plen = int(input("Enter the password Length:"))
if plen <= 8:
    print("Your password must be minimum 8 chars long")
    exit()
    
password = pass_gen(plen)
print(password)
