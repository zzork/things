# Read an integer N.
#
# Without using any string methods, try to print the following: 234...N

if __name__ == '__main__':
    n = int(input())
    
    for i in range(n):
        print(i + 1, end = "")
