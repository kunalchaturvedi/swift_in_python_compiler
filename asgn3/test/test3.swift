struct studentMarks {
   var mark1 = 100
   var mark2 = 200
   var mark3 = 300
}

let marks = studentMarks()
marks.mark1 = marks.mark3
print("Mark1 is " , marks.mark1)
print("Mark2 is " , marks.mark2)
print("Mark3 is " , marks.mark3)