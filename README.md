# LuxAndroidTest
Tests using Lux to build an Android app

### Building
* Unfortunately, I couldn't get the build working with the lein-lux plugin.
I had to modify the plugin to get it to build correctly with gradle and the support libraries. 

Included in the project is the custom lein-luxc jar file that needs to be used during the build phase. 

Building should be accomplished with
```
./gradlew installDebug
```
The lux compilation step should be performed after compiling any Java files in the project.
