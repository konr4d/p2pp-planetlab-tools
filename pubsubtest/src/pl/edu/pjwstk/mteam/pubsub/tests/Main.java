package pl.edu.pjwstk.mteam.pubsub.tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import pl.edu.pjwstk.mteam.pubsub.tests.tests.p2ppbasic.P2ppBasicTest;
import pl.edu.pjwstk.mteam.pubsub.tests.tests.pubsubbasic.PubsubBasicTest;
import pl.edu.pjwstk.mteam.pubsub.tests.tests.ITest;

import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(final String[] args) {

        PropertyConfigurator.configureAndWatch("./log4j.properties", 1000);

        String whichTest = args[0];

        ITest test = null;

        if ("pubsubbasic".equals(whichTest)) {

            Map<String,Object> kwargs = new Hashtable<String,Object>() {{
                put("nodeNumber", Integer.parseInt(args[1]));
                put("port", Integer.parseInt(args[2]));
                put("bootIP", args[3]);
                put("bootPort", Integer.parseInt(args[4]));
                put("serverReflexiveIP", args[3]);
                put("serverReflexivePort", Integer.parseInt(args[4]));
            }};

            test = new PubsubBasicTest(kwargs);

        } else if ("p2ppbasic".equals(whichTest)) {

            Map<String,Object> kwargs = new Hashtable<String,Object>() {{
                put("nodeNumber", Integer.parseInt(args[1]));
                put("port", Integer.parseInt(args[2]));
                put("bootIP", args[3]);
                put("bootPort", Integer.parseInt(args[4]));
                /*put("serverReflexiveIP", args[3]);
                put("serverReflexivePort", Integer.parseInt(args[4]));*/
                put("overlayId", args[5]);
            }};

            test = new P2ppBasicTest(kwargs);

        }

        if (test != null) {

            LOG.info(test.test());

        } else {

            LOG.info("Unsupported test: " + whichTest);

        }

    }
}
