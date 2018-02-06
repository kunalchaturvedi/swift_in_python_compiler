struct T
{
  var a;
  var b;
  var c;
  var d;
  var e;
  var name : [Int];
  var f;
} ;

func f(T x) -> Int {
{
  x.a = 'a';
  x.b = 47114711;
  x.c = 'c';
  x.d = 1234;
  x.e = 3.141592897932;
  x.f = '*';
  x.name = "abc";
}

func main() -> Int {
    T k;
    f(k);
    return 0;
}