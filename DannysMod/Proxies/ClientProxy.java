package DannysMod.Proxies;

//import DannysMod.Mobs.EntityGhoul;
//import DannysMod.Mobs.ModelGhoul;
//import DannysMod.Mobs.RenderGhoul;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.client.renderer.texture.TextureObject;
import net.minecraft.util.ResourceLocation;
//import DannysMod.Items.Rifles.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void init() {
		// RenderingRegistry.registerEntityRenderingHandler(EntityplasmaBullet.class, new RenderplasmaBullet());
	}
	public void registerRenderInformation() {

	} 

	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	public static void addModerCapes() {

		String capeURL = "http://i.imgur.com/sZ6wSBh.png";
		String[] devs = {"DannyDobbi23"};

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

			Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
	}

}