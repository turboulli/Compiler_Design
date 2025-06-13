# Executing your compiler

## ProgramArgumentFile

```
int main() {
  int a = 0;
  int b = 1;
  for (int i = 0; i < 100; i += 1) {
    a += i * b / 2;
    a = a >= 100 ? a / 3 : a;
    /*
    while (b > 10) {
      b >> 1;
      
    }
    */
  }
  return a;
}
```

## ShouldSucceed

# Executing the compiled binary

## ExitCode

```
48
```

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
a39670067a96643849eccb623f8e32e31f120514f0dc8a4bf3fd0be18b5768cd
```
