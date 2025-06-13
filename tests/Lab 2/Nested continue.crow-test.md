# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int r = 0;
  for (int i = 0; i < 10; i += 1) {
    for (int j = 0; j < 10; j += 1) {
      if ((i + j) % 2 == 0) {
        continue;
      }
      r += 1; // 50 in total
    }
    r += 7; // 70 in total
  }
  return r;
}
```

# Executing the compiled binary

## ExitCode

```
120
```

# Meta

## Limited to Category

```
false
```

## Creator

```
peaceful-tody-tyrant
```

## Admin Authored

```
false
```

## Hash

```
b8fcc0402ecd9e0ee7b2fb8f9904c41be6b84d381e41353b90e1e0ce26a2ed6b
```
