# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main () {
    bool x = true;
    bool y = false;
    bool z = x && y || (!x && !y) && (x && !y && !x && y); 

    if (!z) {
        return 0;
    }

    return 1;
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
279c346b38d0ef659382dda9a700d43789559448610effffa0bf0e34f348ca84
```
