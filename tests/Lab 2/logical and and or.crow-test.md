# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {
bool b = false;
if ((b || !b) && !b || 0/0 == 0)
  b = true;
if (!b && 0/0 == 0)
  return 5;
if (b) return 42; else return 5;
}
```

# Executing the compiled binary

## ExitCode

```
42
```

# Meta

## Limited to Category

```
false
```

## Creator

```
dependable-scimitarbill
```

## Admin Authored

```
false
```

## Hash

```
042032bbb1d33f671e19688f7ab6f9df2b2d941712971aa4d0e68a6024a5167e
```
