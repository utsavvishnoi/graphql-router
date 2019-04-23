package com.mulesoft.services.graphql.api;

import java.util.List;
import java.util.Map;
import graphql.language.Field;

public interface GraphqlWiringAttributes {
    /**
     * Returns the source object that originated this mapping.
     * @return
     */
    Object getSource();

    /**
     * Returns the arguments passed to the query.
     * @return
     */
    Map<String, Object> getArguments();

    /**
     * Returns the fields passed to the query.
     * @return
     */
    public Map<String, List<Field>> getFields();
}
