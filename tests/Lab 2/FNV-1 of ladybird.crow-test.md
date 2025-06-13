# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
  int fnv_offset_basis = 0x811c9dc5;
  int fnv_prime        = 0x01000193;

  // "ladybird"
  //  11112222

  //            yyddaall
  int str_1 = 0x7964616c; // non-negative!
  //            ddrriibb
  int str_2 = 0x64726962; // non-negative!

  int hash = fnv_offset_basis;
  for (int i = 0; i < 8; i += 1) {
    int chunk = i < 4 ? str_1 : str_2;
    int byte = (chunk >> ((i % 4) * 8)) & 0xFF;

    // FNV-1
    hash *= fnv_prime;
    hash ^= byte;
  }

  // https://md5calc.com/hash/fnv132/ladybird
  return hash == 0xc0eabce4 ? 0 : 1;
}
```

# Executing the compiled binary

## ExitCode

```
0
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
82643f3008999aacd162a73a06895863696923f5f1bd846c9334971abc59f226
```
