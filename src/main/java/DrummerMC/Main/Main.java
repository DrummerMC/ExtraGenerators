package DrummerMC.Main;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "extragenerators";
    public static final String VERSION = "@Version@";
    
    @Instance(MODID)
    public static Main instance;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		
        
    }
}
