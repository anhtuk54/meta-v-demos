SUMMARY = "Minimal boot requirements"
DESCRIPTION = "The minimal set of packages required to boot the system"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Distro can override
VIRTUAL-RUNTIME_rngd ?= "rng-tools"

RDEPENDS:${PN} = "\
    packagegroup-core-boot \
    ${VIRTUAL-RUNTIME_rngd} \
    dropbear \
    htop \
    vim \
    nano \
    rsync \
    gdbserver \
    usbip-tools \
    customization \
    ${@bb.utils.contains('DISTRO_FEATURES', 'sysvinit', 'dhclient', '', d)} \
"

RRECOMMENDS:${PN} = "\
    tzdata \
"