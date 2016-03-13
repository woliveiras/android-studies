# Install Oracle JDK on Ubuntu

## Download

Get the jkd on [download](http://www.oracle.com/technetwork/java/javase/downloads/index.html) area of Oracle's site.

Uncompress files with the `tar` command:

```
tar -xvf file.tar.gz
```

## Moving the JDK uncompressed files to `usr/lib`

```
sudo mkdir -p /usr/lib/jvm
sudo mv ./jdkx.x.x /usr/lib/jvm/
```

## Set JDK

Run in sequence:

```
sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdkx.x.x/bin/java" 1
sudo update-alternatives --install "/usr/bin/javac" "javac" "/usr/lib/jvm/jdkx.x.x/bin/javac" 1
sudo update-alternatives --install "/usr/bin/javaws" "javaws" "/usr/lib/jvm/jdkx.x.x/bin/javaws" 1
```

Atribute permissions:

```
sudo chmod a+x /usr/bin/java
sudo chmod a+x /usr/bin/javac
sudo chmod a+x /usr/bin/javaws
sudo chown -R root:root /usr/lib/jvm/jdkx.x.x
```

And change default version if you have other versions on your System.

Run in sequence:

```
sudo update-alternatives --config java
```

Select the correct version:

```
There are 3 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                            Priority   Status
------------------------------------------------------------
  0            /usr/lib/jvm/java-7-openjdk-amd64/jre/bin/java   1071      auto mode
  1            /usr/lib/jvm/java-7-openjdk-amd64/jre/bin/java   1071      manual mode
* 2            /usr/lib/jvm/jdk1.7.0/bin/java                   1         manual mode
  3            /usr/lib/jvm/jdk1.8.0/bin/java                   1         manual mode

Press enter to keep the current choice[*], or type selection number: 
```

And repeat to:

```
sudo update-alternatives --config javac
sudo update-alternatives --config javaws
```

Check the instalation:

```
java -version
```

[Reference](http://askubuntu.com/questions/56104/how-can-i-install-sun-oracles-proprietary-java-jdk-6-7-8-or-jre)
