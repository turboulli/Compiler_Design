# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int path = 0xE;
  int val = (path & (1 << 0)) == 0
    ? ((path & (1 << 1)) == 0
        ? ((path & (1 << 2)) == 0
            ? ((path & (1 << 3)) == 0
                ? (421)
                : (-521)
            )
            : ((path & (1 << 3)) == 0
                ? (376)
                : (503)
            )
        )
        : ((path & (1 << 2)) == 0
            ? ((path & (1 << 3)) == 0
                ? (776)
                : (-691)
            )
            : ((path & (1 << 3)) == 0
                ? (-734)
                : (0)
            )
        )
    )
    : ((path & (1 << 1)) == 0
        ? ((path & (1 << 2)) == 0
            ? ((path & (1 << 3)) == 0
                ? (714)
                : (24)
            )
            : ((path & (1 << 3)) == 0
                ? (-424)
                : (-499)
            )
        )
        : ((path & (1 << 2)) == 0
            ? ((path & (1 << 3)) == 0
                ? (458)
                : (-309)
            )
            : ((path & (1 << 3)) == 0
                ? (-766)
                : (379)
            )
        )
    );
  return 314159 / val;
}
```

# Executing the compiled binary

## ShouldCrash

```
FloatingPointException
```

# Meta

## Limited to Category

```
false
```

## Creator

```
elated-wren
```

## Admin Authored

```
false
```

## Hash

```
4c63bb18e15c5481462521047ea5a0f7efcf906097bc901652e1cd9e521a49ca
```
