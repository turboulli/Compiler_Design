# Executing your compiler

## ProgramArgumentFile

```
int main() {
    // Fail to compile
    // No return in some control flow paths
    int r = 10;
    if (r != 120) {
        if (r < 200) {
            return 1;   
        } else {
            int t = 200;
        } 
    }
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
b11bf1a554bebb700b84f81f6ab80baff94f2e5ae932290cb4373bbfb0af3e7c
```
