package pl.edu.pjwstk.mteam.pubsub.tests.tests.rules;

import org.apache.log4j.Logger;

import java.util.Hashtable;
import java.util.Map;

public class BasicTestRules extends TestRules {

    public BasicTestRules() {
        super(new Hashtable<String, FieldRule>() {{
            put("nodeNumber", new FieldRule("nodeNumber", "Number of the node launched", Integer.class));
            put("port", new FieldRule("port", "Node's port", Integer.class));
            put("bootIP", new FieldRule("bootIP", "Bootstrap server's IP address", String.class));
            put("bootPort", new FieldRule("bootPort", "Bootstrap server's port", Integer.class));
            put("serverReflexiveIP", new FieldRule("serverReflexiveIP", "Reflexive server's IP", String.class));
            put("serverReflexivePort", new FieldRule("serverReflexivePort", "Reflexive server's port", Integer.class));

        }});
    }

}
