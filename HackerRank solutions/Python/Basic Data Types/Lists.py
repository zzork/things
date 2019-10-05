# Consider a list (list = []). You can perform the following commands:
#
# insert i e: Insert integer i at position e.
# print: Print the list.
# remove e: Delete the first occurrence of integer e.
# append e: Insert integer e at the end of the list.
# sort: Sort the list.
# pop: Pop the last element from the list.
# reverse: Reverse the list.
# Initialize your list and read in the value of n followed by n lines of commands where each command will be of the 7 types listed above.
#
# Iterate through each command in order and perform the corresponding operation on your list.

if __name__ == '__main__':
    N = int(input())
    lis = []

    for i in range(N):
        line = input().split()
        command = line[0]
        args = list(map(int, line[1:]))
        
        if (command == "insert"):
            lis.insert(args[0], args[1])
        elif (command == "print"):
            print(lis)
        elif (command == "remove"):
            lis.remove(args[0])
        elif (command == "append"):
            lis.append(args[0])
        elif (command == "sort"):
            lis.sort()
        elif (command == "pop"):
            lis.pop()
        elif (command == "reverse"):
            lis.reverse()
        

