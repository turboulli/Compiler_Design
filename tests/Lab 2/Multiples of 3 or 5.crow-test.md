# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
    int acc = 0;
    for (int x = 0; x < 1000; x += 1) {
        if (x % 3 == 0 || x % 5 == 0) {
            acc += x;
        }
    }


    int result = acc;
    if (result == 233168) { return 0; } else { return -1; }
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
radiant-desert-warbler
```

## Admin Authored

```
false
```

## Hash

```
ae26c295b8c0a1f202ef1a3b6c64932066165c44b7acc535d063ad1c79dcbd34
```
