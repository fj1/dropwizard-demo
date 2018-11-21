// this is convention, but you can name your package whatever
package org.javaproject.dropwizarddemo;

import io.dropwizard.Configuration;

import org.hibernate.validator.constraints.NotEmpty;

//  stores all the project settings and env settings
public class AppConfiguration extends Configuration {
  // @NotEmpty ensures the app does not start if appName is not defined
  @NotEmpty
  private String appName;

  public String getAppName() {
    return appName;
  }

  public void setAppName(final String appName) {
    this.appName = appName;
  }
}