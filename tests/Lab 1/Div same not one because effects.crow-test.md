# Executing your compiler

## ProgramArgumentFile

```
int main() {
	/* hide a = 0 a bit */
	int s = 3;
	int t = s / 2;
	int a = t - 1;
	/* not 1 for a = 0 because of side-effect */
	int f = a / a;
	return f;
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
7992acd8c5ca3b6288653624aeceefa47c45c802760aaf93aa2636965fbab2bc
```
