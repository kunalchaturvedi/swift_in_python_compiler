
var x : Int =3

//wrong if syntax
if (x == 1){
    x = 2
}

var someInts:[Int] = [10, 20, 30]

// wrong for syntax
for x in someInts {
	x = x*5
}

struct studentMarks {
   var mark1 = 100
   var mark2 = 200
   var mark3 = 300
}

let marks = studentMarks()
//dot dot not an operator
marks.mark1 = marks..mark3
