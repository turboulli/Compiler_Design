# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main () {
    for (int x = 0; x < 7; x += 1) {
    	int y = 1/x; // should cause a divide error if x++ is correctly executed after the body
    }
    return 0;
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
firm-panda
```

## Admin Authored

```
false
```

## Hash

```
083c65d01ee16e17a114ea45ccc480b4b6bd1d7cd0620e5612660eaa64242ad4
```
