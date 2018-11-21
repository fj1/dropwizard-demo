package org.javaproject.dropwizarddemo;
// aligns with the CleanCodeApplication.java in the tutorial

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// this class:
//   - starts the web server
//   - uses the Configuration class
//   - is the main entry point to the app
public class DropwizardApplication extends Application<AppConfiguration> {
  public static final Logger LOGGER = LoggerFactory.getLogger(DropwizardApplication.class);

  public static void main(final String[] args) throws Exception {
    new DropwizardApplication().run(args);
  }

  @Override
  public void run(final AppConfiguration configuration, final Environment environment) throws Exception {
    LOGGER.info("Application name: {}", configuration.getAppName());
    MyResource resource = new MyResource();
    environment.jersey().register(resource);
  }
}