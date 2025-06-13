# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
    int x = 5;
    while (10 % x >= 0) {  // Division happens before check
        x -= 1;
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
glamorous-canastero
```

## Admin Authored

```
false
```

## Hash

```
924532a418a215deff51c88839ce22e112a2052b7de44e58c72c428504bb2c7d
```
