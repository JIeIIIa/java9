#!/usr/bin/env bash
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/
rm -rf out/jre
/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/jlink \
	--module-path $JAVA_HOME/jmods:out/production \
	--add-modules com.ra.jokeapp.ui \
	--launcher JOKER=com.ra.jokeapp.ui/com.ra.jokeapp.ui.Main \
	--output out/jre
