import math

def is_prime(n):
    # neglecting 1 i.e.,not a prime
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):  # 
        if n % i == 0: #checking the given numberis prime
            return False
    return True

count = 0
for number in range(10_000_001):#determining the range of calculating
    number_str = str(number)#converting the integer to string
    is_odd = True
    for i in range(len(number_str) - 1):
        if abs(int(number_str[i]) - int(number_str[i+1])) != 1:# checking whether the difference between two digits are 1
            is_odd = False
            break
    if is_odd and is_prime(number):   #printing if the number is odd and also prime with the difference 1
        count += 1# incrementing the count value

print(count)#returns the count of numbers 
