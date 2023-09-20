HELLO! BOOT0 is starting!
boot0 version : 3.0.0
dram size =256
current block is 2 and last block is 10.
current block is 3 and last block is 10.
current block is 4 and last block is 10.
current block is 5 and last block is 10.
current block is 6 and last block is 10.
current block is 7 and last block is 10.
sum=0xeb41dcab
src_sum=0xeb41dcab
The file stored in start block 2 is perfect.
Ready to disable icache.
Jump to secend Boot.
[      0.175]

U-Boot 2011.09-rc1 (Apr 02 2018 - 11:17:04) Retro Games Ltd

[      0.182]version: 1.1.0
[      0.185]pmbus:   ready
[      0.290]PMU: AXP209
[      0.293]PMU: AXP20x found
[      0.296]PMU: bat ratio = 100
[      0.299]after set, dcdc2 =1400mv
[      0.303]PMU: dcdc2 1400
[      0.305]PMU: pll1 912 Mhz
boot_clock = 912
dcdc2_vol = 1400
[      0.313]after set, dcdc2 =1400mv
dcdc3_vol = 1250
ldo2_vol = 3000
ldo3_vol = 2800
ldo4_vol = 2800
power_start = 0
storage_type = -1
find power_sply to end
fel key old mode
run key detect
no key found
no key input
dram_para_set start
dram_para_set end
[      0.348]DRAM:  256 MiB
relocation Offset is: 05b19000
user_gpio config
user_gpio ok
DRV_DISP_Init: opened
[      0.588]fetch script data boot_disp.output_type fail
[      0.593]fetch script data boot_disp.output_mode fail
[      0.598]fetch script data boot_disp.auto_hpd fail
[      0.603]lcd0_para.lcd_used=0
workmode = 0
[      0.608]NAND: NAND_UbootInit
NAND_UbootInit start
NB1 : enter NAND_LogicInit
nand : get id_number_ctl fail, d0000
nand : get CapacityLevel fail, 4fb9e371
not burn nand partition table!
NB1 : nftl num: 1
 init nftl: 0
NB1 : NAND_LogicInit ok, result = 0x0
[      0.798]sunxi flash init ok
fail to find part named env
Using default environment

In:    serial
Out:   serial
Err:   serial
--------fastboot partitions--------
-total partitions:3-
-name-        -start-       -size-
boot        : 1000000       1000000
rootfs      : 2000000       7000000
UDISK       : 9000000       0
-----------------------------------
base bootcmd=run setargs_nand boot_normal
bootcmd set setargs_nand
key 0
recovery key high 6, low 4
cant find fstbt value
no misc partition is found
to be run cmd=run setargs_nand boot_normal
the part isn't exist
board_status_probe
[      0.855]pre sys mode
[      0.857]Hit any key to stop autoboot:  0
read boot or recovery all
[      1.361]sunxi flash read :offset 1000000, 11549374 bytes OK
[      1.376]ready to boot
[      1.379][mmc]: MMC Device 2 not found
[      1.383][mmc]:  mmc  not find,so not exit
NAND_UbootExit
NB1 : NAND_LogicExit
[      1.387]
Starting kernel ...

[    1.061052] [hdmi]hdmi module init
[    1.066268] ##fb init:w=1280,h=720,fbmode=0
root=/dev/nandb
insmod nand.ko return 0
e2fsck /dev/nandb return 0
mount /dev/nandb return 0

RedQuark One
redquarkone login:
