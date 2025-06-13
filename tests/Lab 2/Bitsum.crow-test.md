# Executing your compiler

## ProgramArgumentFile

```
int main() {
    int input = 781248;
    int sum = 0;
    for (int i = 0; i < 32; i += 1) {
        sum += input & 1;
        input >>= 1;
    }
    return sum;
}
```

## ShouldSucceed

# Executing the compiled binary

## ExitCode

```
11
```

# Meta

## Limited to Category

```
false
```

## Creator

```
immaculate-storm-petrel
```

## Admin Authored

```
false
```

## Hash

```
bcce821744b9ebbaa9c17522623326b773d34a735ea9cab6f56f993f6aa84e69
```
