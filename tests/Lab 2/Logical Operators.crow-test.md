# Executing your compiler

## ShouldSucceed

## ProgramArgumentFile

```
int main() {

bool b = false;

b = b && true;
if (b != false) {
return 1;
}

b = b || true;
if (b == false) {
return 1;
}

return 0;
}
```

# Executing the compiled binary

## ShouldSucceed

# Meta

## Limited to Category

```
false
```

## Creator

```
considerate-condor
```

## Admin Authored

```
false
```

## Hash

```
ffa87b9a82f1328a25bbfac273ffdc1a9417473a04710a746e7cb831097e34ad
```
