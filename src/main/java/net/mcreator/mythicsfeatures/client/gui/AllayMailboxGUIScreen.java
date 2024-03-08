package net.mcreator.mythicsfeatures.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mythicsfeatures.world.inventory.AllayMailboxGUIMenu;
import net.mcreator.mythicsfeatures.procedures.AllayMailBoxConditionProcedure;
import net.mcreator.mythicsfeatures.network.AllayMailboxGUIButtonMessage;
import net.mcreator.mythicsfeatures.MythicsFeaturesMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AllayMailboxGUIScreen extends AbstractContainerScreen<AllayMailboxGUIMenu> {
	private final static HashMap<String, Object> guistate = AllayMailboxGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_mail_button;

	public AllayMailboxGUIScreen(AllayMailboxGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mythics_features:textures/screens/allay_mailbox_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 76 && mouseX < leftPos + 100 && mouseY > topPos + 34 && mouseY < topPos + 58)
			guiGraphics.renderTooltip(font, Component.translatable("gui.mythics_features.allay_mailbox_gui.tooltip_send_mail_through_the_world_reno"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_mail_button = new ImageButton(this.leftPos + 77, this.topPos + 61, 22, 22, 0, 0, 22, new ResourceLocation("mythics_features:textures/screens/atlas/imagebutton_mail_button.png"), 22, 44, e -> {
			if (AllayMailBoxConditionProcedure.execute(world, x, y, z)) {
				MythicsFeaturesMod.PACKET_HANDLER.sendToServer(new AllayMailboxGUIButtonMessage(0, x, y, z));
				AllayMailboxGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (AllayMailBoxConditionProcedure.execute(world, x, y, z))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_mail_button", imagebutton_mail_button);
		this.addRenderableWidget(imagebutton_mail_button);
	}
}
