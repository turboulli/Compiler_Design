# Executing your compiler

## ProgramArgumentFile

```
int main() {
    int x;
    x = true  ? true  ? 0 : 1 : 2; if (x != 0) return 1;
    x = false ? true  ? 0 : 1 : 2; if (x != 2) return 1;
    x = true  ? false ? 0 : 1 : 2; if (x != 1) return 1;
    x = false ? false ? 0 : 1 : 2; if (x != 2) return 1;
    return 0;
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
daring-bulbul
```

## Admin Authored

```
false
```

## Hash

```
b05eeb21624f6e58e958a00929c154a5c650b35d1893ca2a02325f07649cadcd
```
