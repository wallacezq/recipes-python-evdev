python-evdev 0.4.4 for Yocto
============================

This is a python-evdev recipe created and tested on Intel Galileo.

Create a folder "python-evdev" under **[pathtoquarkbsp]**/*meta-clanton_vX.Y.Z/meta-clanton-distro/recipes-support* and copy over the recipe script (*python-evdev_0.4.4.bb*) into the folder.


To build :- 

Launch the Yocto command shell, and execute the following command:

```code
~$ bitbake python-evdev -c build
```

*Note: The python-evdev package will not be automatically installed, unless it is defined in the image recipe (* **[pathtobspdirectory]**/*meta-clanton_vX.Y.Z/meta-clanton-distro/recipes-core/images/image-spi.bb)*

As the build process will generate a python .egg. Alternatively, you may copy over the .egg file into your Intel Galileo target and use the following command to install it.

*Note: The .egg file is located in the folder*  **[your_yocto_working_dir]**/*tmp/work/i586-poky-linux-uclibc/python-evdev/0.4.4-r1/image/usr/lib/python2.7/site-packages/evdev-0.4.4-py2.7-linux-x86_64.egg*

```code
~$ unzip evdev-0.4.4-py2.7-linux-x86_64.egg -d /usr/lib/python2.7/site-packages
```

You may now use the python-evdev library in your python program on Intel Galileo.

A sample of interacting with a barcode reader is included under *example/*
