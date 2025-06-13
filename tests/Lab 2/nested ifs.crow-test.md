# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int a = 3;
  int b = 4;
  int result;
  if ((a & 1) != 0 && (b & 1) != 0) {
    result = 1;
  } else {
    if (a > b) {
      result = a - b;
    } else {
      result = a < b ? a + b : a * b;
    }
  }
  return result;
}
```

# Executing the compiled binary

## ExitCode

```
7
```

# Meta

## Limited to Category

```
false
```

## Creator

```
kindhearted-starling
```

## Admin Authored

```
false
```

## Hash

```
256dee62735363165e38c8dcda19312f24f7819116d47ff89f5e8a29cbad10d7
```
