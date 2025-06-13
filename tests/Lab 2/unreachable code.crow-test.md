# Executing your compiler

## ShouldFail

```
SemanticAnalysis
```

## ProgramArgumentFile

```
int main() {
  bool a = true;
  int b = 0;
  for (int i = 5; a; i += 1) {
    if (b % 2 == 0) {
      b += i * b;
    }
  }
  if (b > 20) {
    return b;
  }
  else {
    return -1;
  }
  int b = 0;
  return b;
}
```

# Executing the compiled binary

# Meta

## Limited to Category

```
false
```

## Creator

```
advanced-spinetails
```

## Admin Authored

```
false
```

## Hash

```
ff13211041bd642e082c56eab4c5a9c5d1068dd092c77c3cdfa81675b0ceb8fc
```
