# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int myint = 1;
  for (int i = 0; i < 3; i += 1) {
    myint <<= 0xF;
  }

  for (int i = 0; i < 3; i += 1) {
    myint >>= 0xF;
  }

  return 54321 / myint;
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
elated-wren
```

## Admin Authored

```
false
```

## Hash

```
4f58a75869f994fce43ea9b76b073a99a128e2a5840a3210f9fce8a1ddde566c
```
