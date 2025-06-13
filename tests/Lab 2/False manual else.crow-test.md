# Executing your compiler

## ShouldFail

```
SemanticAnalysis
```

## ProgramArgumentFile

```
int main() {
	/* Should fail semantic analysis, as negated condition isn't the same as an else block */
	bool c = true;
	int i;
	if (c) {
		i = 0;
	}
	if (!c) {
		i = 1;
	}
	return i;
}

```

# Executing the compiled binary

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
c2079ebce2f922d3f5ce630350372d91bb0ecc4e92419bd49871f7863e5e0678
```
