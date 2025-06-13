# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int a = 1;
  for (int i = 0; i < 100; i+=1) {
    a = i * a;
    while (a >= i) {
      a /= a;
    }
  }
  return a;
}
```

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
bd9152fecd3a16d2a39da7a30296a87d2eb768b1b6f4474ca8f8cee2601f398f
```
