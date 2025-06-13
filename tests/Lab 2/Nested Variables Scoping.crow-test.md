# Executing your compiler

## ProgramArgumentFile

```
int main() {
int n1 = 1;
if (true) {
int n2 = 2;
if(true){
int n3 = 3;
if(true){
int n4 = 4;
if(true){
int n5 = 5;
if(true){
int n6= 6;
if(true){
int n7 = 7;
if(true){
return n7;
}
}
}
}
}
}
}
// Should not be able to access n2-n7, they are out of scope
return n1+n2+n3+n4+n5+n6+n7;
}
```

## ShouldFail

```
SemanticAnalysis
```

# Executing the compiled binary

# Meta

## Limited to Category

```
false
```

## Creator

```
acclaimed-towhee
```

## Admin Authored

```
false
```

## Hash

```
2a004e88c87b98701101fbd6b5521097f8fe496d6dfd5fb8e38de41e82ac34d3
```
