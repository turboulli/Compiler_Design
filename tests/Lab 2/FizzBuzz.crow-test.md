# Executing your compiler

## ProgramArgumentFile

```
int main() {
    // Works correctly
    int n = 1800;
    int fizzes = 0;
    int buzzes = 0;

    while (n > 0) {
        if (n % 3 == 0) {
            fizzes += 1;
        }

        if (n % 5 == 0) {
            buzzes += 1;
        }

        n -= 1;
    }

    if (fizzes == 600 && buzzes == 360)
        return 0;

    return 1;
}
```

## ShouldSucceed

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
trustworthy-turtle-dove
```

## Admin Authored

```
false
```

## Hash

```
dd511e47b102d5ea7649ad3630873bc6864b25dfccf42b805b7cf45ddeff8a96
```
