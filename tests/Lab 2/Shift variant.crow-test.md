# Executing your compiler

## ProgramArgumentFile

```
int main() {
  int state1 = 0xed464f5e;
  int j = 0;
  for (int i = 0; i < 4; i+=1) {
    state1 ^= state1 << 13;
    state1 ^= (state1 >> 17) & 0x7fff;
    state1 ^= state1 << 5;
    int state2 = 0x12b9b0a1;
    for (; state1 != state2; j+=1) {
      state2 ^= state2 << 13;
      state2 ^= (state2 >> 17) & 0x7fff;
      state2 ^= state2 << 5;
    }
  }
  return j;
}
```

## ShouldSucceed

# Executing the compiled binary

## ExitCode

```
122
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
a6046e8f49f32beb89d66bed96faf760343bf93c9068650de914061b1d0a3b53
```
