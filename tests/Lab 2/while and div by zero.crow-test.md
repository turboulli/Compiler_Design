# Executing your compiler

## ProgramArgumentFile

```
int main() {
  int a = 0; 
  int b = 100;
  while (true) {
    b >>= 1;
    a -= a / b;
    if (a < 0) {
      break;
    }
  }
  return a;
}
```

## ShouldSucceed

# Executing the compiled binary

## ShouldCrash

```
FloatingPointException
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
6c193aa5be6daf8ae9d1e0d4a2f843905da5c341d83b63400d06f9d5c70c82ed
```
