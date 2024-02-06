package com.aivruu.homes;

import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;

public final class HomesPlugin extends JavaPlugin {
  private Logger logger;

  @Override
  public void onLoad() {
    Provider.load(this);
    this.logger = getComponentLogger();
    this.logger.info("Loading Paper plugin template");
  }

  @SuppressWarnings("UnstableApiUsage")
  @Override
  public void onEnable() {
    this.logger.info("Enabling Paper plugin template");
  }

  @Override
  public void onDisable() {
    this.logger.info("Disabling Paper plugin template");
  }
}
