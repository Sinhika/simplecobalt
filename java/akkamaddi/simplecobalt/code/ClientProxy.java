package akkamaddi.simplecobalt.code;


public class ClientProxy extends akkamaddi.akkamaddiCore.api.ClientProxy
{
    @Override
    public void registerRenderers()
    {
        // This is for rendering entities and so forth later on
        //Armor Renderers
        SimpleCobaltCore.rendererCobalt = addArmor("cobalt");
        SimpleCobaltCore.rendererBlueDriftSteel = addArmor("bluedriftsteel");
        SimpleCobaltCore.rendererBlueCeladon = addArmor("blueceladon");
        SimpleCobaltCore.rendererGreenCeladon = addArmor("greenceladon");
    }

 
}