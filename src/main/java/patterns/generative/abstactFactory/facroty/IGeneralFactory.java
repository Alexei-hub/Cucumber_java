package patterns.generative.abstactFactory.facroty;

import patterns.generative.abstactFactory.env.IEnvironment;
import patterns.generative.factory.IBrowser;

public interface IGeneralFactory {

    IBrowser initBrowser(String browser);
    IEnvironment initEnv(String env);

}
