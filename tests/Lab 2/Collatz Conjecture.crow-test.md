# Executing your compiler

## ProgramArgumentFile

```
int main() {
    int x = 42;
    int steps = 0;
    for (int n = x; n != 1; steps += 1) {
        if (n % 2 == 0) {
            n /= 2;
        } else {
            n = 3 * n + 1;
        }
    }
    return steps;
}
```

## ShouldSucceed

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
immaculate-storm-petrel
```

## Admin Authored

```
false
```

## Hash

```
af0e0c5c2c7d4d8c7d958248f12687c7fdad95ee83b4a8930b6fb1fb0842fae8
```
