# Executing your compiler

## ProgramArgumentFile

```
int main() {
    // Fail to compile
    int t = 12;
    int c = 0;

    while (c < t) {
        c += 1;
    }

    if (t != c && true) {
        return 12 / 0;
    } 
    
    return true;
}
```

## ShouldFail

```
SemanticAnalysis
```

# Executing the compiled binary

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
9963854ecf0c7d8360be81fbfaf643afc494e81c66d3e4534102540cffaf6a66
```
