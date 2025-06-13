# Executing your compiler

## ProgramArgumentFile

```
int main() {
int n = 5;
if (n <= 0) return 0;
    if (n == 1) return 1;

    int prev = 0;
    int curr = 1;
    int next;
    for (int i = 2; i <= n; i+=1) {
        next = prev + curr;
        prev = curr;
        curr = next;
    }

    return curr;
}
```

# Executing the compiled binary

## ExitCode

```
5
```

# Meta

## Limited to Category

```
false
```

## Creator

```
incredible-ground-thrushs
```

## Admin Authored

```
false
```

## Hash

```
4d4056b1bbcf2abab11204a519184ca814159bab2a4b70e3a31dc1875c4c5d2c
```
