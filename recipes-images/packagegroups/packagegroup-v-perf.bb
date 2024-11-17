SUMMARY = "Minimal boot requirements"
DESCRIPTION = "The minimal set of packages required to boot the system"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Distro can override
VIRTUAL-RUNTIME_rngd ?= "rng-tools"

RDEPENDS:${PN} = "\
    ${@bb.utils.contains('DISTRO_FEATURES', "systemd", "systemd-bootchart systemd-analyze", "", d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "sysvinit", "bootchart2 ", "", d)} \
"

RRECOMMENDS:${PN} = "\
"