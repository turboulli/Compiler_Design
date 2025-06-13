# Executing your compiler

## ShouldFail

```
SemanticAnalysis
```

## ProgramArgumentFile

```
int main() {
  int x = 10;
  if (x) { // Error: x is int, L2 requires bool and has no implicit coercion.
    return 1;
  } else {
    return 0;
  }
}
```

# Executing the compiled binary

# Meta

## Limited to Category

```
false
```

## Creator

```
heavenly-crimsonwing
```

## Admin Authored

```
false
```

## Hash

```
927c357f9a5e5a8b8601b7ba0443a100d4b01eee20e7a2782fb0e74fd6ec1e44
```
