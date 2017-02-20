# OpenVR wrappers, JVM flavour

Based on @phr00t's [jMonkeyVR](https://github.com/phr00t/jMonkeyVR/). Thanks for the awesome work!

[![Build Status](https://travis-ci.org/scenerygraphics/jopenvr.svg?branch=master)](https://travis-ci.org/skalarproduktraum/scenery-openvr) [![Build status](https://ci.appveyor.com/api/projects/status/bnvb239yd8x4vqqa/branch/master?svg=true)](https://ci.appveyor.com/project/skalarproduktraum/scenery-openvr/branch/master) 

# Compiling

```
git clone --recursive https://github.com/scenerygraphics/jopenvr
mvn clean package install
```

# Usage

## Maven

```
<dependency>
    <groupId>graphics.scenery</groupId>
    <artifactId>jopenvr</artifactId>
    <version>1.0.5-1</version>
</dependency>
```

This requires to have the ImageJ Maven repo added, where this package is currently published:

```
<repositories>
  <repository>
    <id>imagej.public</id>
    <url>http://maven.imagej.net/content/groups/public</url>
  </repository>
</repositories>
```

## Usage example

For an example how to use this library, see [scenery's OpenVRHMDInput](https://github.com/ClearVolume/scenery/blob/openvr-1.0.5/src/main/kotlin/graphics/scenery/controls/OpenVRHMDInput.kt).