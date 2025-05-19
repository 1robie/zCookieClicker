package fr.maxlego08.cookie.loader;

import fr.maxlego08.cookie.CookiePlugin;
import fr.maxlego08.cookie.CookieUpgrade;
import fr.maxlego08.cookie.buttons.CookiePurchaseButton;
import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.button.DefaultButtonValue;
import fr.maxlego08.menu.api.loader.ButtonLoader;
import org.bukkit.configuration.file.YamlConfiguration;

public class CookiePurchaseLoader extends ButtonLoader {

    private final CookiePlugin plugin;

    public CookiePurchaseLoader(CookiePlugin plugin) {
        super(plugin, "ZCOOKIECLICKER_UPGRADE");
        this.plugin = plugin;
    }

    @Override
    public Button load(YamlConfiguration configuration, String path, DefaultButtonValue defaultButtonValue) {

        CookieUpgrade cookieUpgrade = CookieUpgrade.valueOf(configuration.getString(path + "upgrade", "").toUpperCase());

        return new CookiePurchaseButton(this.plugin, cookieUpgrade);
    }
}
