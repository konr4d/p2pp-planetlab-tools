package pl.edu.pjwstk.mteam.pubsub.tests.tests.rules;

import java.util.Map;

public interface IRules {

    public Map<String,FieldRule> getFieldsRules();

    public boolean verifyField(String key, Object value);

}
