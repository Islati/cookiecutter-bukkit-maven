package {{cookiecutter.main_package}};

import org.bukkit.plugin.java.JavaPlugin;

public class {{cookiecutter.main_class}} extends JavaPlugin {
    private static {{cookiecutter.main_class}} instance = null;

    public static {{cookiecutter.main_class}} getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        instance = this;
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
