#!/bin/bash

# scripts are from mod_utils project on my GitHub.

ID='simplecobalt'
NAME='SimpleCobalt'
TOPDIR=`pwd`
PROJNAME=`basename $TOPDIR`
if [ $PROJNAME != $NAME ]; then
    echo "Running in wrong directory!"
    exit 1
fi

# blockstates
TARGETDIR=${TOPDIR}/src/main/resources/assets/${ID}/blockstates
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# make simple blockstates
gen_blockstate_jsons.py --type=simple cobalt_ore
gen_blockstate_jsons.py --type=simple deepslate_cobalt_ore
gen_blockstate_jsons.py --type=simple cobalt_block
gen_blockstate_jsons.py --type=simple raw_cobalt_block
gen_blockstate_jsons.py --type=simple blue_drift_steel_block
gen_blockstate_jsons.py --type=simple blue_celadon_block
gen_blockstate_jsons.py --type=simple green_celadon_block

# models
TARGETDIR=${TOPDIR}/src/main/resources/assets/${ID}/models
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# block models
gen_model_jsons.py --type=block cobalt_ore 
gen_model_jsons.py --type=block deepslate_cobalt_ore 
gen_model_jsons.py --type=block cobalt_block 
gen_model_jsons.py --type=block raw_cobalt_block 
gen_model_jsons.py --type=block blue_drift_steel_block 
gen_model_jsons.py --type=block blue_celadon_block 
gen_model_jsons.py --type=block green_celadon_block 

#inventory items
gen_model_jsons.py --type=inventory --item_only cobalt_ingot
gen_model_jsons.py --type=inventory --item_only raw_cobalt
gen_model_jsons.py --type=inventory --item_only cobalt_nugget
gen_model_jsons.py --type=inventory --item_only blue_drift_steel_ingot
gen_model_jsons.py --type=inventory --item_only blue_drift_steel_nugget
gen_model_jsons.py --type=inventory --item_only medium_blue_drift_steel_chunk
gen_model_jsons.py --type=inventory --item_only large_blue_drift_steel_chunk
gen_model_jsons.py --type=inventory --item_only blue_celadon_ingot
gen_model_jsons.py --type=inventory --item_only blue_celadon_nugget
gen_model_jsons.py --type=inventory --item_only medium_blue_celadon_chunk
gen_model_jsons.py --type=inventory --item_only large_blue_celadon_chunk
gen_model_jsons.py --type=inventory --item_only green_celadon_ingot
gen_model_jsons.py --type=inventory --item_only green_celadon_nugget
gen_model_jsons.py --type=inventory --item_only medium_green_celadon_chunk
gen_model_jsons.py --type=inventory --item_only large_green_celadon_chunk

# tools
gen_model_jsons.py --type=tool --item_only cobalt_sword
gen_model_jsons.py --type=tool --item_only cobalt_shovel
gen_model_jsons.py --type=tool --item_only cobalt_axe
gen_model_jsons.py --type=tool --item_only cobalt_pickaxe
gen_model_jsons.py --type=tool --item_only cobalt_hoe

gen_model_jsons.py --type=tool --item_only blue_drift_steel_sword
gen_model_jsons.py --type=tool --item_only blue_drift_steel_shovel
gen_model_jsons.py --type=tool --item_only blue_drift_steel_axe
gen_model_jsons.py --type=tool --item_only blue_drift_steel_pickaxe
gen_model_jsons.py --type=tool --item_only blue_drift_steel_hoe

gen_model_jsons.py --type=tool --item_only blue_celadon_sword
gen_model_jsons.py --type=tool --item_only blue_celadon_shovel
gen_model_jsons.py --type=tool --item_only blue_celadon_axe
gen_model_jsons.py --type=tool --item_only blue_celadon_pickaxe
gen_model_jsons.py --type=tool --item_only blue_celadon_hoe

gen_model_jsons.py --type=tool --item_only green_celadon_sword
gen_model_jsons.py --type=tool --item_only green_celadon_shovel
gen_model_jsons.py --type=tool --item_only green_celadon_axe
gen_model_jsons.py --type=tool --item_only green_celadon_pickaxe
gen_model_jsons.py --type=tool --item_only green_celadon_hoe

# armor sets
gen_model_jsons.py --type=armor --item_only cobalt_helmet
gen_model_jsons.py --type=armor --item_only cobalt_chestplate
gen_model_jsons.py --type=armor --item_only cobalt_leggings
gen_model_jsons.py --type=armor --item_only cobalt_boots

gen_model_jsons.py --type=armor --item_only blue_drift_steel_helmet
gen_model_jsons.py --type=armor --item_only blue_drift_steel_chestplate
gen_model_jsons.py --type=armor --item_only blue_drift_steel_leggings
gen_model_jsons.py --type=armor --item_only blue_drift_steel_boots

gen_model_jsons.py --type=armor --item_only blue_celadon_helmet
gen_model_jsons.py --type=armor --item_only blue_celadon_chestplate
gen_model_jsons.py --type=armor --item_only blue_celadon_leggings
gen_model_jsons.py --type=armor --item_only blue_celadon_boots

gen_model_jsons.py --type=armor --item_only green_celadon_helmet
gen_model_jsons.py --type=armor --item_only green_celadon_chestplate
gen_model_jsons.py --type=armor --item_only green_celadon_leggings
gen_model_jsons.py --type=armor --item_only green_celadon_boots
