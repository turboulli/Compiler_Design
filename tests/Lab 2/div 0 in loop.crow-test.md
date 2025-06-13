# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int sum = 0;
  for(int i = 0; i <= 20; i += 1) {
    sum = sum / 0;
  }
  return sum;
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
impressive-palm-swift
```

## Admin Authored

```
false
```

## Hash

```
b95ee7be9721345c0adaa7a90aac2aed57148157fb7e8ed1a6c6ee5e9d4ff5b5
```
