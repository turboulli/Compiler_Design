# Executing your compiler

## ProgramArgumentFile

```
int main() {
	/* can't eliminate div-zero here because of side-effects
	x being unnecessary doesn't matter */
	int x = 1 / 0;
	return 0;
}
```

## ShouldSucceed

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
zealous-turtle-doves
```

## Admin Authored

```
false
```

## Hash

```
4d855b2f3cf816ea4f877eb9a3219ee0b3b7a6e1690400139afe3d72b2f5d36d
```
