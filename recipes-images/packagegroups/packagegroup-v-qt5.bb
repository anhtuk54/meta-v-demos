SUMMARY = "Qt6 Framework"
DESCRIPTION = "The set of Qt5 packages"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Distro can override
PACKAGES += "\
    qtbase \
    qtcharts \
    qtconnectivity \
    qtdatavis3d \
    qtdeclarative \
    qtgraphicaleffects \
    qtimageformats \
    qtlocation \
    qtlottie \
    qtmqtt \
    qtmultimedia \
    qtnetworkauth \
    qtpdf \
    qtpurchasing \
    qtquick3d \
    qtquickcontrols2 \
    qtquickcontrols \
    qtquicktimeline \
    qtremoteobjects \
    qtscript \
    qtscxml \
    qtsensors \
    qtserialbus \
    qtserialport \
    qtsvg \
    qtsystems \
    qttools \
    qttranslations \
    qtvirtualkeyboard \
    qtwayland \
    qtwebsockets \
    qtx11extras \
    qtxmlpatterns \
"

RRECOMMENDS:${PN} = "\
"