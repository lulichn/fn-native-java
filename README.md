Fn native Java
===============


## Functions

### pure

```sh
$ fn init --runtime java pure
Creating function at: ./pure
Function boilerplate generated.
func.yaml created.
```

### use GraalVM

```sh
$ fn init --init-image fnproject/fn-java-native-init native
Creating function at: ./native
Running init-image: fnproject/fn-java-native-init
Executing docker command: run --rm -e FN_FUNCTION_NAME=native fnproject/fn-java-native-init
func.yaml created.
```

