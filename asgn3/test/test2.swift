var index = 10

while index < 20 {
print( "Value of index is " , index)
index = index + 1
}

var someInts:[Int] = [10, 20, 30]

for(index =10 ; index < 40; index=index+10) {
print( "Value of index is " , index)
}

var index = 10

repeat {
index = index + 1
if index == 15 {
    continue
}
    if index == 151 {
    break
}
print( "Value of index is " , index)
} while index < 20
