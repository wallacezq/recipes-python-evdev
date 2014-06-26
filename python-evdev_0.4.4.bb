DESCRIPTION = "Bindings for the linux input handling subsystem for Python"
SECTION = "devel/python"
LICENSE = "BSD-4-Clause"

S = "${WORKDIR}/evdev-${PV}"
LIC_FILES_CHKSUM = "file://LICENSE;md5=953636e33c8ce81f3c389dbcb4de6ee2"

PR = "r1"

SRC_URI = "https://pypi.python.org/packages/source/e/evdev/evdev-${PV}.tar.gz"
#S = "${WORKDIR}/python-evdev-${PV}"

inherit distutils

SRC_URI[md5sum] = "6a0bf72e48f44e49b52780777dd5da2c"
SRC_URI[sha256sum] = "45fa56fb876d1d65cae2bd6736265039bc1cc875aaf55f1e4aed67138ed41c0e"
