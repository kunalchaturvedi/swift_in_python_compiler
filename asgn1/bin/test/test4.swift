func isOdd(number: Int) -> Bool {
    if number % 2 == 1 {
        return true
    } else {
        return false
    }
}

isOdd(number: 1) /* true */
isOdd(number: 2) /* false*/
isOdd(number: 3) /* true*/

func sum(_ a: Int, _ b: Int) -> Int {
    return a + b
}

print(sum(1, 2))