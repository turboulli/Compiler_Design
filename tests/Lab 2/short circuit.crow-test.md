# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
    int x = 1;
    int y = 0;
    bool b = ((x != 0) || (y == 5/0));  // 5/0 never executes
    return y;
}
```

# Executing the compiled binary

## ShouldSucceed

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
glamorous-canastero
```

## Admin Authored

```
false
```

## Hash

```
982ac59f2c115a3436a8a051fc978ac17ed2e76711f2dfd4ff6b6c2aebe10f51
```
