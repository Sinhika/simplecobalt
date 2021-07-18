package mod.akkamaddi.simplecobalt.loot;

import mod.alexndr.simplecorelib.helpers.InjectionTableLookup;

@SuppressWarnings("serial")
public class SimpleCobaltInjectionLookup extends InjectionTableLookup
{

    public SimpleCobaltInjectionLookup()
    {
        super();
        AddDungeonAliases();
        AddStrongholdAliases();
        AddOceanAliases();
        this.put("abandoned_mineshaft", "abandoned_mineshaft");
    }

} // end class
