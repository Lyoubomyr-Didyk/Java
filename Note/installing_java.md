<h1 style="color: lightgreen">How to Install Java on Ubuntu 22.04</h1>
<p>Java is a general-purpose and free-to-use programming language utilized for creating distributed and localized applications. This programming language is also used to develop computer, video, and mobile games. It assists in creating modern games that incorporate complex technology such as virtual reality and machine learning.</p>
<p>OpenJDK comprises separate packages for JDK and JRE for developing and running Java-based applications.</p>
– JRE: JRE or “Java Runtime Environment” creates an environment where Java-related files are executed. It is a software bundle that comprises JVM, Java Classloader, and libraries.

– JDK: JDK is an acronym for “Java Development Kit“, and it offers a software development environment for building Java applications.
<p></p>
<ul>
<li>Step 1: Update system repositories

```
$ sudo apt update
```
</li>
<li>Step 2: Install OpenJDK 18 on Ubuntu 22.04
<p>Based on your preferences, install OpenJDK or JRE on your system. Here is the command that assists in installing OpenJDK18 on Ubuntu 22.04:</p>

```
$ sudo apt install -y openjdk-18-jdk
```
</li>
<li>Step 3: Install OpenJDK18 JRE on Ubuntu 22.04
<p>In the other case, install OpenJDK 18 JRE by utilizing the following command:

```
$ sudo apt install -y openjdk-18-jre
```
</p>
</li>
</ul>

cmd ``` java -version ```


<h1 style="color: lightgreen">How to Install Intellij</h1>

- Download IDEA intellij  https://www.jetbrains.com/fr-fr/
- In terminal 
```
snap find intellij
```
- Then 
```
sudo snap install intellij-idea-ultimate --classic
```


