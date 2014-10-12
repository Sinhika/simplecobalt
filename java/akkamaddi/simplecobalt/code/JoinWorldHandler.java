package akkamaddi.simplecobalt.code;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import akkamaddi.akkamaddiCore.api.AkkaJoinWorldHelper;

public class JoinWorldHandler extends AkkaJoinWorldHelper {

	@Override
	public void EquipMobs(EntityJoinWorldEvent event) {
		int range = random.nextInt(1, 73);
		EntityLiving living = (EntityLiving) event.entity;

		if (range == 1) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.cobaltChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.cobaltLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltSword));
		}

		if (range == 2) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
		}

		if (range == 3) {
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.cobaltChest));
		}

		if (range == 4) {
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.cobaltLegs));
		}

		if (range == 5) {
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
		}

		if (range == 6) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltSword));
		}

		if (range == 7) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltShovel));
		}

		if (range == 8) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltAxe));
		}

		if (range == 9) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltPickaxe));
		}

		if (range == 10) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltHoe));
		}

		if (range == 11) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.cobaltChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.cobaltLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltSword));
		}

		if (range == 12) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
		}

		if (range == 13) {
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.cobaltChest));
		}

		if (range == 14) {
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.cobaltLegs));
		}

		if (range == 15) {
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
		}

		if (range == 16) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltSword));
		}

		if (range == 17) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltShovel));
		}

		if (range == 18) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltAxe));
		}

		if (range == 19) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltPickaxe));
		}

		if (range == 20) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltHoe));
		}

		if (range == 21) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueCeladonHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.blueCeladonChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.blueCeladonLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueCeladonBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonSword));
		}

		if (range == 22) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueCeladonHelm));
		}

		if (range == 23) {
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.blueCeladonChest));
		}

		if (range == 24) {
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.blueCeladonLegs));
		}

		if (range == 25) {
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueCeladonBoots));
		}

		if (range == 26) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonSword));
		}

		if (range == 27) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonShovel));
		}

		if (range == 28) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonAxe));
		}

		if (range == 29) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonPickaxe));
		}

		if (range == 30) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonHoe));
		}

		if (range == 31) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.greenCeladonHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.greenCeladonChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.greenCeladonLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.greenCeladonBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonSword));
		}

		if (range == 32) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.greenCeladonHelm));
		}

		if (range == 33) {
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.greenCeladonChest));
		}

		if (range == 34) {
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.greenCeladonLegs));
		}

		if (range == 35) {
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.greenCeladonBoots));
		}

		if (range == 36) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonSword));
		}

		if (range == 37) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonShovel));
		}

		if (range == 38) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonAxe));
		}

		if (range == 39) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonPickaxe));
		}

		if (range == 40) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonHoe));
		}

		if (range == 41) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueDriftSteelHelm));
		}

		if (range == 42) {
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.blueDriftSteelChest));
		}

		if (range == 43) {
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.blueDriftSteelLegs));
		}

		if (range == 44) {
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueDriftSteelBoots));
		}

		if (range == 45) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelSword));
		}

		if (range == 46) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelShovel));
		}

		if (range == 47) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelAxe));
		}

		if (range == 48) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelPickaxe));
		}

		if (range == 49) {
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelHoe));
		}

		if (range == 50) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueDriftSteelHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.blueDriftSteelChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.blueDriftSteelLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueDriftSteelBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelSword));
		}

		if (range == 51) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.cobaltChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.cobaltLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltSword));
		}

		if (range == 52) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltPickaxe));
		}

		if (range == 53) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.cobaltChest));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltAxe));
		}

		if (range == 54) {
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.cobaltLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltShovel));
		}

		if (range == 55) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.cobaltHoe));
		}

		if (range == 56) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueDriftSteelHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.blueDriftSteelChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.blueDriftSteelLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueDriftSteelBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelSword));
		}

		if (range == 57) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueDriftSteelHelm));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueDriftSteelBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelPickaxe));
		}

		if (range == 58) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueDriftSteelHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.blueDriftSteelChest));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelAxe));
		}

		if (range == 59) {
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.blueDriftSteelLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueDriftSteelBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelShovel));
		}

		if (range == 60) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueDriftSteelHelm));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueDriftSteelBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelHoe));
		}

		if (range == 61) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueCeladonHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.blueCeladonChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.blueCeladonLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueCeladonBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonSword));
		}

		if (range == 62) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueCeladonHelm));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueCeladonBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonPickaxe));
		}

		if (range == 63) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueCeladonHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.blueCeladonChest));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonAxe));
		}

		if (range == 64) {
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.blueCeladonLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueCeladonBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonShovel));
		}

		if (range == 65) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.blueCeladonHelm));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.blueCeladonBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonHoe));
		}

		if (range == 66) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.greenCeladonHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.greenCeladonChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.greenCeladonLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.greenCeladonBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonSword));
		}

		if (range == 67) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.greenCeladonHelm));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.greenCeladonBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonPickaxe));
		}

		if (range == 68) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.greenCeladonHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.greenCeladonChest));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonAxe));
		}

		if (range == 69) {
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.greenCeladonLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.greenCeladonBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonShovel));
		}

		if (range == 70) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.greenCeladonHelm));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.greenCeladonBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonHoe));
		}

		if (range == 71) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.cobaltChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.cobaltLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueDriftSteelSword));
		}

		if (range == 72) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.cobaltChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.cobaltLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.blueCeladonSword));
		}

		if (range == 73) {
			living.setCurrentItemOrArmor(4, new ItemStack(
					SimpleCobaltCore.cobaltHelm));
			living.setCurrentItemOrArmor(3, new ItemStack(
					SimpleCobaltCore.cobaltChest));
			living.setCurrentItemOrArmor(2, new ItemStack(
					SimpleCobaltCore.cobaltLegs));
			living.setCurrentItemOrArmor(1, new ItemStack(
					SimpleCobaltCore.cobaltBoots));
			living.setCurrentItemOrArmor(0, new ItemStack(
					SimpleCobaltCore.greenCeladonSword));
		}
	} // end EquipMobs()
} // end class JoinWorldHandler
