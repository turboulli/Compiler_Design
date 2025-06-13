# Executing your compiler

## ProgramArgumentFile

```
int main() {
  int result = 0; // boolean pseudo-array, n-th bit 1 ^= n is prime

  for (int i = 2; i <= 31; i += 1) {
    bool isPrime = true;
    for (int j = 2; j <= i / 2; j += 1) {
      if (i % j == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      result |= (1 << (i - 1));
    }
  }

  int expected = 0x50451456;
  return expected - result;
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
elated-wren
```

## Admin Authored

```
false
```

## Hash

```
cf5f07bb003e336103994840af4bf30320d18a8b284d2727c9451ec9ba3622ff
```
