# Executing your compiler

## ProgramArgumentFile

```
int main () {
  int a = 1;
  int b = a * a + 1;
  int c = b - a;
  int d = b / a;
  int e = c + d;
  int f = b % a;
  e += 1;
  b /= 2;
  f *= 1;
  c -= 1;
  d %= 2;

  int result = a + b + c + d + e + f;

  return result;
}
```

## ShouldSucceed

# Executing the compiled binary

## ExitCode

```
6
```

# Meta

## Limited to Category

```
false
```

## Creator

```
dependable-scimitarbill
```

## Admin Authored

```
false
```

## Hash

```
233877a8beda76c1f2342d837f0603634f94a495eee027087cbb07265d3e20f8
```
