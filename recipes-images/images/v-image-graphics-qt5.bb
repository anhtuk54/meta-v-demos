require v-image-core-boot.bb

IMAGE_FEATURES += "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston', '', d)} \
"

IMAGE_INSTALL:append = " \
    packagegroup-v-perf \
    packagegroup-v-auto \
    packagegroup-v-qt5 \
"

inherit populate_sdk populate_sdk_qt5

# Task do_populate_sdk and do_rootfs can't be exec simultaneously.
# Both exec "createrepo" on the same directory, and so one of them
# can failed (randomly).
#addtask do_populate_sdk after do_rootfs