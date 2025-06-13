# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main () {
    int x = 10;
    int y = 20;
    int z;
    
    for (z = 0; z < 10; z += 1) {
        while (x > 0) {
            x -= 1;
            y += 1;

            if (y == 25) {
                break;
            }
        }
    }

    if (z == 10) {
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
e56eb3fd0a2d76d0e92c132bc7c0ff0287c98c95d835ccb3042e2e25710498a2
```
