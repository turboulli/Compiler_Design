# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
int x = 16;
x <<= 1;
if (x != 32) {
return 1;
}

x >>= 2;
if (x != 8) {
return 1;
}

x |= 4;
if (x != 12) {
return 1;
}

x ^= 2;
if (x != 14) {
return 1;
}

x &= 32;

if (x != 0) {
return 1;
}

return 0;
}
```

# Executing the compiled binary

## ShouldSucceed

# Meta

## Limited to Category

```
false
```

## Creator

```
considerate-condor
```

## Admin Authored

```
false
```

## Hash

```
381911dde3ece9f96e2c3aeff6e98dd73088032e43ee71ae7a336f2759e70ed8
```
