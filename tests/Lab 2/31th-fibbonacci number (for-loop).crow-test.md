# Executing your compiler

## ProgramArgumentFile

```
int main() {
    int n = 31;
    int prevFib = 1;
    int fib = 1;
    for (int i = 3; i <= n; i += 1) {
        int temp = fib;
        fib += prevFib;
        prevFib = temp;
    }
    if (fib == 1346269) return 0;
    else return 1;
}


```

## ShouldSucceed

# Executing the compiled binary

## ExitCode

```
0
```

# Meta

## Limited to Category

```
false
```

## Creator

```
poised-collared-dove
```

## Admin Authored

```
false
```

## Hash

```
b76966860f2d9d75d157d4f814a9342c92d8c0e24f55127fc68f1c172eef060d
```
