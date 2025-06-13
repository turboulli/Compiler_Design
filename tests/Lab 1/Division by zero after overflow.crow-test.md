# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
    int a00 = 0;
    int a01 = a00 * 2 + 1;
    int a02 = a01 * 2 + 1;
    int a03 = a02 * 2 + 1;
    int a04 = a03 * 2 + 1; // 0x0000000F
    int a05 = a04 * 2 + 1;
    int a06 = a05 * 2 + 1;
    int a07 = a06 * 2 + 1;
    int a08 = a07 * 2 + 1; // 0x000000FF
    int a09 = a08 * 2 + 1;
    int a10 = a09 * 2 + 1;
    int a11 = a10 * 2 + 1;
    int a12 = a11 * 2 + 1; // 0x00000FFF
    int a13 = a12 * 2 + 1;
    int a14 = a13 * 2 + 1;
    int a15 = a14 * 2 + 1; 
    int a16 = a15 * 2 + 1; // 0x0000FFFF
    int a17 = a16 * 2 + 1;
    int a18 = a17 * 2 + 1;
    int a19 = a18 * 2 + 1;
    int a20 = a19 * 2 + 1; // 0x000FFFFF
    int a21 = a20 * 2 + 1;
    int a22 = a21 * 2 + 1;
    int a23 = a22 * 2 + 1;
    int a24 = a23 * 2 + 1; // 0x00FFFFFF
    int a25 = a24 * 2 + 1;
    int a26 = a25 * 2 + 1;
    int a27 = a26 * 2 + 1;
    int a28 = a27 * 2 + 1; // 0x0FFFFFFF
    int a29 = a28 * 2 + 1;
    int a30 = a29 * 2 + 1;
    int a31 = a30 * 2 + 1;
    int a32 = a31 * 2 + 1; // 0xFFFFFFFF
    
    int b0 = a04 - a00; // 0x0000000F
    int b1 = a08 - a04; // 0x000000F0
    int b2 = a12 - a08; // 0x00000F00
    int b3 = a16 - a12; // 0x0000F000
    int b4 = a20 - a16; // 0x000F0000
    int b5 = a24 - a20; // 0x00F00000
    int b6 = a28 - a24; // 0x0F000000
    int b7 = a32 - a28; // 0xF0000000

    return 1 / (b0 + b1 + b2 + b3 + b4 + b5 + b6 + b7 + 1);
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
impeccable-astrapia
```

## Admin Authored

```
false
```

## Hash

```
be6ffdd705ec444333e3485db724e31816bddbc8fb914c0c88444f5d51b1b1b9
```
