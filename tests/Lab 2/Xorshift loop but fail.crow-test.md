# Executing your compiler

## ProgramArgumentFile

```
int main() {
  int state1 = 0x12b9b0a1;
  int j = 0;
  for (int i = 0; i < 4; i+=1) {
    state1 ^= state1 << 13;
    state1 ^= (state1 >> 17) & 0x7fff;
    state1 ^= state1 << 5;
    int state2 = 0xed464f5e;
    for (; state1 != state2; j+=j/j) {
      state2 ^= state2 << 13;
      state2 ^= (state2 >> 17) & 0x7fff;
      state2 ^= state2 << 5;
    }
  }
  return j;
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
quintessential-snowfinchs
```

## Admin Authored

```
false
```

## Hash

```
6dba7b6becb4cf0879fd7bee0515df33757829e3b67852b79e3b9729cefa5d87
```
