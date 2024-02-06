package io.github._4drian3d;

import com.google.inject.Inject;
import com.velocitypowered.api.command.CommandManager;
import com.velocitypowered.api.event.EventManager;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.PluginManager;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

import java.nio.file.Path;

@Plugin(
	  id = "velocity-plugin-template",
	  name = "VelocityPluginTemplate",
	  description = "A Velocity Plugin Template",
	  version = Constants.VERSION,
	  authors = { "Qekly" }
)
public final class VelocityPlugin {
	@Inject
	private Logger logger;
	@Inject
	@DataDirectory
	private Path pluginFolder;
	@Inject
	private Injector injector;
	
	@Subscribe
	void onProxyInitialization(final ProxyInitializeEvent event) {
		logger.info("Stating Velocity plugin template");
    
		injector = injector.createChildInjector(new MainModule());
	}
}
