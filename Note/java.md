<h1 style="color: lightgreen">Introduction to Java</h1>
<a href="https://www.codecademy.com/resources/docs/java">codecademy</a>
<p>Programming languages enable humans to write instructions that a computer can perform. With precise instructions, computers coordinate applications and systems that run the modern world.</p>
<p>One reason people love Java is the Java Virtual Machine, which ensures the same Java code can be run on different operating systems and platforms. Sun Microsystems’ slogan for Java was “write once, run everywhere”.</p>

![java.png](img/java.png)
<p>We write syntax in <a href="">files</a> to create programs, which are executed by the computer to perform the desired task.
Java provides a number of different classes and methods for utilizing files and a computer’s file system. They include the File, FileReader, and FileWriter classes (all from the java.io package).</p>

<h3 style="color:greenyellow">! <a style="color:greenyellow" href="https://www.codecademy.com/learn/learn-java/modules/learn-java-hello-world/cheatsheet">cheatsheet</a></h3>

<h2 style="color: orange">Java File!</h2>
Java <a href="https://www.codecademy.com/resources/docs/java/files">files</a> have a .java extension.

Each file has one primary class named after the file. Every word is capitalized.
<p>Inside the class we had a main() method which lists our program tasks:</p>

```
public static void main(String[] args) {

}
```
static; public; void; 

String[] args is a placeholder for information we want to pass into our program.

<h2 style="color: orange">Print Statements</h2>
Print statements output information to the screen (also referred to as the output terminal).

```
System.out.println("Hello World");
```

* System is a built-in Java class that contains useful tools for our programs.
* out is short for “output”.
* println is short for “print line”

print - cursor stays on the same line.

println - the cursor is moved to the next line.

<h2 style="color: orange">Commenting Code</h2>
<p>We can also write comments, notes to human readers of our code. These comments are not executed, so there’s no need for valid syntax within a comment.</p>

* When comments are short we use the single-line syntax: <b style="color: yellow"> // </b>
* When comments are long we use the multi-line syntax: <b style="color: yellow"> /* and */. </b>
* Javadoc comment which is represented by <b style="color: yellow"> /** and */ </b> Javadoc comments are used to create documentation for APIs (Application Programming Interfaces). When writing Javadoc comments, remember that they will eventually be used in the documentation that your users might read, so make sure to be especially thoughtful when writing these comments

<h2 style="color: orange">Compilation: Catching Errors</h2>
<p>Java is a compiled programming language, meaning the code we write in a .java file is transformed into byte code by a compiler before it is executed by the Java Virtual Machine on your computer</p>

![java.png](img/compiler.png)
The compiling process catches <b>mistakes</b> before the computer runs our code.

For example, with a file called Plankton.java, we could compile it with the terminal command:
```
javac Plankton.java
```

ls - this command lists all the available files.

A successful compilation produces a .class file: Plankton.class, that we execute with the terminal command: 

```
java Plankton
```

An unsuccessful compilation produces a list of <a href="https://www.codecademy.com/resources/docs/java/errors?page_ref=catalog">errors</a>. No .class file is made until the errors are corrected and the compile command is run again.
<h2 style="color: orange">Compilation: Creating Executables</h2>

```java

//within the file: Welcome.java
public class Welcome {
  public static void main(String[] args) {
    System.out.println("Welcome to Codecademy's Java course!");
  }
}
```
We have one file: Welcome.java. We compile with the command: 
```
javac Welcome.java
```
The terminal shows no errors, which indicates a successful compilation.

We now have two files:

   1. Welcome.java, our original file with Java syntax.
   2. Welcome.class, our compiled file with Java bytecode, ready to be executed by the Java Virtual Machine.

We can execute the compiled class with the command: 
```
java Welcome
```
Java Review: Putting It All Together

In this lesson, we’ve started writing our first programs in Java.

We’ve also learned rules and guidelines for how to write Java programs:

-----------------------------------------------    review     ----------------------------------------------------------

    Java programs have at least one class and one main() method.
       - Each class represents one real-world idea.
       - The main() method runs the tasks of the program.
    Java comments add helpful context to human readers.
    Java has whitespace, curly braces, and semicolons.
       - Whitespace is for humans to read code easily.
       - Curly braces mark the scope of a class and method.
       - Semicolons mark the end of a statement.
    Java is a compiled language.
       - Compiling catches mistakes in our code.
       - Compilers transform code into an executable class.


