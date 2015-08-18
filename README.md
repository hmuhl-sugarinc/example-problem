# Stack Challenge
The challenge: by implementing a simple `int` stack in Java, demonstrate the ability (a) to learn and use build automation tools (gradle), and (b) employ Java object-oriented programming fundamentals.

## Goals
1. Use gradle to manage dependencies, build, and test your project
2. Implement the `shopstyle.example.IntStack` interface
3. Verify that all tests in `shopstyle.example.IntStackImplTest` pass

## Requirements
1. Your stack implementation must have a constructor that accepts an initial size for the stack.
2. The implementation must also have a zero-argument default constructor that initializes the stack with a size of your choice.
3. The default initial size is up to you. However, this value must be set before runtime and must not be alterable, even by subclasses.

## Using gradle
[gradle](https://gradle.org) is a build automation tool. A full description of gradle's capabilities is outside our scope, here.

For this project, you will use gradle to manage dependencies (specifically, JUnit), compile the project, and run the tests.

To get started:

1. Download and install gradle using the instructions [here](https://docs.gradle.org/current/userguide/installation.html)
2. Verify that gradle was successfully installed by executing `gradle -v`
3. `cd` to the project's topmost directory
4. Compile the project with:

  ```bash
  ./gradlew clean compileJava
  ```
5. 'Clean' and 'compileJava' are *gradle tasks*. The gradle build process is composed of several tasks; gradle knows the correct ordering of these tasks, so if you run one of them, gradle will automatically execute all other tasks upon which your target task depends.
6. The `compileJava` task should have completed successfully. If it did, you'll see a notice that says BUILD SUCCESSFUL.
7. Now, let's run the unit tests for the stack implementation. You can do so by running `./gradlew test`
8. The build should fail. Take a look at the build log, and you'll see that it failed during the `compileTestJava` task. The test fails to compile because Java is looking for, but can't find, a class named `IntStackImpl`.
9. This is your starting point. Good luck!
