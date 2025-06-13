# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
    int a = 10;
    int b = 5;
    int c = 2;
    
    int result = (a + b) / c * (b - c);
    // Should calculate as: (10 + 5) / 2 * (5 - 2)
    // = 15 / 2 * 3
    // = 7 * 3
    // = 21
    
    int remainder = result % 13; // 21 % 13 = 8
    
    return remainder; // Should return 8
}
```

# Executing the compiled binary

## ExitCode

```
8
```

# Meta

## Limited to Category

```
false
```

## Creator

```
suspicious-harrier-hawk
```

## Admin Authored

```
false
```

## Hash

```
04729f2c3f21992debddf19d6297fb3b576feaf804d04282798979ac89a6ec7d
```
