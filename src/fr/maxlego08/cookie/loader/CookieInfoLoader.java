package fr.maxlego08.cookie.loader;

import fr.maxlego08.cookie.CookiePlugin;
import fr.maxlego08.cookie.CookieUpgrade;
import fr.maxlego08.cookie.buttons.CookieInfoButton;
import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.button.DefaultButtonValue;
import fr.maxlego08.menu.api.loader.ButtonLoader;
import org.bukkit.configuration.file.YamlConfiguration;

public class CookieInfoLoader extends ButtonLoader {

    private final CookiePlugin plugin;

    public CookieInfoLoader(CookiePlugin plugin) {
        super(plugin, "ZCOOKIECLICKER_INFO");
        this.plugin = plugin;
    }

    @Override
    public Button load(YamlConfiguration configuration, String path, DefaultButtonValue defaultButtonValue) {

        CookieUpgrade cookieUpgrade = CookieUpgrade.valueOf(configuration.getString(path + "upgrade", "").toUpperCase());

        return new CookieInfoButton(this.plugin, cookieUpgrade);
    }
}
