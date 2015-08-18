# Stack Challenge
The challenge: by implementing a simple `int` stack in Java, demonstrate the ability (a) to learn and use build automation tools (Gradle), and (b) employ Java object-oriented programming fundamentals.

## Goals
1. Use Gradle to manage dependencies, build, and test your project
2. Implement the `shopstyle.example.IntStack` interface
3. Verify that all tests in `shopstyle.example.IntStackImplTest` pass

## Requirements
1. Your stack implementation must have a constructor that accepts an initial size for the stack.
2. The implementation must also have a zero-argument default constructor that initializes the stack with a size of your choice.
3. The default initial size is up to you. However, this value must be set before runtime and must not be alterable, even by subclasses.
4. Do not alter `IntStack.java` or `IntStackImplTest.java`.

## Using Gradle
[Gradle](https://gradle.org) is a build automation tool. A full description of Gradle's capabilities is outside our scope here.

For this project, you will use Gradle to manage dependencies (specifically, JUnit), compile the project, and run the tests. The only thing you should need to run Gradle is an installation of the JDK.

To get started:

1. `cd` to the project's topmost directory
2. Compile the project with:

  ```bash
  ./gradlew clean compileJava
  ```

If you get an error when running this, check that the JDK is installed, and that the JAVA_HOME environment variable is set correctly.
3. 'Clean' and 'compileJava' are *Gradle tasks*. The Gradle build process is composed of several tasks; Gradle knows the correct ordering of these tasks, so if you run one of them, Gradle will automatically execute all other tasks upon which your target task depends.
4. The `compileJava` task should have completed successfully. If it did, you'll see a notice that says BUILD SUCCESSFUL.
5. Now, let's run the unit tests for the stack implementation. You can do so by running `./gradlew test`
6. The build should fail. Take a look at the build log, and you'll see that it failed during the `compileTestJava` task. The tests should fail to compile, because `IntStackImpl` is an empty class. It does not compatible with `IntStack` and does not have the required constructors.
7. This is your starting point. You will need to modify `IntStackImpl` to get rid of the compilation errors, then pass all the tests. Good luck!
