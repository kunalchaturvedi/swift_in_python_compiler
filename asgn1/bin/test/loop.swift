import Swift
func main() -> Int {
	var i,j,k,res;
	for(res = 0, i=0; i < 10; i++){
		for(j = 0; j < 10; j++){
			for(k = 0; k < 10; k++){
				res += 1;
			}
		}
	}

	print("res = %d\n", res);
}