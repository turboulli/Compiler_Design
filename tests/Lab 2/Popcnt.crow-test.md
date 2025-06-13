# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int x = -123456789;
  int y = 0;
  
  for (int i = 1; x != 0; i <<= 1) {
    y += ((x & i) == 0) ? 0 : 1;
    x &= ~i;
  }

  return y;
}
```

# Executing the compiled binary

## ExitCode

```
17
```

# Meta

## Limited to Category

```
false
```

## Creator

```
impeccable-astrapia
```

## Admin Authored

```
false
```

## Hash

```
19d5b6f78e829ab631360c86c0f0388546cb2c1b3461bd7ce76871dfed50dcf2
```
