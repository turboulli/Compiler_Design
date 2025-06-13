# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  for (int x = 1; true ? false ? false : true : false; x -= 1) {
    x = 1 / x;
  }
  return 0;
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
impeccable-astrapia
```

## Admin Authored

```
false
```

## Hash

```
f24332f009d7803a5d6633dff0a305e747e2285b7b25c4530cc6547deab112c6
```
