# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
    int a = 3;
    while (true) {
        while (a > 0) {
            a -= 1;
        }
        return 10 / a;  // a=0 after first iteration
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
6d888f4a8eafe5cdd43be9dd3ef2de7a4c0492b312484cf507798f1970e074e2
```
