# Executing your compiler

## ProgramArgumentFile

```
int main() {
  bool a = true;
  int x = 0;
  while (a && (x < 10)) {
    if (!a) {
      x = 10/0;
    }
    x += 1;
  }
  return x + 1;
}
```

## ShouldSucceed

# Executing the compiled binary

## ExitCode

```
11
```

# Meta

## Limited to Category

```
false
```

## Creator

```
adept-spurfowls
```

## Admin Authored

```
false
```

## Hash

```
69dac54835ac3a82e946bb35eede717a58bf57b40a2d3409aab23e8d63be5bc2
```
