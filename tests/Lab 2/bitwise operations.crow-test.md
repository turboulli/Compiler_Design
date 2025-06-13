# Executing your compiler

## ProgramArgumentFile

```
int main() {
    int mask = (1 << 8) - 1;
    if (mask != 255) return 1;
    int a = 17 | 33;
    if (a != 49) return 2;
    a ^= mask;
    if (a != 206) return 3;
    a >>= 4;
    if (a != 12) return 4;
    return a & (mask << 4);
}
```

## ShouldSucceed

# Executing the compiled binary

## ShouldSucceed

# Meta

## Limited to Category

```
false
```

## Creator

```
poised-collared-dove
```

## Admin Authored

```
false
```

## Hash

```
76fed215f00cad3e9321e65b34cd79522b67810b364643afdad6702f5e987132
```
