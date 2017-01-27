#!/bin/sh
echo "Running JNAerator..."
java -jar ./jnaerator-0.12-shaded.jar \
	-arch win64 openvr/bin/win64/openvr_api.dll \
	-arch win32 openvr/bin/win32/openvr_api.dll \
	-arch linux_x64 openvr/bin/linux64/libopenvr_api.so \
	-arch darwin_universal openvr/bin/osx32/libopenvr_api.dylib \
	openvr/headers/openvr_capi.h \
	-mode Directory -runtime JNAerator \
	-package graphics.scenery.jopenvr -entryClass JOpenVRLibrary \
	-noComments -rootPackage graphics.scenery.jopenvr -direct -o tmp/ -f

echo "Copying files..."
