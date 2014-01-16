package DannysMod.Proxies;

//import DannysMod.Mobs.EntityGhoul;
//import DannysMod.Mobs.ModelGhoul;
//import DannysMod.Mobs.RenderGhoul;
  import net.minecraft.client.renderer.entity.RenderCow;

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
}
