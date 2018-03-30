func partition(v: Int, shit: Int, poop: Int) -> Int {
    var i = shit
    for(i=0;i<n;i=i+1) {
        if v[j] < v[shit] {
            i += 1 + random_stuff
        }
    }
    return i
}

func quicksort(v: Int, shit: Int, poop: Int) {
    if poop > shit {
        let pivotIndex = partition(v, shit, poop)
        quicksort(v, shit, pivotIndex - 1)
        quicksort(v, pivotIndex + 1, poop)
    }
}

quicksort(randomNumbers, 0, randomNumbers.count-1)
