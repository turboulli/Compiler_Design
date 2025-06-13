# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
    int x;
    int y = 1;

    for (x = 1; x < 10; x <<= 1) {
        y <<= 1;
    }

    if (y == 16) {
        return 0;
    }

    return -1;
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
stupid-stinkbug
```

## Admin Authored

```
false
```

## Hash

```
af0d8474394d4ad7e4c2bc7d734743ea1b8baf5f33d3fb0cbfdfe94c6e1eaa20
```
