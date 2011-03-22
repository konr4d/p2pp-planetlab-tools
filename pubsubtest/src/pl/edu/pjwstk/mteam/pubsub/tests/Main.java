package pl.edu.pjwstk.mteam.pubsub.tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import pl.edu.pjwstk.mteam.pubsub.tests.tests.BasicTest;
import pl.edu.pjwstk.mteam.pubsub.tests.tests.ITest;

import java.io.File;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Main {

    public static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(final String[] args) {

        PropertyConfigurator.configureAndWatch("./log4j.properties", 1000);

        Map<String,Object> kwargs = new Hashtable<String,Object>() {{
            put("nodeNumber", Integer.parseInt(args[0]));
            put("port", Integer.parseInt(args[1]));
            put("bootIP", args[2]);
            put("bootPort", Integer.parseInt(args[3]));
            put("serverReflexiveIP", args[2]);
            put("serverReflexivePort", Integer.parseInt(args[3]));
        }};

        ITest test = new BasicTest(kwargs);
        LOG.info(test.test());

    }
}
