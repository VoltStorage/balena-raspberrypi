FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

LINUX_VERSION = "5.10.120"

SRCREV = "raspberrypi-kernel_1%9.20220728-5.10.120+revpi1"
SRC_URI = " \
	git://github.com/RevolutionPi/linux;protocol=https;branch=revpi-5.10 \
"

require recipes-kernel/linux/linux-raspberrypi.inc

SRC_URI:remove = "file://rpi-kernel-misc.cfg"

SRC_URI:append = " \
    file://scripts-Fix-kernel-module-headers-build-in-Honister.patch \
    file://0001-rtc-hctosys-Correctly-guard-hw-clock-polling-code.patch \
"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"