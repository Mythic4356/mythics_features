
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicsfeatures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mythicsfeatures.world.inventory.AllayMailboxGUIMenu;
import net.mcreator.mythicsfeatures.MythicsFeaturesMod;

public class MythicsFeaturesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MythicsFeaturesMod.MODID);
	public static final RegistryObject<MenuType<AllayMailboxGUIMenu>> ALLAY_MAILBOX_GUI = REGISTRY.register("allay_mailbox_gui", () -> IForgeMenuType.create(AllayMailboxGUIMenu::new));
}
